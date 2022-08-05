package com.qa.solutions.results;

public class ResultsRevisited {

	private int physics, chem, maths, failed;

	public void physics(int p) {
		if (p >= 0 && p <= 150) {
			physics = p;

			if (p < 90) {
				failed++;
				System.out.println("You have failed physics!");
			}
		} else {
			System.out.println("You have not entered a valid score!");
		}
	}

	public void chem(int c) {
		if (c >= 0 && c <= 150) {
			chem = c;

			if (c < 90) {
				failed++;
				System.out.println("You have failed chemistry!");
			}
		} else {
			System.out.println("You have not entered a valid score!");
		}
	}

	public void maths(int m) {
		if (m >= 0 && m <= 150) {
			maths = m;

			if (m < 90) {
				failed++;
				System.out.println("You have failed maths!");
			}
		} else {
			System.out.println("You have not entered a valid score!");
		}
	}

	public void showResults() {
		int total;
		float percentage;

		total = physics + chem + maths;
		percentage = (float) total * 100 / 450;

		if (failed == 0) {
			System.out.println("Your total marks were: " + total + "/450");
			System.out.println("Your total percentage was: " + percentage + "%");
		} else {
			System.out.println("You have failed 1 exam. meaning you have failed overall");
		}

	}
}
