package com.yolyn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Yolyn
 * @version 1.0
 * @date 2020/5/7 10:39
 * @project springcloud-2020
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamMQProviderBoot8801 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMQProviderBoot8801.class, args);
    }
}
