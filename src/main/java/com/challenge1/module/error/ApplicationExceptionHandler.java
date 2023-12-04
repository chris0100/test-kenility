package com.challenge1.module.error;

import com.lob.api.ApiException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ApplicationExceptionHandler {


    @ExceptionHandler(ApiException.class)
    public ResponseEntity<ApiError> handleApiException(ApiException e, HttpServletRequest request){
        ApiError apiError = new ApiError(e.getCode(), e.getMessage(), request.getServletPath());
        return new ResponseEntity<>(apiError, HttpStatus.BAD_REQUEST);
    }

}
