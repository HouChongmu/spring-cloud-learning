package com.yolyn.springcloud.service;

import com.yolyn.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Yolyn
 * @version 1.0
 * @date 2020/5/2 17:21
 * @project springcloud-2020
 */
public interface IPaymentService {
    int create(Payment payment);
    Payment getPaymentById(@Param("id") Long id);
}
