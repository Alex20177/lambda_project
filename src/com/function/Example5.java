package com.function;

import java.util.function.Function;

//andThen first f1 and then f2
//compose first f2 and then f1

public class Example5 {

	public static void main(String[] args) {

		Function<Integer,Integer> f1=i->i+i;
		Function<Integer,Integer> f2=i->i*i*i;
		
		System.out.println("andThen function = "+f1.andThen(f2).apply(2));
		System.out.println("compose function = "+f1.compose(f2).apply(2));
		
	}//Close main

}//Close Example5
