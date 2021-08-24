package com.zq.springboot.cloud.server;

import com.zq.springboot.cloud.dao.PaymentDao;
import com.zq.springboot.cloud.emit.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 曾权
 * @create 2021-08-18-18:51
 */
public interface PaymentServer {



    public Payment get(int id);
    public int add(Payment payment);
}
