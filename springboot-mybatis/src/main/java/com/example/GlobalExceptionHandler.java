package com.example;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by paul on 16/11/19.
 */
@RestControllerAdvice
public class GlobalExceptionHandler{

    @ExceptionHandler(value = Exception.class)
    public String jsonErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        return "报错了阿";
    }
}
