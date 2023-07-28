package com.test.question;

import java.util.Scanner;

public class Q004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		섭씨 온도를 입력받아서 화씨 온도로 변환하시오.
		
		//1. 스캐너 작성하기
		Scanner scan = new Scanner(System.in);
		
		//2. 안내메시지 출력하기 및 입력데이터 변수에 저장하기
		System.out.print("섭씨(C): ");
		double celsius = scan.nextDouble();
		
		//3. 섭씨 -> 화씨 계산
		double fahrenheit = celsius * 1.8 +32;
		
		//4. 결과 출력하기
		System.out.printf("섭씨 %.1fC는 화씨 %.1fF입니다.", celsius, fahrenheit);
		
		//5. 스캐너 닫기
		scan.close();
		
	}

}
