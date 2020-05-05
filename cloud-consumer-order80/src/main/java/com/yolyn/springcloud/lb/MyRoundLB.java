package com.yolyn.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Yolyn
 * @version 1.0
 * @date 2020/5/5 14:15
 * @project springcloud-2020
 */
@Component
public class MyRoundLB implements LoadBalancer {
    private AtomicInteger invokeTimes = new AtomicInteger(0);

    public final int getAndIncrement() {
        int current, next;
        do {
            current = this.invokeTimes.get();
            next = current >= Integer.MAX_VALUE ? 0 : current + 1;//防止调用次数过多
        } while (!this.invokeTimes.compareAndSet(current, next));
        return next;
    }

    @Override
    public ServiceInstance getInstance(List<ServiceInstance> serviceInstanceList) {
       int index= getAndIncrement()%serviceInstanceList.size();
        return serviceInstanceList.get(index);
    }
}
