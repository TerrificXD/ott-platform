package com.ott.common.exception;

import org.springframework.http.HttpStatus;

public class ForbiddenException extends OttException {

    public ForbiddenException(String message) {
        super(HttpStatus.FORBIDDEN, "FORBIDDEN", message);
    }
}
