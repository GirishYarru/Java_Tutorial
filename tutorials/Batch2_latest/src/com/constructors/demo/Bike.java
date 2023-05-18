package com.constructors.demo;

public class Bike {
	int model;
	int mialege;
	
	
	public Bike() {
		this(5,6);
		System.out.println(" ** in default constructor **");
		
		
	}
	
	public Bike(int a) {
		this();
		System.out.println(" ** in one arg constructor **");
		
	}
	
	public Bike(int a, int b){
		
		this.model = a;
		this.mialege = b;
		
	}
	
	public static void main(String[] args) {
		
		Bike b1 = new Bike();//b1.model  = 5, b1.mialege = 6
		
	}
	
	

	
	

}
