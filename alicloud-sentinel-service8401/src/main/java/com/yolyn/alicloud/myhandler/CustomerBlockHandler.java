package com.yolyn.alicloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.yolyn.springcloud.entities.ResultModel;

/**
 * @auther zzyy
 * @create 2020-02-25 15:32
 */
public class CustomerBlockHandler
{
    public static ResultModel handlerException(BlockException exception)
    {
        return new ResultModel("4444","按客戶自定义,global handlerException----1");
    }
    public static ResultModel handlerException2(BlockException exception)
    {
        return new ResultModel("4444","按客戶自定义,global handlerException----2");
    }
}
