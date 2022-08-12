package com.qa.runner;

import com.qa.entity.Person;
import com.qa.entity.Pet;
import com.qa.handler.PersonHandler;

public class Runner {

	public static void main(String[] args) {
		PersonHandler handler = new PersonHandler();
		
		Person person1 = new Person("Jordan", 25, "Trainer");
		Person person2 = new Person("Brad", 21, "Retail");
		Person person3 = new Person("Michelle", 32, "Developer");
		Person person4 = new Person("Jamie", 46, "Streamer");
		Person person5 = new Person("Bridget", 19, "Dog groomer");

		
		handler.addPerson(person1);
		handler.addPerson(person2);
		handler.addPerson(person3);
		handler.addPerson(person4);
		handler.addPerson(person5);
		
		handler.print();
		
		System.out.println("============================================");
		
//		System.out.println(handler.findByName("michelle"));
		
		handler.removePerson(person3);
		
		handler.print();
		
		System.out.println("============================================");
		
		//PETS EXTENSION
		Pet pet1 = new Pet("Cat", "Catty", "Cat food", 5); 
		Pet pet2 = new Pet("Dog", "Doggy", "Dog food", 4); 
		Pet pet3 = new Pet("Tiger", "Tigger", "Animals", 1); 
		Pet pet4 = new Pet("Fish", "Fishy", "Fish food", 6); 
		Pet pet5 = new Pet("Monkey", "Monky", "Bananas", 3);
		
		person1.addPet(pet5);
		person1.addPet(pet1);
		
		person2.addPet(pet3);
		
		person3.addPet(pet2);
		person3.addPetDifferent("Crocodile", "Croc", "Small Animals", 29);
		
		person4.addPet(pet4);
		person4.addPet(pet3);
		person4.addPet(pet2);
		
		handler.print();
	}

}
