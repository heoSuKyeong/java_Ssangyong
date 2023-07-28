package com.test.java;

public class Ex23_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		메소드 오버로딩, Method Overloading
		- 매개변수를 다르게하여 같은 메소드 이름을 여러개 사용
		- 메소드의 인자 리스트를 다양한 형태로 구성해서, 같은 이름의 메소드를 여러개 만드는 기술
		
		메소드 오버로딩 구현 조건 가능
		1. 매개변수의 개수
		2. 매개변수의 자료형
		
		메소드 오버로딩 구현 조건 불가능
		1. 매개변수의 이름
		2. 반환값의 자료형
		
		*/
		
		/*
		 메소드 여러개 선언 
		 1. public static void test() {} 
		 2. public static void test() {}				>> 불가능 : 1번과 식별불가
		 3. public static void test(int n) {}			>> 가능
		 4. public static void test(int m) {}			>> 불가능 : 3번과 식별불가
		 5. public static void test(String s) {}		>> 가능
		 6. public static void test(int n, int m) {}	>> 가능
		 6. public static int test() {}					>> 불가능 : 1번과 식별불가
		 
		  
		 검증 : 메소드 호출해보기
		 test();				//1번
		 test(10);				//3번
		 test("홍길동");		//5번
		 test(10, 10);			//6번
		 
		 int result = test();	//7번
		 */
		
		
		drawLine();
		drawLine("*");
		
		System.out.println(100);
		
	}
	
	public static void test() {
		
	}
	
	public static void test(int n) {
		
	}
	
	
	
	//요구사항) 선을 그리는 메소드를 선언하시오.
	public static void drawLine() {
		System.out.println("===========================");
				
	}
	
	//메소드 오버로딩
	public static void drawLine(String s) {
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.print(s);
		System.out.println();
	}
	
	

}
