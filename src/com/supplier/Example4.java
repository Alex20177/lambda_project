package com.supplier;

import java.util.function.Supplier;

public class Example4 {

	public static void main(String[] args) {

		
		Supplier<String> mainSupplier=()->{
		
			String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ$#@";
			String pwd="";
			Supplier<Integer> s1=()->((int)(Math.random()*10));
			Supplier<Character> s2=()->characters.charAt( (int)(Math.random()*29));
			
			for (int i = 1; i <= 8; i++) {
				
				if(i%2==0)
					pwd += s1.get();
				else
					pwd += s2.get();
				
			}//Close for
			
			return pwd;
		
		};
		
		System.out.println(mainSupplier.get());
		
	}// Close main

}// Close Example4
