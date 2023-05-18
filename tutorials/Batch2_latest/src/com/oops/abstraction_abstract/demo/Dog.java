package com.oops.abstraction_abstract.demo;

public class Dog extends Animal {

	public Dog() {
		System.out.println("======In Dog=============");
	}

	@Override
	public String animalSound() {
		// TODO Auto-generated method stub
		return "bow bow";
	}

}
