package com.oops.inheritance.methods;

public class Child extends Parent {

	public void m2() {
		System.out.println("child class m2()");
	}

	@Override
	public void m1() {

		System.out.println("In child class m1()");

	}

	public static void main(String[] args) {
		Child obj = new Child();
		obj.m1(); // "In parent m1()"

		Parent p = new Parent();
		// p.m2(); //parent cant access child methods
		p.m1(); // In parent m1()

		Parent cp = new Child();
		// cp.m2();
		cp.m1(); // In child class m1()
		cp.m3();

		// Child c = new Parent(); //not possible

	}

}
