package com.app.fruits;

public class Mango extends Fruit {

	public Mango(String name, double weight, String color) {
		super(name, color, weight);
	}
	public String taste() {
		return "sweet";
	}
	@Override
	public String toString() {
		return "Mango [name=" + name + ", color=" + color + ", weight=" + weight + ",";
	}
}
