package com.example.product.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class InSufficientCount extends RuntimeException{
    private final HttpStatus httpStatus=HttpStatus.BAD_REQUEST;
    private String msg;

}

