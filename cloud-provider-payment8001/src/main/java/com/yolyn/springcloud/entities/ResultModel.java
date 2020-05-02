package com.yolyn.springcloud.entities;

import com.yolyn.springcloud.enums.CommonRespEnum;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@ToString
public class ResultModel<T> implements Serializable {

    public static final String SUCCESS    = "000000";
    public static final String ERROR      = "FE9999";

    /**
     * 返回数据总数量
     */
    private String             totalCount = "0";

    /**
     * 接口返回对象
     */
    private T                  result;

    /**
     * 接口返回code
     */
    private String             code;
    /**
     * 接口返回msg
     */
    private String             msg;

    public ResultModel() {
    }

    public ResultModel(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public ResultModel(CommonRespEnum commonRespEnum) {
        this.code = commonRespEnum.getCode();
        this.msg = commonRespEnum.getMsg();
    }
    public ResultModel(CommonRespEnum commonRespEnum,T result) {
        this.code = commonRespEnum.getCode();
        this.msg = commonRespEnum.getMsg();
        this.result = result;
    }

    public ResultModel setFailed(String msg) {
        this.msg = msg;
        this.code = ERROR;
        return this;
    }

    public ResultModel setSuccess(T result) {
        this.result = result;
        this.msg = "SUCCESS";
        this.code = SUCCESS;
        return this;
    }

    public ResultModel setSuccess(T result, String totalCount) {
        this.result = result;
        this.totalCount = totalCount;
        this.msg = "SUCCESS";
        this.code = SUCCESS;
        return this;
    }

    public ResultModel setSuccess(String msg) {
        this.msg = msg;
        this.code = SUCCESS;
        return this;
    }

    public boolean isSuccess() {
        if (SUCCESS.equals(code)) {
            return true;
        } else {
            return false;
        }
    }
}
