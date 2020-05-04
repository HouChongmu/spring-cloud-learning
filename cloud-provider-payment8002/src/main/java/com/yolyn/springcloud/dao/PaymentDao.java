package com.yolyn.springcloud.dao;

import com.yolyn.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Yolyn
 * @version 1.0
 * @date 2020/5/2 17:05
 * @project springcloud-2020
 */
//一样的效果，但是Mapper是MyBatis官方提供的
@Mapper
public interface PaymentDao {
    int create(Payment payment);
    Payment getPaymentById(@Param("id") Long id);
}

