package com.moon.common.tools.exception;

import com.moon.common.tools.result.ApiResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.annotation.Resource;
import javax.validation.ConstraintViolationException;
import java.util.stream.Collectors;

/**
 * @Auther: doubleS
 * @Date: 2018-12-24 14:17
 * @Description:
 */
@RestControllerAdvice(annotations = RestController.class)
@ResponseBody
public class RegisterGlobalExceptionHandler {

    @Resource
    ExceptionManager exceptionManager;

    /**
     * @auther: DoubleS
     * @date: 2018-12-24 14:37
     * @param: [constraintViolationException]
     * @return: java.lang.String
     * @description: 拦截使用@Validated参数校验抛出的异常
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public ApiResult handlerException(ConstraintViolationException constraintViolationException) {
        String code = constraintViolationException.getConstraintViolations().stream().limit(1).map(cv -> cv.getMessageTemplate()).collect(Collectors.toList()).get(0);
        ApiResult apiResult = exceptionManager.createExceptionResult(code);
        return apiResult;
    }

    /**
     * @auther: DoubleS
     * @date: 2018-12-24 15:16
     * @param: [customException]
     * @return: java.lang.String
     * @description: 拦截在service层手动抛出的自定义异常
     */
    @ExceptionHandler(CustomException.class)
    public ApiResult handlerException(CustomException customException) {
        ApiResult apiResult = exceptionManager.createExceptionResult(customException.getCode());
        return apiResult;
    }
}
