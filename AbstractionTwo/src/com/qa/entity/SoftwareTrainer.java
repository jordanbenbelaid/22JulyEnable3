package com.qa.entity;

import com.qa.interfaces.Teaching;

public class SoftwareTrainer extends Job implements Teaching{

	@Override
	public void describeJob() {
		System.out.println("I train people in software, its pretty fun");		
	}

	@Override
	public void hoursWorked() {
		System.out.println("I have worked for 20 hours this week");	
	}

	@Override
	public void doJob() {
		System.out.println("Coding in java and other stuff too");	
	}

	@Override
	public void teach() {
		System.out.println("I teach people");
		
	}

}
