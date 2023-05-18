package com.demo;

public class EvenOdd extends Thread {
	static int count = 1;

	public void printEvenNumbers() throws InterruptedException {
		synchronized (this) {
			while (count <= 10) {
				if (count % 2 == 0) {
					System.out.println(count++);
					this.notify();

				} else {
					this.wait();
				}
			}

		}

	}

	public void printOddNumbers() throws InterruptedException {

		synchronized (this) {
			while (count <= 10) {
				if (count % 2 != 0) {
					System.out.println(count++);
					this.notify();
				} else {
					this.wait();
				}
			}

		}

	}

}
