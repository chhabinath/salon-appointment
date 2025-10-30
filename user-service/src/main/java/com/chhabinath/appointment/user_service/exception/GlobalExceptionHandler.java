package com.chhabinath.appointment.user_service.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.chhabinath.appointment.user_service.payload.response.ExceptionResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ExceptionResponse> handleUserNotFound(UserNotFoundException ex, WebRequest request) {
        ExceptionResponse response = ExceptionResponse.builder()
                .message(ex.getMessage())
                .error(request.getDescription(false))
                .timeStamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
	 @ExceptionHandler(Exception.class)
	    public ResponseEntity<ExceptionResponse> handleGeneralException(Exception ex, WebRequest request) {
	        ExceptionResponse response = ExceptionResponse.builder()
	                .message(ex.getMessage())
	                .error(request.getDescription(false))
	                .timeStamp(LocalDateTime.now())
	                .build();

	        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
}
