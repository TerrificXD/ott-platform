package com.ott.common.exception;

import org.springframework.http.HttpStatus;

/** Thrown when a lookup by id/key finds nothing — maps to HTTP 404. */
public class ResourceNotFoundException extends OttException {

    public ResourceNotFoundException(String message) {
        super(HttpStatus.NOT_FOUND, "RESOURCE_NOT_FOUND", message);
    }

    public static ResourceNotFoundException of(String resource, Object id) {
        return new ResourceNotFoundException(resource + " not found: " + id);
    }
}
