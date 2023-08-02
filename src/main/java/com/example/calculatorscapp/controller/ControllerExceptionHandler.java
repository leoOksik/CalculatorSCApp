package com.example.calculatorscapp.controller;

import com.example.calculatorscapp.exception.ExceptionResponse;
import com.example.calculatorscapp.exception.MessageException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(value = { MessageException.class })
    public ResponseEntity<ExceptionResponse> handleIntervalServerError(RuntimeException ex) {

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new ExceptionResponse(ex.getMessage()));
    }
}