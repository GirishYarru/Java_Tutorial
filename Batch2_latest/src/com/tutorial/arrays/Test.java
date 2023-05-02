package com.tutorial.arrays;

public class Test {
	public static void main(String[] args) {
		String[] arr = new String[3];

		arr[0] = "abc";
		arr[1] = "def";
		arr[2] = "john";

		for (int index = 0; index < arr.length; index++) {
			System.out.println(arr[index]);
		}

	}

}
