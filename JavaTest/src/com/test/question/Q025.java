package com.test.question;

import java.util.Scanner;

public class Q025 {
	
//	숫자 2개를 입력받아 큰수와 작은수를 출력하시오.
//
//	조건..
//	두 숫자가 얼마의 차이를 보이는지 출력하시오.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. 스캐너 작성
		Scanner scan = new Scanner(System.in);
		
		//2. 안내메시지 출력 및 변수에 입력데이터 저장하기
		System.out.print("첫번째 숫자: ");
		int num1 = scan.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = scan.nextInt();
		
		//3. 입력받은 두 숫자 비교하기
		int max = 0, min = 0;
		
		if (num1 > num2) {
			max = num1;
			min = num2;
		} else if (num1 < num2) {
			max = num2;
			min = num1;
		} else {
			max = min = num1;
			
		}
		
		//결과 출력하기
		if (max != min) {
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.", max, min, max - min);
			
		} else {
			System.out.println("두 숫자는 동일합니다.");
		}
		
	}

}
