package com.example.motoautoplanner.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Vladislav Domaniewski
 */

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class DbException extends RuntimeException {

    private static final String MESSAGE = "Ошибка БД";

    public DbException(String message) {
        super(message);
    }

    public DbException(Throwable cause) {
        super(MESSAGE, cause);
    }
}
