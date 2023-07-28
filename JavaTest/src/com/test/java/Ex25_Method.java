package com.test.java;

public class Ex25_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		재귀 메소드, Recursive Method
		- 메소드 구현부에서 자기 자신을 호출하는 메소드
		- 구조가 헷갈린다.
		- 파일 디렉토리 구조에서 많이 사용

		*/
		
//		m1();
		
		int n = 4;
		int result = m2(n);
		System.out.println(result);
		
		//팩토리얼
		//4! = 4 * 3 * 2 * 1 = 24
		
		n = 4;
		result = factorial(n);
		System.out.printf("%d! = %d\n", n, result);
		
		
	}
	public static int factorial(int n) {
		
		return (n == 1) ? 1 : factorial(n-1) * n;
	}
	
	public static int m2(int n) {
		System.out.println("n: " + n);
		
		int result = (n==1) ? 1 : m2(n-1);
		
		return result;
	}
	
	public static void m1() {
		
		System.out.println("m1");
		m1(); //자기 자신을 호출(재귀호출)
	}
	

}
