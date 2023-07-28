package com.test.java;

public class Ex24_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Swap
		// - 2개의 공간의 값을 서로 교환하는 작업
		
		int a = 10;
		int b = 20;
		
		swap(a,b);
		
		String s1 = "홍길동";
		String s2 = "아무개";
		swap(s1,s2);
		
	}
	
	public static void swap(int a, int b) {
		System.out.printf("a: %d, b: %d\n", a, b);
		
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.printf("a: %d, b: %d\n", a, b);
	}
	public static void swap(String s1, String s2) {
		System.out.printf("s1: %s, s2: %s\n", s1, s2);
		
		String temp;
		
		temp = s1;
		s1 = s2;
		s2 = temp;
		
		System.out.printf("s1: %s, s2: %s\n", s1, s2);
	}

}
