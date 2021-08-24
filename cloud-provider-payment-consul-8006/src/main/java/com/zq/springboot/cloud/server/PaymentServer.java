package com.zq.springboot.cloud.server;

import com.zq.springboot.cloud.emit.Payment;

/**
 * @author 曾权
 * @create 2021-08-18-18:51
 */
public interface PaymentServer {



    public Payment get(int id);
    public int add(Payment payment);
}
