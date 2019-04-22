package com.moon.common.tools.result;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Auther: doubleS
 * @Date: 2018-12-24 15:22
 * @Description: 成功的返回体封装类
 */
@Data
public class SuccessResult extends ApiResult {

    private static String SUCCESS_CODE = "10000";
    private static boolean DEFAULT_RESULT = true;

    private Object data;

    public SuccessResult(Object data) {
        this.code = SUCCESS_CODE;
        this.result = DEFAULT_RESULT;
        this.data = data;
    }

}
