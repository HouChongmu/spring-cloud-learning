package com.yolyn.springcloud.controller;

import com.yolyn.springcloud.lb.LoadBalancer;
import com.yolyn.springcloud.entities.Payment;
import com.yolyn.springcloud.entities.ResultModel;
import com.yolyn.springcloud.enums.CommonRespEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

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
    @Autowired
    private LoadBalancer loadBalancer;
    @Autowired
    private DiscoveryClient discoveryClient;

    public static final String PAYMENT_URL = "http://springcloud-payment-service";

    @GetMapping("/consumer/payment/create")
    public ResultModel<Payment> create(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, ResultModel.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public ResultModel<Payment> getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, ResultModel.class);
    }

    /**
     * 用RestTemplate获取响应头信息
     *
     * @param id
     * @return
     */
    @GetMapping("/consumer/paymentEntity/get/{id}")
    public ResultModel<Payment> getPaymentEntity(@PathVariable("id") Long id) {
        ResponseEntity<ResultModel> entity = restTemplate.getForEntity(PAYMENT_URL + "/payment/get/" + id, ResultModel.class);
        if (entity.getStatusCode().is2xxSuccessful()) {
            return entity.getBody();
        } else {
            return new ResultModel<>(CommonRespEnum.COMMON_FAIL);
        }
    }

    @GetMapping("/consumer/payment/lbService")
    public ResultModel getPaymentLbService() {
        List<ServiceInstance> instanceList = discoveryClient.getInstances("springcloud-payment-service");
        if (null == instanceList || instanceList.size() <= 0) {
            return null;
        }
        return new ResultModel().setSuccess(loadBalancer.getInstance(instanceList).getMetadata());
    }
    // ====================> zipkin+sleuth
    @GetMapping("/consumer/payment/zipkin")
    public String paymentZipkin()
    {
        String result = restTemplate.getForObject("http://localhost:8001"+"/payment/zipkin/", String.class);
        return result;
    }
}
