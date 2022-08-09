package com.qa.demo;

public class Demo {

	public static void main(String[] args) {
		//While loop
		
		int counter = 0;
		while(counter < 10) {
			System.out.println("This has printed " + counter + " many times");
			counter++;
		}
		
		//do while loop
		boolean hasEleven = true;
		int playerCount = 0;
		
		do {
			System.out.println("There are " + playerCount + " players on your team");
			playerCount++;
			
			if(playerCount > 11) {
				hasEleven = false;
			}
		} while(hasEleven);
		
		//for loop
		// int i - 0 - This is the start point for the loop
		// i < 11 - This is the end point of the loop (less than or more than depending on start point and inc/dec
		// i++ - This is i incrementing after each iteration (could do i-- for decrementing)
		
		for(int i = 1; i < 11 ; i++) {
			System.out.println(i*i);
		}
		
		for(int i = 0; i < 11; i++) {
			for(int j = 0; j < i; j++) {
				System.out.println(i);
			}
		}
		
	}

}
