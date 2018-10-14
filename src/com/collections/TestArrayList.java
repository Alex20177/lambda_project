package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer>{

		public int compare(Integer o1, Integer o2) {
			return (o1>o2)?-1:(o1<o2)?1:0;
		}//Close compare

	}//Close myComparator class

public class TestArrayList {
	
	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(15);
		l.add(0);
		l.add(20);
		l.add(10);
		l.add(25);
		l.add(40);
		
		System.out.println("List before sort = "+l);
		
		Collections.sort(l);
		//Collection c;
		System.out.println("List after sort = "+l);
		
		//Collections.sort(l,new MyComparator());
		
		//Using lambda expression
		Collections.sort(l,(I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
		
		//(I1,I2)->(I1>I2)?-1:(I1<I2)?1:0
		//I2.compareTo(I1)
		
		System.out.println("List descending order = "+l);
		
	}//Close main method.

}//Close TestArrayList class.
