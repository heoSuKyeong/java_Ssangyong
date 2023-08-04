package com.test.java;

public class Ex05_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//모든 자료형(8종류) + 변수 생성하기
		//정수 > byte(1), short(2), int(4), long(8)
		
		byte b1 = 100;
		System.out.println(b1);
		
		b1 = Byte.MAX_VALUE; //127
		b1 = Byte.MIN_VALUE; //-128
		System.out.println("byte: " + b1); 
		
		short s1 = 128;
		System.out.println("s1 : " + s1);
		
		s1 = Short.MAX_VALUE; //32767
		s1 = Short.MIN_VALUE; //-32768		
		System.out.println("s1 : " + s1);
		
		int n1 = 1000000;
		System.out.println("n1 : " + n1);
		
		n1 = Integer.MAX_VALUE; //2147483647
		n1 = Integer.MIN_VALUE; //-2147483648
		System.out.println("n1 : " + n1);
		
		long l1 = 3000000000L;
		System.out.println("l1 : " + l1);
		
		l1 = Long.MAX_VALUE; //9223372036854775807
		l1 = Long.MIN_VALUE; //-9223372036854775808
		System.out.println("l1 : " + l1);
		
		/*
		 * 1. 변수
		 * 2. 상수
		 * 	a. 이름이 있는 상수 :  final 변수 > 대문자로만 작성
		 * 	b. 이름이 없는 상수 : 순수 데이터 > 리터럴(Literal)
		*/
		
		final byte KOR = 100;
		// KOR = 90; final 상수이기에 수정 불가
		
		//LValue(변수) = RValue(상수, 변수)
		//******** LValue와 RValue는 자료형이 동일해야 한다.(동일하지 않으면 에러남)
		
		//*** 정수형 상수가 int일까?
		//운영체제 + CPU
		//운영체제가 한번 처리하는 데이터의 양이 int 자료형이 된다.
		//운영체제
		// 8비트 운영체제 > int : 1byte
		// 16비트 운영체제 > int : 2byte
		// 32비트 운영체제 > int : 4byte
		// 64비트 운영체제 > int : 4byte / 8byte(x) 업데이트시 오류가 많이 나서 4바이트로 동결
		
		
		//--------------------------------------------------------------------------------------
		//실수 > float(단정도형), double(배정도형)
		//- 실수형 리터럴의 자료형? double
		float f1 = 3.14F;
		System.out.println("f1 : " + f1);
		
		f1 = 12345678901234567890123456789F;
		System.out.println("f1 : " + f1); //1234567890000000000000000000

		double d1 = 6.28;
		System.out.println("d1 : " + d1);
		
		d1 = 12345678901234567890123456789D;
		System.out.println("d1 : " + d1); //1234567891234567800000000000
		
		double d2 = 0.25;
		double d3 = 0.1;
		System.out.println(d2+d3);
		System.out.println(0.1+0.2);
		
		//-------------------------------------------------------------------------------------
		//문자형 > char
		char c1 = 'A', c2 = '@';
		char c3 = '1';  // 문자코드 값 49 > (메모리 저장) 0000 0000 0000 0000 0000 0000 0011 0001 
		int n = 1; //(메모리 저장)0000 0000 0000 0000 0000 0000 0000 0001
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		
		
		//-------------------------------------------------------------------------------------
		//논리형 > boolean(1)
		boolean flag = true;  //논리형 상수(리터럴)
		
		//참조형 > String : 문자열
		String name = "홍길동";  //문자열 상수(리터럴)
		System.out.println("name : " + name);
		
		String nick = ""; //빈문자열, Empty String
		
		//연산자 일부
		//- 대입 연산자, 산술 연산자
		
		int a1 = 10;
		int a2 = 20;
		int a3 = a1 + a2;
		System.out.println(a3); //산술 연산자
		
		String t1 = "홍";
		String t2 = "길동";
		String t3 = t1 + t2;
		System.out.println(t3); //문자열 연산자 : concat
		
		//요구사항] 숫자 2개를 연산과정과 함꼐 결과를 출력하시오. ex) 10+20=30
		//
		
		a1 = 10;
		a2 = 20;
		a3 = a1+a2;
		System.out.println(a1 + " + " + a2 + " = " + a3);
		
		
	}

}
