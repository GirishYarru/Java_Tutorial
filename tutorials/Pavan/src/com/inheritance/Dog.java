package com.inheritance;

public class Dog extends Animal {

	public Dog() {
//		super(5);
		super(23,'r');
		System.out.println("dog constructor");
	}
	
	public void m3(){
		System.out.println("m3 in dog");
	}
	public static void main(String[] args) {
		System.out.println("main in dog");
		Dog objDog = new Dog();
	}

}
