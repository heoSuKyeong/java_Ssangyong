package com.test.question;

import java.util.Scanner;

public class Q011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		숫자를 2개 입력받아 연산식을 반환하는 메소드를 선언하시오.
		
		//1. 스캐너 작성
		Scanner scan = new Scanner(System.in);
		
		//2. 안내메시지 출력 및 변수에 입력데이터 저장하기
		System.out.println("첫번째 숫자 : ");
		int n1 = scan.nextInt();
		
		System.out.println("두번째 숫자 : ");
		int n2 = scan.nextInt();
		
		//3. 메소드 호출
		String result = add(n1, n2); 
		System.out.println(result);

		result = subtract(n1, n2);
		System.out.println(result);

		result = multiply(n1, n2);
		System.out.println(result);

		result = divide(n1, n2);
		System.out.println(result);

		result = mod(n1, n2);
		System.out.println(result);
		
		//4. 스캐너 종료
		scan.close();
	}
	//인자 값을 받아 String으로 반환
	public static String add(int n1, int n2) {
		return n1 + " + " + n2 + " = " + (n1+n2);
	}
	public static String subtract(int n1, int n2) {
		return n1 + " - " + n2 + " = " + (n1-n2);
	}
	public static String multiply(int n1, int n2) {
		return n1 + " * " + n2 + " = " + (n1*n2);
	}
	public static String divide(int n1, int n2) {
		/*
		 * 기존 코드 : 1.6666으로 출력
		 * return n1 + " / " + n2 + " = " + ((float)n1/(float)n2);
		 */
		double divide = (double)n1/n2;
		return String.format("%d / %d = %.1f", n1, n2, divide);
		
	}
	public static String mod(int n1, int n2) {
		return n1 + " % " + n2 + " = " + (n1%n2);
	}

}
