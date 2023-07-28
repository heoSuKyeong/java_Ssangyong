package com.test.question;

import java.util.Scanner;

public class Q002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		숫자 2개를 입력받아 아래의 연산식을 출력하시오.
		
		//1. 스캐너 작성하기
		Scanner scan = new Scanner(System.in);
		
		//2. 안내메시지 출력하기 및 변수에 입력데이터 저장하기
		System.out.print("첫번째 숫자: ");
		int firstNum = scan.nextInt();
		
		System.out.print("두번째 숫자: ");
		int secondNum = scan.nextInt();
		
		//3. 결과 출력하기
		System.out.printf("%,d + %,d = %,d\n", firstNum, secondNum, firstNum + secondNum);
		System.out.printf("%,d - %,d = %,d\n", firstNum, secondNum, firstNum - secondNum);
		System.out.printf("%,d * %,d = %,d\n", firstNum, secondNum, firstNum * secondNum);
		System.out.printf("%,d / %,d = %,.1f\n", firstNum, secondNum, (float)firstNum / (float)secondNum);
		System.out.printf("%,d %% %,d = %,d\n", firstNum, secondNum, firstNum % secondNum);
		
		//4. 스캐너 닫기
		scan.close();
	}

}
