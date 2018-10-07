package com.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//Remove all null and empty String, using lambda predicate example
public class Example2 {
	
	public static void main(String[] args) {

		String names[]= {"Alex",null,"","Beto","","Galleta",null};
		
		Predicate<String> p=s->s != null && s.length() != 0;
		
		List<String> list = new ArrayList<>();
		
		for (String s : names) {
			if(p.test(s))
				list.add(s);
		}//Close for
		
		System.out.println("List without null and empty Strings");
		System.out.println(list);
		
	}//Close main
	
}//Close Example2
