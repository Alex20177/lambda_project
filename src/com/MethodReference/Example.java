package com.MethodReference;

public class Example {

	public void m1() {
		
		for (int i = 0; i < 10; i++)
			System.out.println("Child thread");
	}//Close m1
	
	public static void main(String[] args) {
		
		Example e = new Example();
		Runnable r=e::m1;
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) 
			System.out.println("Main thread");
		
	}//Close main

}//Close Example
