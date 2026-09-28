package com.ott.common.exception;

import org.springframework.http.HttpStatus;

/**
 * Thrown when the caller is authenticated but not entitled — e.g. a
 * subscription tier that doesn't cover this content, or a region lock.
 * Maps to HTTP 403.
 */
public class ForbiddenException extends OttException {

    public ForbiddenException(String message) {
        super(HttpStatus.FORBIDDEN, "FORBIDDEN", message);
    }
}
