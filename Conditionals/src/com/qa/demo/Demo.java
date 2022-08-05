package com.qa.demo;

public class Demo {

	public void switchState(int day) {
		
		//"day" can be any type of data you wish, as long as it is used next to the case
		switch(day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("This day doesnt exist");
				break;
		}
		
		
		
		
		
	}
}
