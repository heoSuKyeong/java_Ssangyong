package com.test.java;

public class Ex13_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		(자료)형변환
		- Casting, Data Type Casting
		- 하나의 자료형을 또 다른 자료형으로 변환하는 작업
		- 코드 작성을 유연하게 하기 위해 사용
		- ex) int > double , float > short
		
		1. 암시적 형변화(자동 타입 변환)
			- 큰 자료형(복사본) = 작은 자료형(원본)
			- 복사했을 때 원본과 항상 동일한 값복사 > 100% 안전한 작업  
			
		2. 명시적 형변환(강제 타입 변환)
			- 작은 자료형 = 큰 자료형
			- 안전여부는 경우에 따라 다름.
			
		* 명시적 형변환 시 데이터가 넘치는 현상 : 오버플로우(Overflow)
		* 1. 위로 넘치는 현상 : overflow
		* 2. 아래로 넘치는 현상 : underflow
		* >> 오버플로우가 발생할 만한 상황을 미리 예측해서 관리가 필요하다.
		* 
		
		*/
		
		//암시적 형변화
		byte a = 10;
		short b;
		
		b=a;
		System.out.println(b);
		
		
		byte c = 100;
		long d;
		d = c;
		System.out.println(d);
		
		//명시적 형변환
		short e = 1000;	//출력 : -24 > 런타임 에러 
		byte f;
		f = (byte)e;
		System.out.println(f);
		
		//은행계좌
		int g;
		long h = 3000000000L;
		
		//계좌이체(복사)
		g = (int)h;
		System.out.println("이체 결과: " + g);
		
	}

}
