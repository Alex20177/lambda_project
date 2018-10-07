package com.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

import com.entities.User;

public class Example3 {

	public static void main(String[] args) {
	
		Predicate<User> p=u->u.getName().equals("Alex")&&u.getPwd().equals("java");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter name :");
		String name = sc.next();
		
		System.out.print("Enter pwd :");
		String pwd = sc.next();
		
		User user = new User(name, pwd);
		
		if(p.test(user))
			System.out.println("User accepted :)");
		else
			System.out.println("Check your credentials :( ");
		
		sc.close();
		
		System.out.println("\n\nExample finished");
		
	}//Close main

}//Close Example3
