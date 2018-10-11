package com.BiPredicate;

import java.util.function.BiPredicate;

public class Example1 {

	public static void main(String[] args) {

		BiPredicate<Integer,Integer> b1=(i,j)->(i*j)%2==0;
		
		System.out.println("Testing 10 * 20 , Is it even numner : "+b1.test(10, 20));
		System.out.println("Testing 15 * 27 , Is it even numner : "+b1.test(15, 27));
		

	}//Close main

}//Close Example1
