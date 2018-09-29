package com.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
Predicate<T>
Represents a predicate (Boolean-valued function) of one argument. 
 */
public class TestPredicate {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		
		Predicate<Integer> myPredicate = t -> t>=6;
		
		list.stream().filter(myPredicate).forEach(p->System.out.println(p));
				
	}//Close main method.
	
}//Close TestPredicate class.
