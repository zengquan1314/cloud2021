package com.zq.alibaba.springboot.cloud.dao;

import com.zq.alibaba.springboot.cloud.emit.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author 曾权
 * @create 2021-08-23-18:36
 */
@Mapper
public interface OrderDao {
    //新增订单
    void  create(Order order);
}
