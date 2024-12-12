package org.jsp.quzi.exceptionhandler;

import org.jsp.quzi.exceptionclasses.NoQuestionFoundException;
import org.jsp.quzi.responsestructure.ResponseStructure;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class QuestionExceptionhandeer {

	@ExceptionHandler(NoQuestionFoundException.class)
	public ResponseEntity<?> NoQuestionFoundExceptionHandler(NoQuestionFoundException e) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ResponseStructure.builder().httpStatus(HttpStatus.NOT_FOUND.value()).message("no Question found exception").
		body("No Question present In database").build());
	}
	
}
