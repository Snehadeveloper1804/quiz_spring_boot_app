package org.jsp.quzi.dto;

public class QuizRandamQuestions {
	
	private int id;
	private String tilte;
	private String a;
	private String b;
	private String c;
	private String d;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTilte() {
		return tilte;
	}
	public void setTilte(String tilte) {
		this.tilte = tilte;
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
	public QuizRandamQuestions(int id, String tilte, String a, String b, String c, String d) {
		super();
		this.id = id;
		this.tilte = tilte;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	
	
}
