package com.yolyn.springcloud.service.impl;

import com.yolyn.springcloud.dao.PaymentDao8004;
import com.yolyn.springcloud.entities.Payment;
import com.yolyn.springcloud.service.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Yolyn
 * @version 1.0
 * @date 2020/5/2 17:23
 * @project springcloud-2020
 */
@Service
public class PaymentServiceImpl implements IPaymentService {
    @Autowired
    private PaymentDao8004 paymentDao8004;

    @Override
    public int create(Payment payment) {
        return paymentDao8004.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao8004.getPaymentById(id);
    }
}
