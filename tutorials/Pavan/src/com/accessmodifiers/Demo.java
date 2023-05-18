package com.accessmodifiers;

public class Demo {
	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		System.out.println(obj.a);
		//System.out.println(obj.b);
		obj.wish();
		int res = obj.a;
	}

}
