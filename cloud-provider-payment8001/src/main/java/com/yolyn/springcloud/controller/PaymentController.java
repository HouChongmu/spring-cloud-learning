package com.yolyn.springcloud.controller;

import com.yolyn.springcloud.entities.Payment;
import com.yolyn.springcloud.entities.ResultModel;
import com.yolyn.springcloud.enums.CommonRespEnum;
import com.yolyn.springcloud.service.IPaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Yolyn
 * @version 1.0
 * @date 2020/5/2 17:26
 * @project springcloud-2020
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private IPaymentService paymentService;

    @PostMapping("/payment/create")
    public ResultModel create(Payment payment) {
        int id = paymentService.create(payment);
        if (id > 0) {
            return new ResultModel<>(CommonRespEnum.COMMON_SUCCESS, id);
        } else {
            return new ResultModel(CommonRespEnum.COMMON_FAIL);
        }
    }

    @GetMapping("/payment/get/{id}")
    public ResultModel<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);

        if (payment != null) {
            return new ResultModel<>(CommonRespEnum.COMMON_SUCCESS, payment);
        } else {
            return new ResultModel<>(CommonRespEnum.COMMON_FAIL);
        }
    }
}
