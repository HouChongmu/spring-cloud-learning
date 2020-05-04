package com.yolyn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = {PaymentMainBoot8001.class})
@EnableEurekaClient
public class PaymentMainBoot8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMainBoot8001.class,args);
    }
}
