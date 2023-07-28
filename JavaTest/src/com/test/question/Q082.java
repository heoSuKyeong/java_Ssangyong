package com.test.question;

import java.util.Scanner;

public class Q082 {

//	숫자를 입력받아 각 자릿수의 수의 합을 구하시오.
//
//	입력..
//	숫자: 314 
//
//	출력..
//	결과: 3 + 1 + 4 = 8
	
	public static void main(String[] args) {
		
		//스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		//입력받기
		System.out.print("숫자: ");
		String num = scan.nextLine();
		
		//자릿수 합 구하기
		int sum =0;
		int value[] = new int[num.length()];	//문자열을 숫자로 변환
		
		for (int i=0; i<num.length(); i++) {
			value[i] = num.charAt(i)-48;
			sum += value[i] ;
		}
		
		//결과 출력하기
		System.out.print("결과: ");
		for (int i=0; i<value.length; i++) {
			if (i>=value.length-1) {
				System.out.printf("%d = %d", value[i], sum);
			} else {
				System.out.print(value[i] + " + ");
			}
		}
		
	}
	
}
