package com.moon.common.tools.exception;

import com.moon.common.tools.result.ApiResult;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Auther: doubleS
 * @Date: 2018-12-24 13:57
 * @Description: 异常封装工具
 */
@Component
@PropertySource(value = "exception.properties", encoding = "UTF-8")
public class ExceptionManager {

    @Resource
    Environment environment;

    protected ApiResult createExceptionResult(String exceptionCode) {
        //适用于单体服务
        return ApiResult.exception(exceptionCode, environment.getProperty(exceptionCode));
    }

    public CustomException create(String exceptionCode) {
        return new CustomException(exceptionCode);
    }
}
