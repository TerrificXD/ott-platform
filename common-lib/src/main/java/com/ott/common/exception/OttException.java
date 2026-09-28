package com.ott.common.exception;

import org.springframework.http.HttpStatus;

/**
 * Base class for all business exceptions across OTT services. Each service's
 * global exception handler (a Spring {@code @RestControllerAdvice}) maps
 * subclasses of this to an {@code ApiResponse.error(...)} body using
 * {@link #status} and {@link #code}.
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
