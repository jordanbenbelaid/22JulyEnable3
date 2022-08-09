package com.qa.solutions;

import java.util.ArrayList;
import java.util.List;

public class Task {
	
	List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);

	public void questionOne() {
		List<String> names = new ArrayList<>();
		
		names.add("Jordan");
		names.add("Ben");
		names.add("Sarah");
		names.add("Luke");
		names.add("Sam");
		
		for(String s : names) {
			System.out.println(s);
		}
	}
	public void questionTwo() {
		for(int i : nums) {
			System.out.println(Math.round(Math.pow(i, 2)));
		}
	}
	
	public Boolean evenOdd(int x) {
		if(x % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void questionFour() {
		for(int i : nums) {
			if(evenOdd(i)) {
				System.out.println("The number " + i + " cubed is: " + Math.round(Math.pow(i, 3)));
			} else {
				System.out.println("The number " + i + " squared is: " + Math.round(Math.pow(i, 2)));
			}
		}
	}

}
