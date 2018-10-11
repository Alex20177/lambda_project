package com.BiConsumer;

import java.util.function.BiConsumer;

public class Example {

	public static void main(String[] args) {

		BiConsumer<String, String> b1=(s1,s2)->System.out.println(s1+s2);
		b1.accept("Hello ", "Durga");
		
	}//Close main.

}//Close Example.
