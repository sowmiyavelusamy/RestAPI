package com.springboot.rest.errorhandling;

public class InvalidUserInputException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7956770919619831693L;

	public InvalidUserInputException (String message) {
		super(message);
	}

}
