package com.test.question;

import java.util.Scanner;

public class Q036 {
	
//	시작 숫자, 종료 숫자, 증감치를 입력받아 숫자를 순차적으로 출력하시오.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//스캐너 작성하기
		Scanner scan = new Scanner(System.in);
		
		//안내문 출력 및 입력값 변수로 저장
		int start = 0, end=0, plus=0;
		
		System.out.print("시작 숫자: ");
		start = scan.nextInt();
		System.out.print("종료 숫자: ");
		end = scan.nextInt();
		System.out.print("증감치: ");
		plus = scan.nextInt();
		
		//반복문 출력
		for (int i=start; i<=end; i+=plus) {
			System.out.println(i);
		}
		
		//스캐너 종료
		scan.close();
		
		
	}

}
