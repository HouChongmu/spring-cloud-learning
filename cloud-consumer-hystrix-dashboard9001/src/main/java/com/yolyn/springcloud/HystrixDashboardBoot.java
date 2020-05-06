package com.yolyn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author Yolyn
 * @version 1.0
 * @date 2020/5/6 11:22
 * @project springcloud-2020
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardBoot {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardBoot.class, args);
    }
}
