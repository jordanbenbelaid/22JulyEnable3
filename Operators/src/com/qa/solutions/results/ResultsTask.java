package com.qa.solutions.results;

public class ResultsTask {
	
		public void marks(int chem, int physics, int maths) {
			System.out.println("You got " + chem + " marks for chemistry");
			System.out.println("You got " + physics + " marks for physics");
			System.out.println("You got " + maths + " marks for maths");
			
			int total = chem + maths + physics;
			
			System.out.println("Overall, you achieved " + total + "/450");
			
			//Type casting - (double) converts total from an int to a double for us
			double percentage = (double)Math.round(total*100)/450;
			
			System.out.println("Your total percentage of all subjects is: " + percentage + "%");
		}

}
