package com.yolyn.ribbonrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yolyn
 * @version 1.0
 * @date 2020/5/4 21:47
 * @project springcloud-2020
 */
@Configuration
public class MyRibbonRule {
    @Bean
    public IRule getMyRule(){
        return new RandomRule();//随机
    }
}
