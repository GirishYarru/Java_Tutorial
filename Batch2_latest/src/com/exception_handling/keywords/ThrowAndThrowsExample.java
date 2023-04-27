package com.exception_handling.keywords;

import java.io.FileNotFoundException;

public class ThrowAndThrowsExample {

	public void m1() {
		throw new NullPointerException("un known excdption encountered");

	}

	public void m2() {
		try {
			m1();

		} catch (NullPointerException e) {
			System.out.println("Hii");
		}
		System.out.println("After m1 exception");
	}

	public void m3() throws FileNotFoundException {
		throw new FileNotFoundException("file not found exception");

	}

	public void m4() {
		try {
			m3();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args) {

		ThrowAndThrowsExample t = new ThrowAndThrowsExample();
		// t.m2();
		t.m4();

	}

}
