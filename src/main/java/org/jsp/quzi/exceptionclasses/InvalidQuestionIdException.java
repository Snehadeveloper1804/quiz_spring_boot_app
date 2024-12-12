package org.jsp.quzi.exceptionclasses;

public class InvalidQuestionIdException extends RuntimeException{
	
	private String message;
	
	public InvalidQuestionIdException(){
		
	}
	
	public InvalidQuestionIdException(String message){
		this.message=message;
	}

	@Override
	public String getMessage() {	
		return this.message;
	}
	
	
	
}
