package com.test.java;

public class Ex07_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//숫자형 데이터 > 저장할 변수가 필요할 경우
//		- 수치로서의 데이터 : 산술 연산의 대상
//		- 수치가 아닌 데이터
//		- 숫자형식이지만 실제로 숫자취급하지 않는 것 : 주민번호, 학번, 전화번호
		
//		1. 몸무게 > ok
		int weight;
		weight = 70;
		
//		2. 주민등록번호 앞자리(990718) > x
		int jumin = 990718;
		System.out.println("주민등록번호 : " + jumin);
		
		jumin = 000717;	//주의
		System.out.println("주민등록번호 : " + jumin);
		
		String jumin2 = "000717";
		System.out.println("주민등록번호 : " + jumin2);
		

		/*
		 * 자바 기수 표기법 - 숫자 데이터 표기 : 3개의 기수법 지원 
		 * 기수 표현에 상관없이 출력 : 10진수로 출력
		 * 1. 10진수 : 그냥 사용 
		 * 2. 8진수 : 0으로 시작 ex) 010 > 8
		 * 3. 16진수 : 0x로 시작 ex) 0x10 > 16
		 */
		System.out.println(10);
		System.out.println(010);
		System.out.println(0x10);
	}

}
