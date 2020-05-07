package com.yolyn.alicloud.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Yolyn
 * @version 1.0
 * @date 2020/5/7 17:16
 * @project springcloud-2020
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AliPaymentBoot9001 {
    public static void main(String[] args) {
        SpringApplication.run(AliPaymentBoot9001.class, args);
    }

}

