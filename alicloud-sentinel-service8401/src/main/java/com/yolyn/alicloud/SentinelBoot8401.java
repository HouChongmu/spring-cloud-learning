package com.yolyn.alicloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Yolyn
 * @version 1.0
 * @date 2020/5/10 15:28
 * @project springcloud-2020
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelBoot8401 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelBoot8401.class, args);
    }

}
