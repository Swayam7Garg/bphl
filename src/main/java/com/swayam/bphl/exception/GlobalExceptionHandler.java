package com.swayam.bphl.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<Map<String, Object>> handleInvalidJson(HttpMessageNotReadableException ex) {
        return ResponseEntity.badRequest().body(Map.of(
                "is_success", false,
                "message", "Invalid JSON request payload: " + ex.getMessage()
        ));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, Object>> handleFallback(Exception ex) {
        return ResponseEntity.internalServerError().body(Map.of(
                "is_success", false,
                "message", "An unexpected error occurred: " + ex.getMessage()
        ));
    }
}
