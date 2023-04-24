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
		
		for(Integer var : arr) {
			System.out.println(var);
		}
		
	}

	public static void main(String[] args) {
		LoopsDemo obj = new LoopsDemo();
		obj.normalForLoop();
		
		int[] arr = {100,101,102,103,104};
		
		obj.enhancedForLoop(arr);
		

	}

}
