package com.operators;

public class OperatorsDemo {
	
	public static void main(String[] args) {
		//Arithmatic operatos
		int a = 5;
		int b = 5;
		
		// +
		System.out.println(a+b);
		
		
		System.out.println(a-b);
		
		//*
		System.out.println(a*b);
		
		// /
		System.out.println(a/b);
		
		System.out.println(a%b);
		
		//Assignment Operators
		//=
		int c = a+b;
		
		int res = a+=b; //a=a+b;
		System.out.println(res);
		int res1= a-=b;//(a= a-b)
		
		
		//==
	System.out.println(a==b);
	//!=
	
	System.out.println(a!=5);//false
	//>
	System.out.println(a>5); //false
	
	System.out.println(a>=5);//true
	
	//<
	//<=
	
	System.out.println(a>=b);
	System.out.println(a<=b);
	
	
	//Logical Operatord
	
	//&& - and
	System.out.println(a==6 && b==5); //false
	
	System.out.println(a==4 && b==5);
	
	System.out.println(a==4 || b==5);//true;
	
	
	//Ternary  operator
	// similar to if else condition
	//condition? true: false
	System.out.println(a==5? "mastan": "dhanush");
	if(a ==5) {
		System.out.println("mastan");
	}else {
		System.out.println("dhanush");
	}
		
	
		
	}

}
