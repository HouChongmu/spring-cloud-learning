package com.yolyn.springcloud.service;

import com.yolyn.springcloud.entities.Payment;
import com.yolyn.springcloud.entities.ResultModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Yolyn
 * @version 1.0
 * @date 2020/5/5 15:52
 * @project springcloud-2020
 */
@Component
@FeignClient(value = "SPRINGCLOUD-PAYMENT-SERVICE")
public interface IPaymentFeignService {
    @GetMapping("/payment/get/{id}")
    ResultModel getPaymentById(@PathVariable("id") Long id);
}
