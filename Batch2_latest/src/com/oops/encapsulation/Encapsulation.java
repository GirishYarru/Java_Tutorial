package com.oops.encapsulation;

public class Encapsulation {
	private int major;

	public int getMajor() {
		return major;
	}

	public void setMajor(int major) {
		if (major >= 18) {
			this.major = major;
		} else {
			System.out.println("not a valid age");
		}

	}

	private int add() {
		return 6;
	}

}
