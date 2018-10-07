package com.example;

public class TestMyFunction {

	public static void main(String[] args) {

		MyFunction mF = t->System.out.println("Message : "+t);
		mF.m2();
		mF.apply("Hellow World!!!");
		
		Thread thread = new Thread(()->System.out.println("new Thread called "));
		thread.start();
		System.out.println("Hello main Thread");

	}//Close main method.

}//Close TestMyFunction class.
