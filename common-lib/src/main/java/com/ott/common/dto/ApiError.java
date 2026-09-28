package com.ott.common.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * Machine-readable error body used inside {@link ApiResponse#getError()}.
 * {@code code} is a stable, service-defined string (e.g. "CONTENT_NOT_FOUND")
 * that clients can branch on; {@code message} is human-readable.
 */
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiError {

    private String code;
    private String message;
    private List<String> details;

    public static ApiError of(String code, String message) {
        return new ApiError(code, message, null);
    }

    public static ApiError of(String code, String message, List<String> details) {
        return new ApiError(code, message, details);
    }
}
