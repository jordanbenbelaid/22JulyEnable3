package com.qa.entity;

public class Pet {

		private String typePet;
		private String name;
		private String foodType;
		private int age;
		
		public Pet() {}

		public Pet(String typePet, String name, String foodType, int age) {
			super();
			this.typePet = typePet;
			this.name = name;
			this.foodType = foodType;
			this.age = age;
		}

		@Override
		public String toString() {
			return "Pet [typePet=" + typePet + ", name=" + name + ", foodType=" + foodType + ", age=" + age + "]";
		}
		
		
	
}
