package com.qa.demo;

public class Bird {

	private boolean canFly;
	private String food;
	
	
	public Bird(boolean canFly, String food) {
		this.canFly = canFly;
		this.food = food;
	}


	public boolean isCanFly() {
		return canFly;
	}


	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}


	public String getFood() {
		return food;
	}


	public void setFood(String food) {
		this.food = food;
	}


	@Override
	public String toString() {
		return "Bird\n   canFly: " + canFly + "\n   food=" + food;
	}
	
	public void speak() {
		System.out.println("Tweet");
	}
	
}
