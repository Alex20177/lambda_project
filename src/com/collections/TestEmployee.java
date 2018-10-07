package com.collections;

import java.util.ArrayList;
import java.util.Collections;

import com.entities.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		
		ArrayList<Employee> l = new ArrayList<Employee>();
		
		l.add(new Employee(200,"Deepika"));
		l.add(new Employee(400,"Sunny"));
		l.add(new Employee(300,"Mallika"));
		l.add(new Employee(100,"Katrina"));
		
		System.out.println("Before sorting :");
		System.out.println("l = "+l);		
		Collections.sort(l, (e1,e2)->(e1.getId()>e2.getId())?1:(e1.getId()<e2.getId())?-1:0);
		System.out.println("After sorting :");
		System.out.println("l = "+l);
		
	}//Close main method.
	
}//Close TestEmployee class.
