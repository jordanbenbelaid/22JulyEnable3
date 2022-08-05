package com.qa.solutions.unique;

public class UniqueSum {

	public void unique(int x, int y, int z) {
		if(x == y && y == z) {
			System.out.println(0);
		} else if(x == y) {
			System.out.println(z);
		} else if(y == z) {
			System.out.println(x);
		} else if(x == z) {
			System.out.println(y);
		} else {
			System.out.println(x + y + z);
		}
	}
	
}
