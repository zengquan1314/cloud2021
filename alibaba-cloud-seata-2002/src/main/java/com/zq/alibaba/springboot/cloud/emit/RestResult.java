package com.zq.alibaba.springboot.cloud.emit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author 曾权
 * @create 2021-08-23-18:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true) //开启链式风格
public class RestResult<T> {
    private String code,message;
    private T  data;
    public  RestResult(String code,String message){
        this(code,message,null);
    }
}
