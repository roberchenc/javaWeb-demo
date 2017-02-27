package com.ccl.exception;

import com.ccl.reponse.MessageResponse;

public class BaseException extends Exception {
    private final Integer errCode;

    public BaseException(Integer errCode, String message) {
        super(message);
        this.errCode = errCode;
    }

    public Object getErrorResponse() {
        return new MessageResponse(errCode, getMessage());
    }
}