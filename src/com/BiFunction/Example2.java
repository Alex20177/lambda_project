package com.BiFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

import com.entities.Student;

public class Example2 {

	public static void main(String[] args) {

		List<Student> l= new ArrayList<>();
		
		BiFunction<String, Integer, Student> b1=(n,m)->new Student(n,m);
		Consumer<Student> c1 =s->System.out.println(s);
		
		l.add(b1.apply("Alex", 90));
		l.add(b1.apply("Luis",78 ));
		l.add(b1.apply("Carlos",90 ));
		l.add(b1.apply("Juan", 100));
		l.add(b1.apply("Pedro", 95));
		
		for(Student t: l) 
			c1.accept(t);
		
	}//Close main

}//Close Example2
