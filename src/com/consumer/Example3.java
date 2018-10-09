package com.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.entities.Student;

public class Example3 {

	public static void main(String[] args) {

		List<Student> l=new ArrayList<>();
 		populate(l);
 		
 		Predicate<Student> p=s->s.getMark()>=60;
 		
 		Function<Student,String> f=s->{
 			
 			int mark=s.getMark();
 			
 			if(mark >=80) {
 				return "Distintion";
 			}
 			else if(mark>=60) {
 				return "Class A";
 			}
 			else if(mark>=50) {
 				return "Class B";
 			}
 			else {
 				return "Class D";
 			}
 			
 		};//Close function lambda expression
 		
		Consumer<Student> c=s->{
			System.out.println("Student name : "+s.getName());
			System.out.println("Student mark : "+s.getMark());
			System.out.println("Studen grade : "+f.apply(s)+"\n");
		};//Close consumer lambda expression
 		
		for (Student s : l) {
			if (p.test(s)) {
				c.accept(s);
			}//Close if
		}//Close for 		

	}//Close main

	private static void populate(List<Student> l) {
		
		l.add(new Student("Alex",100));
		l.add(new Student("Luis",85));
		l.add(new Student("Pedro",35));
		l.add(new Student("Ramiro",70));
		l.add(new Student("Rafa",50));
		l.add(new Student("Alberto",95));
		
	}//Close populate

}//Close Example3
