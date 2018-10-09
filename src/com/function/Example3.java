package com.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import com.entities.Employee;

public class Example3 {

	public static void main(String[] args) {
		
		List<Employee> l1=new ArrayList<>();
		List<Employee> l2=new ArrayList<>();
		populate(l1);
		
		System.out.println("Before increment ="+l1);

		Predicate <Employee> p=e->e.getSalary()<18000.0;
		Function <Employee,Employee> f=e->{
			e.setSalary(e.getSalary()+477.0);
			return e;
		};
		
		for (Employee e : l1) {
			if (p.test(e)) {
				f.apply(e);
				l2.add(e);
			}//close if
		}//Close for
		
		System.out.println("After increment ="+l1);
		System.out.println("Employees with incremente = "+l2);
		
	}//Close main
	
	public static void populate(List<Employee> list){
		
		list.add(new Employee(1,"Alex",16000.90));
		list.add(new Employee(1,"Luis",17600.90));
		list.add(new Employee(1,"Pedro",25000.90));
		list.add(new Employee(1,"Alberto",38000.90));
		list.add(new Employee(1,"Francisco",39770.90));
		list.add(new Employee(1,"Jonathan",16800.90));
		list.add(new Employee(1,"Brenda",10000.90));
		list.add(new Employee(1,"Lorena",15000.90));
		list.add(new Employee(1,"Paulina",100000.0));
		
	}//Close populate
	
}//Close Example3
