package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class TestCollectionImplementation {

	public static void main(String[] args) {

		//ArrayList implement list interface
		//ArrayList allows duplicate
		//ArrayList preservers order
		ArrayList<String> l = new ArrayList<String>();
		l.add("Sunny");
		l.add("Bunny");
		l.add("Chunny");
		l.add("Sunny");
		System.out.println("ArrayList l = "+l);
		
		//HashSet implements set interface
		//HashSet do not allow duplicate
		//HashSet do not preserver order
		HashSet<String> h = new HashSet<String>();
		h.add("Sunny");
		h.add("Bunny");
		h.add("Chunny");
		h.add("Sunny");
		System.out.println("HashSet h = "+h);		
		
		//HashMap implements map interface
		//HashMap do not allow duplicate keys
		//HashMAp do not preserver order
		HashMap<String,String> m = new HashMap<String,String>();
		m.put("A","Apple");
		m.put("Z","Zebra");
		m.put("Durga","Java");
		m.put("B","Boy");
		m.put("T","Tiger");
		System.out.println("HashMap m = "+m);
		
	}//Close main method.

}//Close TestArryLisHashSet class.
