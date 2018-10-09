package com.entities;

public class Student {

	private String name;
	private int mark;
	
	public Student(String name, int mark) {
		this.name = name;
		this.mark = mark;
	}//Close constructor

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}
	
}//Close Student