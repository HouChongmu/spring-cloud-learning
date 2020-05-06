package com.yolyn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Yolyn
 * @version 1.0
 * @date 2020/5/6 17:31
 * @project springcloud-2020
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientBoot {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientBoot.class,args);
    }
}
