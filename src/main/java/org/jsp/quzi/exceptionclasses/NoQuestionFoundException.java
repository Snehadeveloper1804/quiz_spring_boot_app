package org.jsp.quzi.exceptionclasses;


public class NoQuestionFoundException extends RuntimeException{

	private String message;
	
	public NoQuestionFoundException() {
		
	}

	public NoQuestionFoundException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return this.message;
	}

	public static Object builder() {
		
		return null;
	}
	
}
