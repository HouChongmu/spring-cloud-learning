package com.yolyn.alicloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.yolyn.alicloud.myhandler.CustomerBlockHandler;
import com.yolyn.springcloud.entities.Payment;
import com.yolyn.springcloud.entities.ResultModel;
import com.yolyn.springcloud.enums.CommonRespEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther zzyy
 * @create 2020-02-25 15:04
 */
@RestController
public class RateLimitController {
    @GetMapping("/byResource")
    @SentinelResource(value = "byResource", blockHandler = "handleException")
    public ResultModel byResource() {
        return new ResultModel(CommonRespEnum.COMMON_SUCCESS, "按资源名称限流测试OK，serial0001");
    }

    public ResultModel handleException(BlockException exception) {
        return new ResultModel("99999", exception.getClass().getCanonicalName() + "\t 服务不可用");
    }

    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")
    public ResultModel byUrl() {
        return new ResultModel(CommonRespEnum.COMMON_SUCCESS, "按url限流测试OK,serial0002");
    }


    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
            blockHandlerClass = CustomerBlockHandler.class, blockHandler = "handlerException2")
    public ResultModel customerBlockHandler() {
        return new ResultModel(CommonRespEnum.COMMON_SUCCESS, "自定义CustomerBlockHandler，serial0003");
    }
}