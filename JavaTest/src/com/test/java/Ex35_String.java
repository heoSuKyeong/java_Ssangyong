package com.test.java;

public class Ex35_String {
	
	
	public static void main(String[] args) {
		
		/*
		git 테스트
		문자열
		- 물리적으로 참조형이지만, 약간의 값형의 성질을 가진다.
		
		*****
		1. 메모리 공간은 한번 할당되면 더 이상 늘리거나 줄일수 없다.
		2. 문자열은 불변(Immutable)이다.	>	한 번 만들어진 문자열은 절대 수정할 수 없다.
		3. 문자열은 참조형이다.
		
		
		*/
		
//		m1();	//문자열은 불변(Immutable)이다.
//		m2();	//되도록 하지 말아야하는 행동
		m3();	//StringBuilder
		
		
	}

	private static void m3() {
		// TODO Auto-generated method stub
		
		//String vs StringBuilder
		
		String s1 = "홍길동";		//문자열 리터럴 사용 > 특혜
		String s2 = new String("홍길동");
		
//		StringBuilder s3 = "홍길동";
		StringBuilder s3 = new StringBuilder("홍길동");
		
		System.out.println(s1);
		System.out.println(s3);
		
		
		//StringBuilder > 수정 작업에 강하다.
		
		long begin = System.nanoTime();
		
		// 수정작업 : String
		String txt1 = "홍길동";
		
		for (int i=0; i<100000; i++) {
			txt1 += ".";
		}
		
		long end = System.nanoTime();
		System.out.println(end - begin + "ns");		//2,589,260,700ns > 2.5s
		
		// 수정작업 : StringBuilder
		begin = System.nanoTime();
		StringBuilder txt2 = new StringBuilder("홍길동");
		
		for (int i=0; i<100000; i++) {
			txt2.append(".");
		}
		
		end = System.nanoTime();
		System.out.println(txt2.length());
		System.out.println(end - begin + "ns");		//2,578,900ns > 0.002s
		
	}

	private static void m2() {
		// TODO Auto-generated method stub
		
		//문자열은 불변이다 > 되도록 하지 말아야하는 행동
		//1. 문자열의 잦은 수정	> 쓰레기를 생성
		//2. 커다란 문자열의 수정
		
		String txt1 = "홍길동";
		
		txt1 += "님";	//문자열 수정을 하면 기본 메모리공간에서 수정이 되는 것이 아니라 새로운 주소번지에 생성
						//기존의 주소번지는 참조를 잃어버림(쓰레기가 된다. 메모리 낭비)
						//나중에 자바에서 쓰레기를 수거(가비지 컬렉션)
						//자원이 많이 소요됨 > 속도가 느려짐
		
		System.out.println(txt1);

		
		txt1 = "홍길동X1000:대충크다고치자";
		txt1 += "!";
		
		
	}

	private static void m1() {
		// TODO Auto-generated method stub
		
		//****모든 값형은 어떤 데이터를 넣더라도 공간의 크기가 불변이다.
		
		int n1 = 10;			//4byte
		int n2 = 1000000000;	//4byte
		
		//참조형(String)은 1글자당 2byte
		//문자열의 내용이 겹치면 힙 영역에 새로 생성하지 않고 변수에 주소번지를 다시 사용한다.(메모리 관리)
		//문자열은 side effector 발생X
		//문자열의 연산 값을 새로 주소에 생성하여 그 값을 대입한다.(-> 문자열은 불변이다.)
		
		String s1 = "홍길동";
		String s2 = "안녕하세요. 홍길동입니다.";
		String s3 = "홍길동";
		String s4 = "홍";
		s4 = s4 + "길동";
		
		//절대 사용 금지!
		System.out.println(s1==s3);		//true
		System.out.println(s1==s4);		//false
		
		s1 = s1 + "님";
		System.out.println(s1);	//홍길동님
		System.out.println(s3);	//홍길동
	}
	
}
