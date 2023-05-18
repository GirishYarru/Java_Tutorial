package com.exception_handling.customException;

public class CustomeExceptionDemo {
	public void m1(int age) throws InValidAgeException {
		if (age < 0 || age > 100) {
			throw new InValidAgeException("Please enter valid age");
		} else {
			System.out.println("valid age");
		}

	}

	public static void main(String[] args) throws InValidAgeException {
		CustomeExceptionDemo obj = new CustomeExceptionDemo();
		obj.m1(1);
		
		obj.m1(-1);

	}

}
