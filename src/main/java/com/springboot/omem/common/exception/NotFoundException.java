package com.springboot.omem.common.exception;

public class NotFoundException extends ApplicationException{

    public NotFoundException(int errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }

    public NotFoundException(int errorCode, String errorMessage, Throwable rootCause) {
        super(errorCode, errorMessage, rootCause);
    }
}
