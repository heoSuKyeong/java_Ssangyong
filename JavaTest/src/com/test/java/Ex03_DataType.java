package com.test.java;

public class Ex03_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		학생 1명의 국어 점수를 저장한 후 화면에 출력하시오.
		1. 데이터 성질을 파악
			a. 형태 파악 : 정수 or 실수 > 정수 > byte, short, int, long
			b. 길이 파악 : 0~100 > (경제적인 면을 생각하여)byte
		

		*/
		// 변수 선언
		byte korScore;
		
		// 변수 초기화
		korScore = 100;
		
		// 변수 호출(사용)
		System.out.println(korScore);
	}

}
