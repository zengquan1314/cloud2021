package com.zq.alibaba.springboot.cloud.service;

import com.zq.alibaba.springboot.cloud.dao.OrderDao;
import com.zq.alibaba.springboot.cloud.emit.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 曾权
 * @create 2021-08-23-20:15
 */
public interface OderService {

    public  String insertOrder(Order order);
    public  String insertOrder2(Order order);
}
