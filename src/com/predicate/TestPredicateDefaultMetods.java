package com.predicate;

import java.util.function.Predicate;

public class TestPredicateDefaultMetods {

	public static void main(String[] args) {

		int x[]= {0,5,10,20,25,30};
		
		//Declaring predicates p1 and p2.
		Predicate<Integer> p1=i->i>10;
		Predicate<Integer> p2=i->i%2==0;
		
		System.out.println("The numbers greater than 10 are:");
		m1(p1,x);
		
		System.out.println("The even numbers are:" );
		m1(p2,x);
		
		System.out.println("The numbers not greater than 10 are: ");
		m1(p1.negate(),x);
		
		System.out.println("The numbers greater than 10 and even number are: ");
		m1(p1.and(p2),x);
		
		System.out.println("The numbers greater than 10 or even numbers are: ");
		m1(p1.or(p2),x);
		
	}//Close main.
	
	public static void m1(Predicate<Integer> p, int x[]){
		
		for(Integer i: x) {
			if(p.test(i))
				System.out.println(i);
		}//Close for.
		
	}//Close m1.

}//Close TestPredicateDefaultMetods. 
