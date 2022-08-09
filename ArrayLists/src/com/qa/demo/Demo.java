package com.qa.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		//makes the list with the values inside it already
//		List<Integer> nums = List.of(1,2,3,4,5,6,7);
		
		//becomes immutable - means it cannot be changed in any way
		List<String> food = List.of("Pizza", "Pasta", "Noodles", "Ice Cream");

		//creates and empty list
		List<String> names = new ArrayList<>();
		
		//adding to a list
		names.add("Jordan");
		names.add("Brittany");
		names.add("Maddison");
		names.add("John");
		names.add("Bill");
		
		//getting an element in the list
		System.out.println(names.get(1));
		
		//setting an element in the list
		//0 is the index, "Jabril" is what we are changing index 0 to
		names.set(0, "Jabril");
		System.out.println(names.get(0));
		
		//removing something from a list
		names.remove(4);
		
		//size of the list
		names.size();
		
		//clearing a list
//		names.clear();
		
		//sorting through names
		Collections.sort(names);
		
		//swapping the positions of 2 elements in a list
		Collections.swap(names, 0, 2);
		
		//printing a list
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		//Enhanced For loops
		//String - the type of data the list contains
		//s - a variable that could be anything we wanted
		//names - the name of the list we want to print
		for(String s : names) {
			System.out.println(s);
		}
		
	}

}
