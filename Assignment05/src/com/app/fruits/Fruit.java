package com.app.fruits;

public class Fruit {
	String name ;
	String color ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	double weight ;
	boolean isFresh = true;
	public Fruit(String name, String color, double weight) {
		this.name = name;
		this.color = color;
		this.weight = weight;
	}
	public String toString() {
		return "Fruit [Name=" + name + ", Color=" + color + ", Weight=" + weight + ",";
	}
	public String taste() {
		return "No specific taste";
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	
	
}
