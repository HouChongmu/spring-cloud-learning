package com.yolyn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = {PaymentMainBoot.class})
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentMainBoot {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMainBoot.class,args);
    }
}
