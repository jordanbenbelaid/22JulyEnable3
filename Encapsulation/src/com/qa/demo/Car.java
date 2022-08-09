package com.qa.demo;

public class Car {

	//Attributes
	private int mileage;
	private String make;
	private String colour;
	
	//Constructors
	//Default constructor
	public Car() {	}

	//Everything constructor
	public Car(int mileage, String make, String colour) {
		this.mileage = mileage;
		this.make = make;
		this.colour = colour;
	}
	
	//Getters and setters
	//Getter
	public int getMileage() {
		return mileage;
	}
	
	public String getMake() {
		return make;
	}
	
	public String getColour() {
		return colour;
	}
	
	//Setter
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setColour(String colour){
		this.colour = colour;
	}

	
	//ToString
	@Override
	public String toString() {
		return "Car \n      mileage: " + mileage + "\n      make: " + make + "\n      colour: " + colour;
	}
	
	
}
