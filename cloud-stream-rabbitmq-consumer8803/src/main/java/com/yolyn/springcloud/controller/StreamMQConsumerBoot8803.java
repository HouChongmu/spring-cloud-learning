package com.yolyn.springcloud.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Yolyn
 * @version 1.0
 * @date 2020/5/7 11:32
 * @project springcloud-2020
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamMQConsumerBoot8803 {
    public static void main(String[] args)
    {
        SpringApplication.run(StreamMQConsumerBoot8803.class,args);
    }

}
