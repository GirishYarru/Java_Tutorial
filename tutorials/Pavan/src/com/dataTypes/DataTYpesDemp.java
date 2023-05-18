package com.dataTypes;

import com.accessmodifiers.AccessModifiers;

public class DataTYpesDemp {
	static int a;
	
	public static void main(String[] args) {
		//default value for int is 0
		System.out.println(a);
		
		
		//widening
		byte b = 127;
		int i = b;
		System.out.println(i);
		
		//Narrowing
		int i1 = 200;
		 byte b1 = (byte) i1;
		 System.out.println(b1);
		 
		 //data types flow
		 //byte -> short -> int -> long -> float -> double
		 
		
	}

}
