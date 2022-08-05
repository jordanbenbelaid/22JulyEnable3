package com.qa.solutions.calc;

public class CalcRevisited {

	public double add(double x, double y) {
		double result = x + y;
		return result;
	}
	
	public double subtract(double x, double y) {
		double result = x - y;
		return result;
	}
	
	public double multiply(double x, double y) {
		double result = x * y;
		return result;
	}
	
	public double divide(double x, double y) {
		double result = x / y;
		return result;
	}
	
	public String divideUpdated(double x, double y) {
		if(x <= y) {
			double total = x / y;
			return String.valueOf(total);
		} else {
			return "Please make the first number the same or bigger than the second number";
		}
	}
	
}
