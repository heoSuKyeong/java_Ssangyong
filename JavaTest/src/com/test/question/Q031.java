package com.test.question;

import java.util.Scanner;

public class Q031 {
	
//	숫자 5개를 입력받아 짝수와 홀수의 개수를 출력하시오.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 스캐너 작성
		Scanner scan = new Scanner(System.in);
		
		//2. 안내메시지 출력 및 변수에 입력데이터 저장하기
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;

		System.out.print("숫자 입력: ");
		num1 = scan.nextInt();
		System.out.print("숫자 입력: ");
		num2 = scan.nextInt();
		System.out.print("숫자 입력: ");
		num3 = scan.nextInt();
		System.out.print("숫자 입력: ");
		num4 = scan.nextInt();
		System.out.print("숫자 입력: ");
		num5 = scan.nextInt();
		
		oddEvenCount(num1, num2, num3, num4, num5);
		
		
	}

	private static void oddEvenCount(int num1, int num2, int num3, int num4, int num5) {
		// TODO Auto-generated method stub
		int oddCount = 0, evenCount = 0;
		
		if (num1 % 2 == 0) {
			evenCount++;
		} else {
			oddCount++;
		}
		
		if (num2 % 2 == 0) {
			evenCount++;
		} else {
			oddCount++;
		}
		
		if (num3 % 2 == 0) {
			evenCount++;
		} else {
			oddCount++;
		}
		
		if (num4 % 2 == 0) {
			evenCount++;
		} else {
			oddCount++;
		}
		
		if (num5 % 2 == 0) {
			evenCount++;
		} else {
			oddCount++;
		}
		
		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n", evenCount, oddCount);
		if (evenCount > oddCount) {
			System.out.printf("짝수가 홀수보다 %d개 더 많습니다.", evenCount - oddCount);
		} else {
			System.out.printf("홀수가 짝수보다 %d개 더 많습니다.", oddCount - evenCount);
			
		}
	}

}
