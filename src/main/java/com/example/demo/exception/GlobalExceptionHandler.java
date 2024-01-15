package com.example.demo.exception;

import com.example.demo.common.R;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ServiceException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<R> handleServiceException(ServiceException e) {
        System.out.println("全局异常拦截器捕获: " + e.getMessage());
        return new ResponseEntity<>(R.error(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
