package com.example.product.exception;

import org.springframework.http.HttpStatus;

public class AlreadyExists extends RuntimeException{
    private HttpStatus status=HttpStatus.CONFLICT;

    }


