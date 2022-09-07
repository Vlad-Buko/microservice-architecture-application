package com.example.motoautoplanner.exceptions;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Vladislav Domaniewski
 */

@Slf4j
public class BaseException extends RuntimeException{

    public BaseException(String msg, Throwable t) {
        super(msg, t);
        log.error(msg, t);
    }

    public BaseException(String msg) {
        super(msg);
        log.error(msg);
    }

}
