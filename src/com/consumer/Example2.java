package com.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.entities.Movie;

public class Example2 {

	public static void main(String[] args) {

		Consumer<Movie> c=m->{
			
			System.out.println("Movie Name : "+m.getName());
			System.out.println("Movie Hero : "+m.getHero());
			System.out.println("Movue Heroine : "+m.getHeroine()+"\n");
			
		};//Close consumer lambda expression
		
		List<Movie> l=new ArrayList<>();
		populate(l);
		
		for(Movie m : l)
			c.accept(m);
		
	}//Close main

	private static void populate(List<Movie> l) {
		
		l.add(new Movie("Terminator","T-800","T-900"));
		l.add(new Movie("He-Man","He-Man","Orco"));
		l.add(new Movie("Alien","Hyperion","Alien"));
		l.add(new Movie("Batman","Batman","Joker"));
		
	}//Close populate
	
}//Close Example2
