package com.example.product.dto;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
public class ErrorResponse {
    private HttpStatus status;
    private String errorMessage;
    private LocalDateTime localDateTime;
    private int errorCode;
}

