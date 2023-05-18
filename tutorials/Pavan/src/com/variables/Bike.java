package com.variables;

public class Bike {
	static String engine = "AC";
	int model = 2023;
	String color = "black";

	public void wish() {
		
		int temp = 20;
		
		System.out.println(temp);

	}

	public static void main(String[] args) {

		Bike royalEn = new Bike();

		System.out.println(royalEn.model);// 2023
		royalEn.model = 2021;

		System.out.println(royalEn.model);// 2021

		Bike duke = new Bike();
		System.out.println(duke.model);// 2023

		// static variables
		System.out.println(royalEn.engine);
		System.out.println(duke.engine);

		duke.engine = "OC";
		System.out.println(duke.engine);// OC
		System.out.println(royalEn.engine); // OC

		System.out.println(Bike.engine);
		
		royalEn.wish();

	}

}
