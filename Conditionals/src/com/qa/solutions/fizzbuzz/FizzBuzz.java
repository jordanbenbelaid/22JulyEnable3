package com.qa.solutions.fizzbuzz;

public class FizzBuzz {

	public String fizzBuzz(int x) {
		if(x % 15 == 0) {
			return "FizzBuzz";
		} else if(x % 5 == 0) {
			return "Buzz";
		}else if(x % 3 == 0) {
			return "Fizz";
		}else {
			return String.valueOf(x);
		}
	}
}
