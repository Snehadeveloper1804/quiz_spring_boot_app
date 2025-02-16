package org.jsp.quzi.dto;

import lombok.Builder;

@Builder
public class QuestionDto {
	private String title;
	private String a;
	private String b;
	private String c;
	private String d;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getD() {
		return d;
	}
	public void setD(String d) {
		this.d = d;
	}
	public QuestionDto(String title, String a, String b, String c, String d) {
		super();
		this.title = title;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	 
	public QuestionDto() {
		
	}
	
}
