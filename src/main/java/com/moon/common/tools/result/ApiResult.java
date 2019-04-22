package com.moon.common.tools.result;

import lombok.Data;

/**
 * @Auther: doubleS
 * @Date: 2018-12-24 14:53
 * @Description: 返回体父类
 */
@Data
public abstract class ApiResult {

    private static final String SUCCESS_RESULT_DATA = "Execute successfully!";

    String code;

    boolean result;

    public static ApiResult success() {
        return new SuccessResult(SUCCESS_RESULT_DATA);
    }

    public static ApiResult success(Object data) {
        return new SuccessResult(data);
    }

    public static ApiResult exception(String exceptionCode, String exceptionDesc) {
        return new ExceptionResult(exceptionCode, exceptionDesc);
    }
}
