package com.yolyn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = {PaymentMainBoot.class})
@EnableDiscoveryClient //该注解用于向使用consul或者zk作为注册中心时注册服务
public class PaymentMainBoot {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMainBoot.class,args);
    }
}
