package com.fly4j.yshop.common.web.exception;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局系统异常处理
 *
 * @author hxrui
 * @date 2020-02-25 13:54
 **/
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public Result handleIllegalArgumentException(IllegalArgumentException e) {
        return Result.error(e.getLocalizedMessage());
    }



    @ExceptionHandler(JsonProcessingException.class)
    public Result handleJsonProcessingException(IllegalArgumentException e){
        return Result.error(e.getLocalizedMessage());
    }
}
