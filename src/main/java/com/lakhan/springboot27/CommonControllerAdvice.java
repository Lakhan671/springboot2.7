package com.lakhan.springboot27;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@RestControllerAdvice
public class CommonControllerAdvice {
    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<Object> handleCityNotFoundException(
            NullPointerException ex, WebRequest request) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "Null pointer Exception in home controller");
        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }
}
