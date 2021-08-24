package com.zq.springboot.cloud.dao;

import com.zq.springboot.cloud.emit.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 曾权
 * @create 2021-08-18-18:19
 */
@Mapper
public interface PaymentDao {
    int addPayment(Payment payment);
    Payment getPaymentId(int id);
}
