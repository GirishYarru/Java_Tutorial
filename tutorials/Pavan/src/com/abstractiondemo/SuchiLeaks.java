package com.abstractiondemo;

public class SuchiLeaks extends Book{

	@Override
	public boolean isBind() {
		return false;
	}
	
	
	public SuchiLeaks() {
		System.out.println("_____IN child_____");
	}
	
	
	

	
	public static void main(String[] args) {
		
		Book b = new SuchiLeaks();
		
	}
}
