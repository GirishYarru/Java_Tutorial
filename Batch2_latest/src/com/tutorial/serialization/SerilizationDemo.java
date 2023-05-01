package com.tutorial.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerilizationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog d = new Dog();
		d.setName("husky");
		d.setAge(1);

		// Dog d1 = new Dog("German", 2);

		FileOutputStream fos = new FileOutputStream("C:\\codebase\\seriialization_demo\\Dog.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d);

		// deserialization
		FileInputStream fis = new FileInputStream("C:\\codebase\\seriialization_demo\\Dog.txt");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Dog d1 = (Dog) ois.readObject();

		System.out.println(d1.getName() + " :: " + d1.getAge());

	}

}
