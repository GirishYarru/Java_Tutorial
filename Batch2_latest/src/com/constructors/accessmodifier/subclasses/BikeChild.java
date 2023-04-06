package com.constructors.accessmodifier.subclasses;

import com.constructors.accessmodifier.Bike;

public class BikeChild extends Bike {

	public void m1() {
		System.out.println(index);
	}

	public static void main(String[] args) {
		Bike b = new Bike();
		// b.mialege //default variables cannot be accessed with in all classes in
		// different package
		System.out.println(b.address);
		System.out.println(index);

	}
}
