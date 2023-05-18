package com.constructors.accessmodifier;

public class Bike {
   //private
	private int model = 2023;
   //default
	int mialege = 35;
	// public
	public String address = "hyd";
	
	//protected
	protected  static int index = 5;
	
	final int i = 10;
	
	
	private String wish() {
		
		return "hello";
		//i=20; final variables cannot be modified
		
	}

	public static void main(String[] args) {

		Bike b = new Bike();

		System.out.println(b.model);
		System.out.println(b.mialege);
		System.out.println(b.address);
		b.wish();

	}

}
