package com.function;

import java.util.function.Function;

public class Example1 {

	public static void main(String[] args) {

		Function<Integer, Integer> f=i->i*i;
		
		System.out.println("Square of 10 = "+f.apply(10));
		System.out.println("Square of 05 = "+f.apply(5));
		
		Function<Double,Double> pesoToDollar = i->i*20;
		
		System.out.println("20 pesos to dolar = "+pesoToDollar.apply(20.0));
		System.out.println("42.8 pesos to dolar = "+pesoToDollar.apply(42.8));
		
		Function<String,Integer> countSpaces = s->s.length()-s.replace(" ", "").length();
		System.out.println("Number of spaces = "+countSpaces.apply("Hello World Functional lambda expresion"));
		
	}//Close main

}//Close Example1
