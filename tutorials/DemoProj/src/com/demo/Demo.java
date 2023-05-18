package com.demo;

public class Demo {

	public static void main(String[] args) {
		EvenOdd eo = new EvenOdd();
		Runnable r1 = () -> {

			try {
				eo.printEvenNumbers();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};

		Runnable r2 = () -> {

			try {
				eo.printOddNumbers();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();

	}

}
