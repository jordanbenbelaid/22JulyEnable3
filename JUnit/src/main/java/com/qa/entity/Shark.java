package com.qa.entity;

public class Shark {

	private String food;
	private int weight;
	private String type;
	
	public Shark() {}
	
	public Shark(String food, int weight, String type) {
		super();
		this.food = food;
		this.weight = weight;
		this.type = type;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Shark [food=" + food + ", weight=" + weight + ", type=" + type + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((food == null) ? 0 : food.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shark other = (Shark) obj;
		if (food == null) {
			if (other.food != null)
				return false;
		} else if (!food.equals(other.food))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	} 
	
	
	
}
