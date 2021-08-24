package com.zq.springboot.cloud.server.Impl;

import com.zq.springboot.cloud.dao.PaymentDao;
import com.zq.springboot.cloud.emit.Payment;
import com.zq.springboot.cloud.server.PaymentServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 曾权
 * @create 2021-08-18-20:12
 */
@Service
public class PaymentServerImpl implements PaymentServer {
    @Autowired
    PaymentDao paymentDao;

    public Payment get(int id){

        return  paymentDao.getPaymentId(id);
    }



    public  int add(Payment payment){

        return paymentDao.addPayment(payment);
    }
}
