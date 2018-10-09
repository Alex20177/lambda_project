package com.function;

import java.util.function.Function;

public class Example7 {

	public static void main(String[] args) {

		Function<String,String> f1=Function.identity();
		String s1="Durga";
		String s2=f1.apply(s1);
		
		System.out.println("s2 = "+s2);
		s1 +="add";
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		
	}//Close main

}//Close Example7
