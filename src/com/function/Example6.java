package com.function;

import java.util.Scanner;
import java.util.function.Function;

public class Example6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Function<String,String> f1=s->s.substring(0, 5);
		Function<String,String> f2=s->s.toLowerCase();
		
		System.out.println("Type name : ");
		String userName=sc.next();
		
		System.out.println("Type pwd : ");
		String pwd = sc.next();
		
		if(f1.andThen(f2).apply(userName).equals("durga") && pwd.equals("java")) 
			System.out.println("User valid :)");
		else
			System.out.println("User no valid :(");
		
		sc.close();
		
	}//Close main

}//Close Example6
