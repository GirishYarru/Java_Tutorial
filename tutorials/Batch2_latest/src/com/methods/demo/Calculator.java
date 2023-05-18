package com.methods.demo;

import com.constructors.accessmodifier.Bike;

public class Calculator {
	
	int temp = 10;
	static int index= 10;

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public String welcome() {
		return "Welcome";
	}
	
	public void hai() {
		
		String str = "good moring";
		
		System.out.println("helloooo"+str);
		
		
		
	}

	public static void main(String[] args) {
		System.out.println(" Hi welcome!");
		Calculator cal = new Calculator();
		System.out.println(" 1st operation - multiplication");
	//	int c = cal.multiply(3, 5);
		System.out.println(cal.add(3, 5));
		cal.hai();

	}

}
