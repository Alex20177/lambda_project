package com.example;

@FunctionalInterface
public interface MyFunction {

	public void apply(String t);
		
	default void m2() {
		System.out.println("Hi m2 method");
	}//Close m2
	
}//Close MyFunction interface
