package com.ott.common.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * Machine-readable error body used inside {@link ApiResponse#error}.
 * {@code code} is a stable, service-defined string (e.g. "CONTENT_NOT_FOUND")
 * that clients can branch on; {@code message} is human-readable.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public record ApiError(
        String code,
        String message,
        List<String> details
) {

    public static ApiError of(String code, String message) {
        return new ApiError(code, message, null);
    }

    public static ApiError of(String code, String message, List<String> details) {
        return new ApiError(code, message, details);
    }
}
