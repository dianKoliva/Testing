package com.example.classbjunit.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CartException extends RuntimeException{

    public CartException(String msg) {

        super(msg);
    }
}
