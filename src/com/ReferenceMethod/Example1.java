package com.ReferenceMethod;

interface Interf{
	public void m1();
}

public class Example1 {
	
	public static void m2() {
		
		System.out.println("Hello method reference");
		
	}//Close m2 

	public static void main(String[] args) {

		//Interf i=()->System.out.println("Hello lambda expression");
		//i.m1();
		
		Interf i = Example1::m2;
		i.m1();
		
	}//Close main

}//Close Example1
