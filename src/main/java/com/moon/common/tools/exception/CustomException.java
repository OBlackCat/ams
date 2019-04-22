package com.moon.common.tools.exception;

import lombok.Data;

/**
 * @Auther: doubleS
 * @Date: 2018-12-24 14:47
 * @Description: 自定义异常
 */
@Data
public class CustomException extends RuntimeException {

    private String code;

    public CustomException(String code) {
        this.code = code;
    }
}
