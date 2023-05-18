package com.loops_demo;

public class LoopsDemo {

	public void normalForLoop() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("================================");

		int arr[] = { 5, 6, 7, 8 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public void enhancedForLoop(int[] arr) {

		for (Integer var : arr) {
			System.out.println(var);
		}

	}

	// while loop
	public void whileLoop() {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
	}

	public void doWhileLoop() {
		int i = 1;
		do {

			System.out.println(i);
			i++;

		} while (i <= 10);
	}

	public void infinite_for_loop() {
		for (;;) {
			System.out.println("hii");
		}
	}

	public void infinite_while_loop() {

		while (true) {
			System.out.println("while");
		}

	}

	public void infinite_do_while_loop() {

		do {
			System.out.println("do while");
		} while (true);

	}

	public void breakStatemenrt() {
		for (int i = 0; i <= 5; i++) {

			if (i == 3) {
				break;

			}

			System.out.println(" break demo");

		}
	}

	public void continueStatement() {

		for (int i = 0; i <= 5; i++) {

			if (i == 3) {

				continue;

			}

			System.out.println(" continue demo");

		}

	}

	public static void main(String[] args) {
		LoopsDemo obj = new LoopsDemo();
		System.out.println("==========normal for Loop=============");
		obj.normalForLoop();

		int[] arr = { 100, 101, 102, 103, 104 };

		System.out.println("==========enhanced for Loop=============");

		obj.enhancedForLoop(arr);
		System.out.println("==========While Loop=============");
		obj.whileLoop();
		System.out.println("========== do While Loop=============");
		obj.doWhileLoop();

		System.out.println("========== infinite for Loop=============");
		// obj.infinite_for_loop();

		// obj.infinite_while_loop();

		// obj.infinite_do_while_loop();

		System.out.println("========== break statement=============");
		obj.breakStatemenrt();

		System.out.println("========== continue statement=============");
		obj.continueStatement();

		for (int i = 1; i < 10; i++) {
			boolean flag = true;

			for (int j = 2; j < i; j++) {
				// if the number is divisible by i, then n is not a prime number.
				if (i % j == 0) {
					flag = false;
					break;

				}
			}

			if (flag) {
				System.out.println(" prime number : " + i);
			}

		}

	}

}
