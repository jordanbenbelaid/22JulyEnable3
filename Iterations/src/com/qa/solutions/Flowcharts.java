package com.qa.solutions;

public class Flowcharts {

	public static void main(String[] args) {
		//question 1
		for(int i = 100; i <= 201; i++) {
			System.out.println('A');
		}
		
		//question 2
		for(int i = 100; i <=201; i++) {
			if(i % 2 == 0) {
				System.out.println('-');
			} else {
				System.out.println('*');
			}
		}
		
		//question 3
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.println(i);
			}
		}
		
		//question 5
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.println(i);
			}
		}
		
		
	}

}
