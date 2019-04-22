package com.moon.common.tools.result;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Auther: doubleS
 * @Date: 2018-12-24 14:01
 * @Description: 后台异常返回体
 */
@Data
public class ExceptionResult extends ApiResult {

    private static String FAILED_CODE = "20000";
    private static boolean FAILED_RESULT = false;
    private static String DEFAULT_EXCEPTION_DESC = "执行过程中出现未控制异常";

    private String exceptionCode;
    private String exceptionDesc;

    public ExceptionResult(String exceptionCode, String exceptionDesc) {
        this.code = FAILED_CODE;
        this.result = FAILED_RESULT;
        this.exceptionCode = exceptionCode;
        this.exceptionDesc = exceptionDesc == null || exceptionDesc.trim().length() == 0 ? DEFAULT_EXCEPTION_DESC : exceptionDesc;
    }

}
