package com.springboot.rest.errorhandling;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;


@ControllerAdvice
public class CustomHandlingException
{   
    @ExceptionHandler(InvalidUserInputException.class)
    public final ResponseEntity<Object> handleException(InvalidUserInputException ex, WebRequest request) 
    {
        ErrorResponse error = new ErrorResponse(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
}
