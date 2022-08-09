package com.qa.demo;

public class DemoArray {

	public static void main(String[] args) {
		// SINGLE DIMENSIONAL ARRAYS
		// way 1 to make an array, empty with no values
		int[] ageArray;

		// way 2, make an array with the values in it already
		String[] names = { "Jordan", "Lucy", "Brian", "Sarah" };
		// looping through an array
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		// way 3, making an empty array that holds a certain amount of values
		String[] food = new String[5];
		// adding a value to an array
		food[0] = "Chicken";

		// MULTI DIMENSIONAL ARRAYS
		// way 1
		int[][] nums;

		// way 2
		int[][] arrayNums = { { 1, 3, 5, 7, 9 }, { 2, 4, 6, 8, 10 }, { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 } };
		//looping through a multi dimensional array
		for(int i = 0; i < arrayNums.length; i++) {
			for(int j = 0; j<arrayNums[i].length; j++) {
				System.out.println(arrayNums[i][j]);
			}
		}
		
		// way 3
		int [][] primeNums =  new int [2][5];
		//Adding a value to a multi dimensional array
		primeNums[1][2] = 7;
	}

}
