package com.constructors.accessmodifier;

public class Bike {

	private int model = 2023;

	int mialege = 35;

	public static void main(String[] args) {

		Bike b = new Bike();

		System.out.println(b.model);
		System.out.println(b.mialege);

	}

}
