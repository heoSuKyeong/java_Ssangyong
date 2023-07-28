package com.test.question;

import java.util.Scanner;

public class Q048 {

//	최대 9자리 정수를 입력받아 각자리의 홀수 숫자합과 짝수 숫자합을 구하시오.
//
//	조건..
//	int 양수만 입력하시오.

	public static void main(String[] args) {

		

//		m1();	//숫자를 String으로 받기
		m2();	//숫자를 int로 받기
	}

	private static void m2() {
		// 스캐너 작성하기
		Scanner scan = new Scanner(System.in);
		//숫자 입력 받기
		int num =0;
		
		System.out.print("숫자 입력: ");
		num = scan.nextInt();
		
		int oddSum=0, evenSum=0;
		
		if(num>0 && num<=999999999) {
			for (int i=num; i>0; i/=10) {
				
				if (i % 10 % 2 == 0) {
					evenSum += i%10;
				} else {
					oddSum += i%10;
				}
			}
		}
		
		
		System.out.printf("짝수의 합: %d\n홀수의 합: %d", evenSum, oddSum);
		
	}

	public static void m1() {
		// 스캐너 작성하기
		Scanner scan = new Scanner(System.in);
		
		// 숫자 입력 받기
		String num ="";
		
		System.out.print("숫자 입력: ");
		num = scan.nextLine();
		
		int oddSum=0, evenSum=0;
		for (int i=0; i<num.length(); i++) {
			//'1'의 아스키코드 == 49
			int number = num.charAt(i) - 48;
			
			if(number % 2 ==0) {
				evenSum += number;
			} else {
				oddSum += number;
			}
		}
		
		System.out.printf("짝수의 합: %d\n홀수의 합: %d", evenSum, oddSum);
		
	}
	
	

}
