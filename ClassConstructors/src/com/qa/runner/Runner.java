package com.qa.runner;

import com.qa.entity.Dog;

public class Runner {

	public static void main(String[] args) {
		Dog dogOne = new Dog();
		Dog dogTwo = new Dog("Bennie", "Labrador");
		
		dogOne.hello();
		dogTwo.print();
		System.out.println(dogTwo);
	}

}
