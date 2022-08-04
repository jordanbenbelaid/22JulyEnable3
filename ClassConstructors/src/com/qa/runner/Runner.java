package com.qa.runner;

import com.qa.entity.Dog;

public class Runner {

	public static void main(String[] args) {
		Dog dogOne = new Dog();
		Dog dogTwo = new Dog("Bennie", "Labrador");
		
		System.out.println(dogTwo);
	}

}
