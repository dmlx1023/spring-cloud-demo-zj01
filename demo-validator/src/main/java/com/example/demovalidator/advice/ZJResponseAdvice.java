package com.example.demovalidator.advice;

import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

/**
 * @author duanmulixiang
 */
@RestControllerAdvice
public class ZJResponseAdvice {


    @ExceptionHandler(BindException.class)
    @ResponseBody
    public String handleException(BindException e) {
        List<ObjectError> l = e.getAllErrors();
        StringBuffer sb = new StringBuffer();
        for (ObjectError objectError : l) {
            sb.append(objectError.getDefaultMessage());
        }
        return sb.toString();
    }
}
