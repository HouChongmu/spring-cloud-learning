package com.yolyn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = {PaymentMainBoot.class})
public class PaymentMainBoot {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMainBoot.class,args);
    }
}
