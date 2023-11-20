package com.springboot.omem.common.exception;

public abstract class ApplicationException extends RuntimeException {
    private final ErrorDetail errorDetail;

    public ApplicationException(int errorCode, String errorMessage) {
        super(errorMessage);

        this.errorDetail = ErrorDetail.builder()
                .errorCode(errorCode)
                .errorMessage(errorMessage)
                .build();
    }

    public ApplicationException(int errorCode, String errorMessage, Throwable rootCause) {
        super(errorMessage, rootCause);

        this.errorDetail = ErrorDetail.builder()
                .errorCode(errorCode)
                .errorMessage(errorMessage)
                .build();
    }
}
