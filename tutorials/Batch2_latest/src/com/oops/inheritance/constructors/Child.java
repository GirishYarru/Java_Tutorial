package com.oops.inheritance.constructors;

public class Child extends Parent {

	public Child() {
		// super(10);
		System.out.println("in child");
	}

	public static void main(String[] args) {
		Child c = new Child();

		Parent p = new Parent();

		Parent cp = new Child();
	}

}
