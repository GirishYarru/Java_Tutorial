package com.exception_handling;

public class UncheckedExceptionDemo {

	public void m1() throws ArithmeticException {

		int a = 0;
		int b = 5;
//		try {
		System.out.println(b / a);
//		} catch (ArithmeticException e) {
//			System.out.println("****************");
//		}
		System.out.println("HOIIIIIIIIIIIIIIIIIII");

	}

	public static void main(String[] args) {
		UncheckedExceptionDemo obj = new UncheckedExceptionDemo();
		try {
			obj.m1();

		} catch (ArithmeticException e) {
			System.out.println("==================");
		}

		System.out.println(" in main method");
	}

}
