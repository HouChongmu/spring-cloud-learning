package com.yolyn.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author Yolyn
 * @version 1.0
 * @date 2020/5/5 14:14
 * @project springcloud-2020
 */
public interface LoadBalancer {
    ServiceInstance getInstance(List<ServiceInstance> serviceInstanceList);
}
