package com.oysterworld.portfolio.owproject_backend_v2.exception.advice;

import com.oysterworld.portfolio.owproject_backend_v2.exception.OwBlankException;
import com.oysterworld.portfolio.owproject_backend_v2.exception.OwBoundaryException;
import com.oysterworld.portfolio.owproject_backend_v2.exception.OwFormatException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class OwBadRequestRestControllerAdvice {
    @ExceptionHandler(OwBlankException.class)
    public ResponseEntity<String> handle(OwBlankException ex) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(ex.getMessage());
    }

    @ExceptionHandler(OwBoundaryException.class)
    public ResponseEntity<String> handle(OwBoundaryException ex) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(ex.getMessage());
    }
    @ExceptionHandler(OwFormatException.class)
    public ResponseEntity<String> handle(OwFormatException ex) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(ex.getMessage());
    }
}
