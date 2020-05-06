package com.yolyn.springcloud.controller;

import com.yolyn.springcloud.entities.Payment;
import com.yolyn.springcloud.entities.ResultModel;
import com.yolyn.springcloud.service.IPaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Yolyn
 * @version 1.0
 * @date 2020/5/3 10:41
 * @project springcloud-2020
 */
@Slf4j
@RestController
public class OrderController {
    @Autowired
    private IPaymentFeignService service;

    @GetMapping("/feignconsumer/payment/get/{id}")
    public ResultModel getPayment(@PathVariable("id") Long id){
        return service.getPaymentById(id);
    }
}
