package com.test.question;

import java.util.Scanner;

public class Q037 {
	
//	숫자 1개를 입력받아 1부터 입력한 숫자까지의 합을 출력하시오.
	
	public static void main(String[] args) {
		//스캐너 작성하기
		Scanner scan = new Scanner(System.in);
		
		//안내문 출력 및 입력값 변수로 저장
		int num=0;
		
		System.out.print("숫자: ");
		num = scan.nextInt();
		
		//1부터 사용자 입력값(num) 누적 합 구하기
		int sum=0;	//누적합
		for (int i=1; i<=num; i++) {
			sum += i;
		}
		
		//결과 출력
		System.out.printf("1 ~ %d = %d", num, sum);
	}
}
