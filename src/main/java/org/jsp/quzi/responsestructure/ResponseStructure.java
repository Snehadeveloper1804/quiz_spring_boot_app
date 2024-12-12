package org.jsp.quzi.responsestructure;

import java.util.List;



import lombok.Builder;

@Builder
public class ResponseStructure<T> {
	private int httpStatus;
	private String message;
	private T body;
	
	public int getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(int httpStatus) {
		this.httpStatus = httpStatus;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public T getBody() {
		return body;
	}
	
}

