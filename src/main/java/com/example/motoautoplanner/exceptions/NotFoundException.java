package com.example.motoautoplanner.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Vladislav Domaniewski
 */

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends BaseException {

    private final static String MESSAGE = "Not Found";

    public NotFoundException(Throwable t) {
        super(MESSAGE, t);
    }

    public NotFoundException() {
        super(MESSAGE);
    }
}
