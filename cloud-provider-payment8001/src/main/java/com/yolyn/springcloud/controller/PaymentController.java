package com.yolyn.springcloud.controller;

import com.yolyn.springcloud.service.IPaymentService;
import com.yolyn.springcloud.entities.Payment;
import com.yolyn.springcloud.entities.ResultModel;
import com.yolyn.springcloud.enums.CommonRespEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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
    @Value("${server.port}")
    private String serverPort;
    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/payment/create")
    public ResultModel create(@RequestBody Payment payment) {
        int id = paymentService.create(payment);
        if (id > 0) {
            return new ResultModel<>(CommonRespEnum.COMMON_SUCCESS, id + ",port:" + serverPort);
        } else {
            System.out.println("");
            return new ResultModel(CommonRespEnum.COMMON_FAIL);
        }
    }

    @GetMapping("/payment/get/{id}")
    public ResultModel<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);

        if (payment != null) {
            return new ResultModel(CommonRespEnum.COMMON_SUCCESS, payment.toString() + ",port:" + serverPort);
        } else {
            return new ResultModel<>(CommonRespEnum.COMMON_FAIL);
        }
    }

    @GetMapping("/payment/discovery")
    public ResultModel discoveryService() {
        StringBuilder sb=new StringBuilder();
       List<String> services= discoveryClient.getServices();
       for (String s:services){
         List<ServiceInstance> instanceList=  discoveryClient.getInstances(s);
         for (ServiceInstance si:instanceList){
             sb.append("serviceID:"+si.getServiceId()+",instanceID:"+si.getInstanceId()+",port:"+si.getPort());
         }
       }
       return new ResultModel(CommonRespEnum.COMMON_SUCCESS,sb);
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }


}
