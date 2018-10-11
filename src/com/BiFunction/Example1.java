package com.BiFunction;

import java.util.function.BiFunction;

public class Example1 {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> b1 = (i,j)->i*j;
		
		System.out.println("10x20 = "+b1.apply(10, 20));
		
		
	}//Close main

}//Close Example1
