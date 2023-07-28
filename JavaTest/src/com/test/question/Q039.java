package com.test.question;

import java.util.Scanner;

public class Q039 {

//	아래와 같이 출력하시오.
//
//	입력..
//	시작 숫자: 1 
//	종료 숫자: 10 
//
//	출력..
//	1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
	
	public static void main(String[] args) {
		
		//스캐너 작성하기
		Scanner scan = new Scanner(System.in);
		
		//안내문 출력 및 입력값 변수로 저장
		int start=0, end=0;
		
		System.out.print("시작 숫자: ");
		start = scan.nextInt();
		System.out.print("종료 숫자: ");
		end = scan.nextInt();
		
		/*
		//출력하기
		int sum=0;	//누적 변수
		for (int i=start; i<=end; i++) {
			sum += i;
			if(i == end) {	//i가 마지막 숫자이면 '=' 과 함께 출력
				System.out.printf("%d = %d", end, sum);
			} else {
				System.out.printf("%d + ", i);
			}
		}
		*/
		
		//출력하기
		int sum=0;	//누적 변수
		for (int i=start; i<=end; i++) {
			sum += i;
			System.out.printf("%d + ", i);
		}
		// \b : 백스페이스 > 글자 지우기
		System.out.printf("\b\b = %d", sum);
	}
	
}
