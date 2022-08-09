package com.qa.solution;

public class Questions {

	public void questionOne() {
		int [] nums = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
	
	public void questionTwo() {
		int [] nums = new int[10];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i+1;
			System.out.println(nums[i] * 10);
		}
	}
}
