package com.jd.admin.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class GlobalExceptionHandler {
    public String handleArithException(){
        return "";
    }
}
