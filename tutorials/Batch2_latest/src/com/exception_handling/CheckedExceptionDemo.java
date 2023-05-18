package com.exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

	public void openFile() {

		try {
			FileInputStream f = new FileInputStream("C:\\Users\\MSUSERSL123\\temp\\hello1.txt");
		} catch (FileNotFoundException e) {
			System.out.println("In valid file path");
		}

		System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
		System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
		System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
		System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
		System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
		System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");

	}

	public void openFile2() throws FileNotFoundException {

		FileInputStream f = new FileInputStream("C:\\Users\\MSUSERSL123\\temp\\hello1.txt");

		System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
		System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
		System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
		System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
		System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
		System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");

	}

	public void m1() {

		try {
			FileInputStream f = new FileInputStream("C:\\Users\\MSUSERSL123\\temp\\hello1.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("HIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");

	}

	public void m2() {
		m1();
	}

	public void m3() throws FileNotFoundException {
		FileInputStream f = new FileInputStream("C:\\Users\\MSUSERSL123\\temp\\hello1.txt");
	}

	public void m4() {
		try {
			m3();
		} catch (FileNotFoundException e) {
			System.out.println("In Catch block");

		}
	}

	public static void main(String[] args) {

		CheckedExceptionDemo obj = new CheckedExceptionDemo();

		obj.openFile();

	}

}
