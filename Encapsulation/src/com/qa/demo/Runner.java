package com.qa.demo;

public class Runner {

	public static void main(String[] args) {
		Car audi = new Car(1000, "Audi", "Black");
//		System.out.println(audi);
		
		System.out.println(audi.getColour());
		audi.setColour("White");
		System.out.println(audi.getColour());
	}

}
