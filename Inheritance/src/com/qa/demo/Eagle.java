package com.qa.demo;

public class Eagle extends Bird{

	private String speed;
	private String habitat;
	private int talons;

	public Eagle(boolean canFly, String food, String speed, String habitat, int talons) {
		super(canFly, food);
		this.speed = speed;
		this.habitat = habitat;
		this.talons = talons;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public int getTalons() {
		return talons;
	}

	public void setTalons(int talons) {
		this.talons = talons;
	}

	@Override
	public String toString() {
		return "Eagle\n   speed: " + speed + "\n   habitat: " + habitat + "\n   talons:" 
				+ talons + "\n   Can it fly?: " + isCanFly() + "\n   food:" + getFood();
	}
	
	@Override
	public void speak() {
		System.out.println("Tweet Tweet Tweet");
	}
	
	
}
