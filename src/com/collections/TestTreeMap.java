package com.collections;

import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
		
		//Insert a comparator object as argument to TreeMAp, in order to define a new way to sort the elements
		//in the collection (TreeMap)
		//TreeMap<Integer, String> m = new TreeMap<Integer,String>();
		TreeMap<Integer, String> m = new TreeMap<Integer,String>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);

		m.put(100,"Durga");
		m.put(600,"Summy");
		m.put(300,"Bunny");
		m.put(200,"Chinny");
		m.put(700,"Vinny");
		m.put(400,"Pinny");
			
		System.out.println("m = "+m);
		
	}//Close main method.
	
}//Close TestTreeMap TestTreeMap
