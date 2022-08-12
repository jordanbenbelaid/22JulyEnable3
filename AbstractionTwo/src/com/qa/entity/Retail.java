package com.qa.entity;

public class Retail extends Job{

	@Override
	public void describeJob() {
		System.out.println("I stock shelves and take payments from customer");	
	}

	@Override
	public void hoursWorked() {
		System.out.println("I work part time");	
	}

	@Override
	public void doJob() {
		System.out.println("Customer service and helping customers find what they need");	
	}

}
