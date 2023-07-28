package com.test.java;

public class Ex22_LocalVariable {
	
	//멤버변수
	int memberInt;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		자바 변수의 종류 - 변수의 선언 위치
		1. 멤버 변수(Member Variable)
			- 클래스 수업에서 등장
			
		2. 지역 변수(Local Variable)
			- 메소드 내에서 선언한 변수
			
		지역 변수의 생명 주기, Life Cycle
		- 언제 태어나서(메모리에 생성) ~ 언제 죽는지(메모리에서 소멸)
		- 생성 : 변수 선언문이 실행되는 순간
		- 소멸 : 변수 선언문이 포함된 자신의 영역에서 제어가 벗어나는 순간
		
		지역 변수의 영역(Scope)
		- 선언문이 포함된 블럭({})
				
		*/
		
		//지역변수
		int localInt;
		
		String name = "홍길동";
		
		m1();
		
		//다른 메소드의 지역변수 > 생명주기가 다름
//		System.out.println(age);
		
		//***지역변수는 초기화를 하지않으면 사용 불가능
		int num;	//초기화 되지않은 null 상태
//		System.out.println(num);
		
	}
	public static void m2(String gender) {
		
		//매개변수 == 지역변수
//		String gender;	>> 같은 지역내에 있기에 사용x
		
		
	}
	
	
	public static void m1() {
		String name = "아무개";
		int age = 20;
		System.out.println(age);
				
	}

}
