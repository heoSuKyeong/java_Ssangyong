package com.test.question;

import java.util.Scanner;

public class Q001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		태어난 년도를 입력받아 나이를 출력하시오.
		
		//1. 스캐너 작성
		Scanner scan = new Scanner(System.in);
		
		//2. 안내메시지 출력
		System.out.println("태어난 년도: ");
		
		//3. 입력받아 변수에 저장하기
		int year = scan.nextInt();
		
		//4. 나이 계산하기
		int thisYear = 2023;
		int age = thisYear - year + 1;
		
		//5. 결과 출력하기
		System.out.printf("나이: %d세", age);
		
		//6. 스캐너 닫기
		scan.close();

	}

}
