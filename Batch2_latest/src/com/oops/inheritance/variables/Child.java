package com.oops.inheritance.variables;

public class Child extends Parent {

	int i = 200;
	
	
	public void message() {
		System.out.println(i); // 200
		System.out.println(super.i);//100
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.message();

	}

}
