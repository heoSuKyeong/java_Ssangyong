package com.test.question;

import java.util.Scanner;

public class Q028 {
	
//	근무 년수를 입력받아 아래와 같이 출력하시오.
//
//	조건..
//	1 ~ 4년차: 초급 개발자
//	5 ~ 9년차: 중급 개발자
//	10년차 이상: 고급 개발자
//	유효성 검사를 하시오.(1 미만 입력 예외 처리)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 스캐너 작성
		Scanner scan = new Scanner(System.in);
		
		//2. 안내메시지 출력 및 변수에 입력데이터 저장하기
		System.out.print("근무 년수: ");
		int year = scan.nextInt();
		
		//경력 산정 메소드 호출
		workedForYear(year);
	}
	
	public static void workedForYear(int year) {
		int beginner = 4,
				middle = 9,
				advanced = 10;
		
		if (year <= 0) {
			System.out.println("입력한 값이 올바르지 않습니다. 1이상의 값을 입력하시오.");
		} else if (year <= beginner && year >= 1) {
			System.out.printf("%d년차 초급 개발자입니다.\n"
					+ "앞으로 %d년 더 근무를 하면 중급 개발자가 됩니다.", year, beginner+1 - year);
		} else if (year <= middle) {
			System.out.printf("%d년차 중급 개발자입니다.\n"
					+ "당신은 %d년전까지 초급 개발자였습니다.\n"
					+ "앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다.", year, year - beginner, middle+1 - year);
		} else if (year >= advanced) {
			System.out.printf("%d년차 고급 개발자입니다.\n"
					+ "당신은 %d년전까지 중급 개발자였습니다.\n", year, year - middle);
		} 
		
		
	}

}
