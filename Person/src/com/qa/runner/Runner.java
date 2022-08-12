package com.qa.runner;

import com.qa.entity.Person;
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
	}

}
