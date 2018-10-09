package com.supplier;

import java.util.function.Supplier;

public class Example2 {

	public static void main(String[] args) {

		Supplier<String> c=()->{
			
			String s[]= {"Sunny","Vynny","Chunny","Benny"};
			int x = (int) (Math.random()*4);
			return s[x];
			
		};
		
		System.out.println("Name = "+c.get());
		
	}//Close main

}//Close Example2
