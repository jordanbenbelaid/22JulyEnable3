package com.qa.demo;

public class Eagle extends Bird implements Fly {

	@Override
	public void fly() {
		System.out.println("I can fly the fastest");
		
	}
}
