package com.qa.entity;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String name;
	private int age;
	private String jobTitle;
	private List<Pet> pets = new ArrayList<>();
	
	public Person() {}

	public Person(String name, int age, String jobTitle) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	public Person(String name, int age, String jobTitle, List<Pet> pets) {
		super();
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		this.pets = pets;
	}
	
	//adding a pet
	public void addPet(Pet pet) {
		pets.add(pet);
	}
	
	//different way of adding a pet
	public void addPetDifferent(String type, String name, String food, int age) {
		Pet pet = new Pet(type, name, food, age);
		pets.add(pet);
	}
	
	//removing a pet
	public void removePet(Pet pet) {
		pets.remove(pet);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jobTitle=" + jobTitle + "\nAll of " + name + "'s pets: " + pets;
	}
	
	
}
