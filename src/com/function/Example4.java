package com.function;

import java.util.function.Function;

public class Example4 {

	public static void main(String[] args) {

		Function<String,String> f1=s->s.toUpperCase();
		Function<String,String> f2=s->s.substring(0, 9);
		
		System.out.println("Apply only f1 = "+f1.apply("yellowmanmusicska"));
		System.out.println("Apply only f2 = "+f2.apply("yellowmanmusicskas"));
		System.out.println("Apply f1 and f2 at same time ="+f1.andThen(f2).apply("yellowmanmusicska"));
		System.out.println("Apply f2 and f1 at same time ="+f1.compose(f2).apply("yellowmanmusicska"));
		
	}//Close main

}//Close Example4
