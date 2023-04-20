package com.oops.abstraction_interface.demo;

public class InterfaceDemo {
	public static void main(String[] args) {
		
		Animal dog = new Dog();
		System.out.println(dog.animalSound()); //bow bow
		
		Animal cat = new Cat();
		System.out.println(cat.animalSound()); //meow
		
		

	}

}
