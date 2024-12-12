package org.jsp.quzi.exceptionhandler;

import org.jsp.quzi.responsestructure.ResponseStructure;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class InvalidQuestionIdExceptionhandler {
	
	public ResponseEntity<?> invalidQuestionIdExceptionHandlerEntity(InvalidQuestionIdExceptionhandler e){
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ResponseStructure.builder().httpStatus(HttpStatus.NOT_FOUND.value()).message("No Questions ound in the database")
				.body("No Question present in databse").build());
	}
}
