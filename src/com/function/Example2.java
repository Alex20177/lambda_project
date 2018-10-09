package com.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.entities.Employee;

public class Example2 {

	public static void main(String[] args) {

		List<Employee> l=new ArrayList<>();
		populate(l);

		Function<List<Employee>,Double> f = ls->{
			double total=0.0;
			for(Employee e : ls)
				total += e.getSalary();
			return total;
		};
		
		System.out.println("Employee list = "+l);
		System.out.println("Total salary = "+f.apply(l));
		
	}//Close main
	
	public static void populate(List<Employee> l) {
		
		l.add(new Employee(1,"Alex",16000.90));
		l.add(new Employee(1,"Luis",17600.90));
		l.add(new Employee(1,"Pedro",25000.90));
		l.add(new Employee(1,"Alberto",38000.90));
		l.add(new Employee(1,"Francisco",39770.90));
		l.add(new Employee(1,"Jonathan",16800.90));
		l.add(new Employee(1,"Brenda",10000.90));
		l.add(new Employee(1,"Lorena",15000.90));
		l.add(new Employee(1,"Paulina",100000.0));
		
	}//Close populate.

}//Close Example2