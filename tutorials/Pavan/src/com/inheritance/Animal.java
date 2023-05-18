package com.inheritance;

public class Animal {
//	public Animal(){
//	  System.out.println("in animal class");
//	}
	public Animal(int a) {
		System.out.println("in arg const" + a);
	}
	public Animal(int aa,char bb) {
		System.out.println("2 arg constr"+aa+bb);
	}
	public int m1() {
		System.out.println("in m1");
		return 1;
	}
	public void m2() {
		System.out.println("in m2");
	}

}
