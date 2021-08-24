package com.zq.springboot.cloud.emit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author 曾权
 * @create 2021-08-18-17:56
 */
@AllArgsConstructor ///有参构造函数
@NoArgsConstructor	///无参构造函数
@Data //get set 函数
@Accessors(chain = true) //链式风格
public class CommonResult<T> {
    private Integer code;
    private String  message;
    private  T      data;

    public CommonResult(Integer code,String message)
    {
        this(code,message,null);
    }
}
