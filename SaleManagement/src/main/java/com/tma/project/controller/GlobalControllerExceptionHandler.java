package com.tma.project.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tma.project.exception.ConstraintViolationException;
import com.tma.project.exception.CustomException;
import com.tma.project.exception.NoHandlerFoundException;

@RestControllerAdvice
public class GlobalControllerExceptionHandler {

	@ExceptionHandler(value = {ConstraintViolationException.class})
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public CustomException constraintViolationException(ConstraintViolationException ex) {
		return new CustomException(400, ex.getMessage());
	}
	
	@ExceptionHandler(value = { NoHandlerFoundException.class })
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public CustomException noHandlerFoundException(Exception ex) {
		return new CustomException(404, ex.getMessage());
	}
	
//	@ExceptionHandler(value = { Exception.class })
//	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//	public CustomException unknownException(Exception ex) {
//		return new CustomException(500, "Internal Server Error");
//	}
}
