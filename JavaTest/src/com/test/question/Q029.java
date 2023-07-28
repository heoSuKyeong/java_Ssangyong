package com.test.question;

import java.util.Scanner;

public class Q029 {

//	숫자 2개와 연산자 1개를 입력받아 연산 과정과 결과를 출력하시오.
//
//	조건..
//	정수만 입력하시오.(유효성 검사 필요없음)
//	나머지 연산 결과는 소수이하 첫째자리까지 출력 하시오.
//	연산자는 산술 연산자(+, -, *, /, %)만 입력하시오.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 스캐너 작성
		Scanner scan = new Scanner(System.in);
		
		//2. 안내메시지 출력 및 변수에 입력데이터 저장하기
		int num1 = 0, num2 = 0;
		String operator = "";
		
		System.out.print("첫번째 숫자: ");
		num1 = scan.nextInt();
		
		System.out.print("두번째 숫자: ");
		num2 = scan.nextInt();
		scan.nextLine();
		
		System.out.print("연산자: ");
		operator = scan.nextLine();
		
		//계산하는 메소드 호출
		calculator(num1, num2, operator);
		
	}

	public static void calculator(int num1, int num2, String operator) {
		// TODO Auto-generated method stub
		
		switch (operator) {
		case "+":
			System.out.printf("%d %s %d = %d", num1, operator, num2, num1 + num2);
			break;
		case "-":
			System.out.printf("%d %s %d = %d", num1, operator, num2, num1 - num2);
			break;
		case "*":
			System.out.printf("%d %s %d = %d", num1, operator, num2, num1 * num2);
			break;
		case "/":
			System.out.printf("%d %s %d = %.1f", num1, operator, num2, (double)num1 / num2);
			break;
		case "%":
			System.out.printf("%d %s %d = %d", num1, operator, num2, num1 % num2);
			break;
		default:
			System.out.println("연산이 불가능합니다.");
			break;
		}
		
		
	}

}
