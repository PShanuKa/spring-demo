package com.example.demo.common.response;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Value;

/**
 * Generic API response wrapper. Same shape for success and error.
 * Timestamp is ISO-8601 UTC.
 *
 * @param <T> type of the payload (data)
 */
@Value
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {

    String code;
    String message;
    T data;
    String timestamp;

    public static <T> ApiResponse<T> ofSuccess(String code, String message, T data) {
        return ApiResponse.<T>builder()
                .code(code)
                .message(message)
                .data(data)
                .timestamp(Instant.now().toString())
                .build();
    }

    public static <T> ApiResponse<T> ofError(String code, String message) {
        return ApiResponse.<T>builder()
                .code(code)
                .message(message)
                .timestamp(Instant.now().toString())
                .build();
    }
}
