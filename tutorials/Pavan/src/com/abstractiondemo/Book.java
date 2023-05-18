package com.abstractiondemo;

public abstract class Book {
	
	private int i =20;
	
	public abstract boolean isBind();
	
	public boolean isAdult() {
		return true;
	}

	public Book(){
		System.out.println("====in book ====");
	}

}
