package com.predicate;
import java.util.function.Predicate;

//Print only names starts with 'A' using predicate lambda expression
public class Example1 {

	public static void main(String[] args) {

		String names[]= {"Alex","Antonio","Felipe","Carlos","Fernando","Alejandra","Alberto"};
		
		Predicate<String> startWithA = s->s.charAt(0)=='A';
		
		for (String s : names) {
			if(startWithA.test(s))
				System.out.println(s);
		}//Close for.
		
	}//Close main.

}//Close Example1
