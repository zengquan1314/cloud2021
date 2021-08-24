package com.zq.alibaba.springboot.cloud.emit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * @author 曾权
 * @create 2021-08-23-18:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)  //开启链式风格
public class Order {
    private long id,userId,product_id,count,status;
    private BigDecimal money;
}
