package com.qa.task.runner;

import com.qa.task.code.Calculator;

public class Runner {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		System.out.println(calc.add(10, 4));
	}

}
