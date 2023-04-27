package com.exception_handling.keywords;

public class FinallyDemo {
	public void m1() {

		try {
			System.out.println(1 / 0);

		} catch (Exception e) {
			System.out.println("in catch block");
			throw new NullPointerException("null pointer");
		} finally {
			System.out.println(" in final block ");
		}

	}
	
	
	public static void main(String[] args) {
		FinallyDemo demo = new FinallyDemo();
		demo.m1();
	}

}
