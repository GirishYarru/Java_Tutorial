package com.oops.abstraction_interface.demo;

public class Dog implements Animal,Birds{

	@Override
	public String animalSound() {
		return "bow bow";

	}

	@Override
	public String color() {
		// TODO Auto-generated method stub
		return "black";
	}

	@Override
	public String birdsSound() {
		// TODO Auto-generated method stub
		return "cukoo";
	}

	@Override
	public String birdColor() {
		// TODO Auto-generated method stub
		return "brown";
	}

	@Override
	public String location() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String address(int a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String address() {
		
		System.out.println(Birds.i);
		System.out.println(Animal.i);
		// TODO Auto-generated method stub
		return null;
	}


}
