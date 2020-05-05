package com.yolyn.cloud.controller;

import com.yolyn.springcloud.entities.Payment;
import com.yolyn.springcloud.entities.ResultModel;
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
    private RestTemplate restTemplate;
    public static final String PAYMENT_URL = "http://cloud-provider-payment";

    @GetMapping("/zkconsumer/payment/create")
    public ResultModel<Payment> create(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/zk/create", payment, ResultModel.class);
    }
    @GetMapping("/zkconsumer/payment/get/{id}")
    public ResultModel<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/zk/get/"+id,ResultModel.class);
    }
}
