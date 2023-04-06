package com.constructors.accessmodifier;

public class AccessModifierDemo {
	public static void main(String[] args) {
		Bike b = new Bike();
		//System.out.println(b.model);// model is private
		//b.wish(); //method is private
		System.out.println(b.mialege);//default
		System.out.println(b.address); //public varable

	}

}
