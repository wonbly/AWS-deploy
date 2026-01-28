package com.yonsai.books.config;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public String handleAllException(Exception e) {
        return "시스템 오류가 발생했습니다: " + e.getMessage();
    }
}