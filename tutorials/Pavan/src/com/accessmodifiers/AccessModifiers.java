package com.accessmodifiers;

public class AccessModifiers {

	int a = 5;
	
	private static int b = 10;

	public void wish() {

	}

	private void display() {

	}

	public static void main(String[] args) {

		AccessModifiers obj = new AccessModifiers();
		System.out.println(obj.a);
		System.out.println(AccessModifiers.b);

		obj.wish();
		obj.display();

	}

}
