package com.example;

public class TestMyFunction {

	public static void main(String[] args) {

		MyFunction mF = (t)->System.out.println("Message : "+t);
		mF.m2();
		mF.apply("Hellow World!!!");

	}//Close main method.

}//Close TestMyFunction class.
