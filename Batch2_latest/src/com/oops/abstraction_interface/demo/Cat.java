package com.oops.abstraction_interface.demo;

public class Cat implements Animal{

	@Override
	public String animalSound() {

		return "meow";
	}

	@Override
	public String color() {

		return "blsck-white";
	}
	
	public void accessVariable() {
		
		System.out.println(i);
	}

	@Override
	public String location() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String address() {
		// TODO Auto-generated method stub
		return null;
	}

}
