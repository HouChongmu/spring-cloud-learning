package com.yolyn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Yolyn
 * @version 1.0
 * @date 2020/5/6 17:11
 * @project springcloud-2020
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigCenterBoot3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterBoot3344.class,args);
    }
}
