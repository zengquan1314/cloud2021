package com.zq.alibaba.springboot.cloud.service.OrderServerImpl;

import com.zq.alibaba.springboot.cloud.dao.OrderDao;
import com.zq.alibaba.springboot.cloud.emit.Order;
import com.zq.alibaba.springboot.cloud.service.OderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 曾权
 * @create 2021-08-23-21:40
 */
@Service

public class OrderServerImpl implements OderService {
    @Autowired
    OrderDao orderDao;
    @Override

    public String insertOrder(Order order) {
        orderDao.create(order);
        int i=2/0;
        insertOrder2(order);
        return "插入成功";
    }
    @Override
    public String insertOrder2(Order order) {
        orderDao.create(order);
        int i=2/0;
        return "插入成功";
    }
}
