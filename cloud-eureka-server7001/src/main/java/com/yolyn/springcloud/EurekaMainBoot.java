package com.yolyn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Yolyn
 * @version 1.0
 * @date 2020/5/3 15:56
 * @project springcloud-2020
 */
@SpringBootApplication
@EnableEurekaServer //该服务为注册中心
public class EurekaMainBoot {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMainBoot.class,args);
    }
}
