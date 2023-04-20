package com.oops.abstraction_abstract.demo;

public abstract class Animal {
	
	int x;
	int y;
	
	public Animal() {
		
		System.out.println("-------------In Animal--------------");

		
	}

	public abstract String animalSound();

	public String color() {
		return "black";
	}

}
