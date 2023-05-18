package com.oops.encapsulation;

public class EncapsulationDemo {
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		/*
		 * System.out.println(obj.major); obj.major = -1;
		 * 
		 * System.out.println(obj.major);
		 */
		
		//int age = obj.getMajor();
		//System.out.println(age);
		obj.setMajor(18);
		obj.setMajor(-1);
		System.out.println(obj.getMajor());
	}

}
