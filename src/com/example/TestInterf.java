package com.example;

import com.functionalInterfaces.Interf;

public class TestInterf {

	public static void main(String[] args) {

		Interf i = x->x*x; 		
		
		System.out.println("Square 2 = "+i.squateIt(2));
		System.out.println("Square 20 = "+i.squateIt(20));

	}//Close main method.

}//Close TestInterf class.
