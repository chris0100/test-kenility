package com.challenge1.module.error;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ApiError {


    private int code;
    private String message;
    private String url;

    public ApiError(int code, String message, String url) {
        this.code = code;
        this.message = message;
        this.url = url;
    }
}
