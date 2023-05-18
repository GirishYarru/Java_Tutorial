package com.variables;

public class Calculator {
	
	public static int add(int a,int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	
	public void wish(String name) {
		
		System.out.println("Hi welcome "+ name);
	}
	
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		//int res = obj.add(5, 3);
		
		System.out.println(Calculator.add(5, 3));
		System.out.println(obj.add(5, 5));
		
		obj.wish("pavan");
		obj.wish("girish");
		
		
	}

}
