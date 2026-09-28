package com.ott.common.exception;

import org.springframework.http.HttpStatus;

/** Thrown for authentication/authorization failures — maps to HTTP 401. */
public class UnauthorizedException extends OttException {

    public UnauthorizedException(String message) {
        super(HttpStatus.UNAUTHORIZED, "UNAUTHORIZED", message);
    }
}
