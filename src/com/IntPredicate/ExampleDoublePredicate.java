package com.IntPredicate;

import java.util.function.DoublePredicate;

public class ExampleDoublePredicate {

	public static void main(String[] args) {

		DoublePredicate d=i->i>=2.5;
		
		System.out.println("0.09 if greater than 2.5 "+d.test(0.09));
		
		//IntFunction<R> f;

	}//Close main

}//Close ExampleDoublePredicate
