package com.ott.common.exception;

import org.springframework.http.HttpStatus;

/**
 * Base type for every application-level exception in the platform. Carries
 * the HTTP status it should map to and a machine-readable error code, so a
 * single {@code @ExceptionHandler(OttException.class)} in each service can
 * turn any subclass into the right {@code ApiResponse.error(...)} without
 * knowing about the subclass itself.
 */
public class OttException extends RuntimeException {

    private final HttpStatus status;
    private final String code;

    public OttException(HttpStatus status, String code, String message) {
        super(message);
        this.status = status;
        this.code = code;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getCode() {
        return code;
    }
}
