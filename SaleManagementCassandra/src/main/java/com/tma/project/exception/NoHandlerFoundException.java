package com.tma.project.exception;

public class NoHandlerFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;


	public NoHandlerFoundException(String msg) {
		super(msg);
		this.message = msg;

	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	

}
