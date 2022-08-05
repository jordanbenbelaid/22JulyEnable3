package com.qa.solutions.runner;

import com.qa.solutions.calc.CalculatorTask;
import com.qa.solutions.results.ResultsTask;

public class Runner {

	public static void main(String[] args) {
//		CalculatorTask calc = new CalculatorTask();
//		System.out.println(calc.add(10, 5));
//		System.out.println(calc.subtract(10, 5));
//		System.out.println(calc.multiply(10, 5));
//		System.out.println(calc.divide(11, 5));
		
		ResultsTask result = new ResultsTask();
		result.marks(90, 140, 109);
	}

}
