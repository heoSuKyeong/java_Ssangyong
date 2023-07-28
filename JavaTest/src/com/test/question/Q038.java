package com.test.question;

import java.util.Scanner;

public class Q038 {
	
//	입력 횟수(N)와 숫자 N개를 입력받아 짝수의 합과 홀수의 합을 각각 출력하시오.
	
	public static void main(String[] args) {
		//스캐너 작성하기
		Scanner scan = new Scanner(System.in);
		
		//안내문 출력 및 입력값 변수로 저장
		int cnt=0;
		int num=0;
		int oddCnt=0, oddSum=0;
		int evenCnt=0, evenSum=0;
		
		System.out.print("입력 횟수: ");
		cnt = scan.nextInt();
		
		for (int i=0; i<cnt; i++) {
			System.out.print("숫자: ");
			num = scan.nextInt();
			
			if(num % 2 == 0) {
				evenCnt++;
				evenSum += num;
			} else {
				oddCnt++;
				oddSum += num;
			}
		}
		
		System.out.printf("짝수 %d개의 합: %d\n홀수 %d개의 합: %d", evenCnt, evenSum, oddCnt, oddSum);
		
		
	}
}
