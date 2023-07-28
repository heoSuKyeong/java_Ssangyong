package com.test.java;

import java.util.Scanner;

public class Ex16_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		산술 연산자
//		비교 연산자
//		논리 연산자
//		대입 연산자
//		증감 연산자
//		조건 연산자
//		비트 연산자
		
		/*
		2. 비교 연산자 : > , >=, <, <=, ==(equals), !=(not equals)
		- 2항 연산자
		- 피연산자(숫자)들의 우위(동등) 비교하는 연산자
		- 연산의 결과가 항상 boolean형이다.
		
		
		*/
		
		int a = 10;
		int b = 3;
		
		System.out.printf("%d > %d = %b\n", a, b, a>b);
		
		//요구사항) 사용자 나이 입력 > 19세 이상이면 통과, 미만이면 거절
//		Scanner scan = new Scanner(System.in);
//		System.out.print("나이 : ");
//		int age = scan.nextInt();
//		System.out.println(age >= 19);
		
		//캐릭터 비교 가능
		System.out.println('A'=='A');
		System.out.println('A'=='a');
		
			
		//문자열의 비교할 때 주의하기
		//***문자열의 비교는 ==, != 연산자를 사용하면 안된다.
		//문자열의 비교는 equals() 메소드를 사용한다.
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "아무개";
		String s4 = "홍";
		s4 = s4 + "길동";
		
		System.out.println(s4);
		System.out.println(s1 == s2);	//true "홍길동" == "홍길동"
		System.out.println(s1 == s3);	//false "홍길동" == "아무개"
		System.out.println(s1 == s4);	//false "홍길동" == "홍길동"
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		
	}

}
