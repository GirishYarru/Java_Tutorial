package com.variables.demo;

public class BikeDemo {
	
	public static void main(String[] args) {
		
		Bike rE = new Bike();
		
		System.out.println("rE model ::"+ rE.model);
		System.out.println("re color :: "+rE.color);
		
		System.out.println();
		
		
		Bike duke = new Bike();
		System.out.println("duke model ::"+duke.model);
		System.out.println("duke color ::"+duke.color);
		
		duke.color = "orange";
		System.out.println("duke color ::"+duke.color);
		
		//access static variables
		//using class Name
		System.out.println("static variable a ::"+Bike.a);
		System.out.println("static variable for RE  ::"+rE.a);
		System.out.println("static variable for duke  ::"+duke.a);
		
		rE.a = 30;
		System.out.println("static variable a ::"+Bike.a);
		System.out.println("static variable for RE  ::"+rE.a);
		System.out.println("static variable for duke  ::"+duke.a);
		
		
		rE.m1();
		
		rE.m2();
		
	}

}
