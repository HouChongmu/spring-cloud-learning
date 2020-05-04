package com.yolyn.cloud.config;

import com.yolyn.cloud.OrderMain;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Yolyn
 * @version 1.0
 * @date 2020/5/3 10:45
 * @project springcloud-2020
 */
@Configuration
@ComponentScan(basePackageClasses = {OrderMain.class})
public class ApplicaitonContextConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
