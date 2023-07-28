package com.test.summary;

public class S004_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 인자값x, 반환값x
		m1();
		
		//2. 인자값o, 반환값x
		m2(10);
		
		//3. 인자값x, 반환값o
		int result = m3();
		
		//3. 인자값o, 반환값o
		result = m4(20);
	}
	
	public static void m1() {
		
	}
	
	public static void m2(int n) {
		
	}
	
	public static int m3() {
		return 15;
	}
	
	public static int m4(int n) {
		return n;
	}

}
