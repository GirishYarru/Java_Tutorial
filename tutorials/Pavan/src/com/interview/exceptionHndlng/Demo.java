package com.interview.exceptionHndlng;

public class Demo {
	
	public static int test() {
		try {
			
			int a = 1;
			return a;
			
		}catch(Exception e) {
			System.out.println("-----------");
			return 0;
		}finally {
			return 2;
		}
	}
	public static void main(String[] args) {
		
		int res = test();
		System.out.println(res);
		
	}

}
