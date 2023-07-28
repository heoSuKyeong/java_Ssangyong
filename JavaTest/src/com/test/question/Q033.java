package com.test.question;

import java.util.Scanner;

public class Q033 {
//
//	년도를 입력받아 해당 년도가 '평년' 인지 '윤년' 인지 출력하시오.
//
//	조건..
//	a. 년도를 4로 나눈다.
//	떨어지면 b 검사
//	떨어지지 않으면 "평년"
//	b. 년도를 100으로 나눈다.
//	떨어지면 c 검사
//	떨어지지 않으면 "윤년"
//	c. 년도를 400으로 나눈다.
//	떨어지면 "윤년"
//	떨어지지 않으면 "평년"
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 스캐너 작성
		Scanner scan = new Scanner(System.in);
		
		//2. 안내메시지 출력 및 변수에 입력데이터 저장하기
		int year=0;
		
		System.out.print("년도 입력: ");
		year = scan.nextInt();
		
		
		//윤년 검사
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.printf("%d년은 '윤년'입니다.", year);
		} else {
			System.out.printf("%d년은 '평년'입니다.", year);
		}
		
		
		
	}

}
