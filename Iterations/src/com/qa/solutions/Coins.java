package com.qa.solutions;

public class Coins {

	public void change(int cost, int amount) {
		int twentyPounds = 0;
		int tenPounds = 0;
		int fivePounds = 0;
		int twoPounds = 0;
		int onePound = 0;
		int fiftyPence = 0;
		int twentyPence = 0;
		int tenPence = 0;
		int fivePence = 0;
		int twoPence = 0;
		int onePence = 0; 
		
		while(amount - cost >= 2000) {
			twentyPounds++;
			amount -= 2000;
		}
		
		while(amount - cost >= 1000) {
			tenPounds++;
			amount -= 1000;
		}
		
		while(amount - cost >= 500) {
			fivePounds++;
			amount -= 500;
		}
		
		while(amount - cost >= 200) {
			twoPounds++;
			amount -= 200;
		}
		
		while(amount - cost >= 100) {
			onePound++;
			amount -= 100;
		}
		
		while(amount - cost >= 50) {
			fiftyPence++;
			amount -= 50;
		}
		
		while(amount - cost >= 20) {
			twentyPence++;
			amount -= 20;
		}
		
		while(amount - cost >= 10) {
			tenPence++;
			amount -= 10;
		}
		
		while(amount - cost >= 5) {
			fivePence++;
			amount -= 5;
		}
		
		while(amount - cost >= 2) {
			twoPence++;
			amount -= 2;
		}
		
		while(amount - cost >= 1) {
			onePence++;
			amount -= 1;
		}
		
		System.out.print("£20: ");
		System.out.println(twentyPounds);
		System.out.print("£10: ");
		System.out.println(tenPounds);
		System.out.print("£5: ");
		System.out.println(fivePounds);
		System.out.print("£2: ");
		System.out.println(twoPounds);
		System.out.print("£1: ");
		System.out.println(onePound);
		System.out.print("50p: ");
		System.out.println(fiftyPence);
		System.out.print("20p: ");
		System.out.println(twentyPence);
		System.out.print("10p: ");
		System.out.println(tenPence);
		System.out.print("5p: ");
		System.out.println(fivePence);
		System.out.print("2p: ");
		System.out.println(twoPence);
		System.out.print("1p: ");
		System.out.println(onePence);
	}
}
