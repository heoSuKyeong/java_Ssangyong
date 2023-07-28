package com.test.question;

import java.util.Scanner;

public class Q056 {

//	숫자를 2개 입력받아 각각의 약수와 두 숫자의 공약수를 구하시오.
//
//	조건..
//	공약수: 둘 이상의 정수에 공통된 약수
//	입력..
//	첫번째 숫자: 12 
//
//	두번째 숫자: 8 
//
//	출력..
//	12의 약수: 1, 2, 3, 4, 6, 12,
//	8의 약수: 1, 2, 4, 8,
//	12와 8의 공약수: 1, 2, 4,
	
	static String divisor="";
	
	public static void main(String[] args) {
		
		//스캐너 작성
		Scanner scan = new Scanner(System.in);
		
		//2개의 숫자 받기
		int num1=0, num2=0;
		
		System.out.print("첫번째 숫자: ");
		num1 = scan.nextInt();
		System.out.print("두번째 숫자: ");
		num2 = scan.nextInt();
		
		
		divisor = getDivisor(num1);
		System.out.printf("%d의 약수: %s\n", num1, divisor);
		
		divisor = getDivisor(num2);
		System.out.printf("%d의 약수: %s\n", num2, divisor);
		
		System.out.printf("%d와 %d의 공약수: ", num1, num2);
		System.out.print(getCommonDivisor(num1, num2));
		
	}

	private static String getCommonDivisor(int num1, int num2) {
		// TODO Auto-generated method stub
		String commonDivisor="";
		int min=Integer.MAX_VALUE;
		
		min = (num1<num2)? num1:num2;
		
		for (int i=1; i<=min; i++) {
			if(num1%i == 0 && num2%i == 0) {
				commonDivisor = commonDivisor + i + ", ";
			}
		}
		
		return commonDivisor;
	}

	private static String getDivisor(int num) {

		divisor="";
		for (int i=1; i<=num; i++) {
			if (num%i==0) {
				divisor = divisor + i + ", ";
			}
		}
		return divisor;
	}
	
}
