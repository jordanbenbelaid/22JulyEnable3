package com.qa.entity;

public class Dog {

	//Attributes to the dog object that will be created
	private String name;
	private String breed;
	
	//default constructor
	public Dog() {
		
	}
	
	//everything constructor
	public Dog(String name, String breed) {
		this.breed = breed;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog: name: " + name + ", breed: " + breed;
	}
	
}
