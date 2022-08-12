package com.qa.demo;

public class Runner {

	public static void main(String[] args) {
		System.out.println("======== COW ========");
		Cow cow = new Cow();
		cow.speak();
		cow.sleep();
		
		System.out.println("======== ANIMAL ========");
		Animal animalCow = new Cow();
		animalCow.sleep();
		((Cow)animalCow).speak();
		
		System.out.println("======== OBJECT ========");
		Object objectCow = new Cow();
		((Cow)objectCow).speak();
		((Cow)objectCow).sleep();
		
		Object animalObject = new Animal();
		((Animal)animalObject).sleep();
	}

}
