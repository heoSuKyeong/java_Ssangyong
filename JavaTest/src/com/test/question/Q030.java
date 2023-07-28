package com.test.question;

import java.util.Scanner;

public class Q030 {
	
//	영문자 1개를 입력받아 대/소문자 변환을 한 뒤 출력하시오.
//
//	조건..
//	유효성 검사를 하시오.(영문자만 입력 가능)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. 스캐너 작성
		Scanner scan = new Scanner(System.in);
		
		//2. 안내메시지 출력 및 변수에 입력데이터 저장하기
		char alphabet = ' ';

		System.out.print("문자: ");
		alphabet = scan.nextLine().charAt(0);
		
		//3. 소문자 <-> 대문자 변환 메소드 호출
		englishConversion(alphabet);
		
	}

	private static void englishConversion(char alphabet) {
		// TODO Auto-generated method stub
		//대문자 -> 소문자 변환
		if (alphabet >= 65 && alphabet <= 90) {
			System.out.printf("'%c'의 소문자는 '%c'입니다.",alphabet, alphabet+32);
		} else if (alphabet >= 97 && alphabet <= 122) {
			System.out.printf("'%c'의 대문자는 '%c'입니다.",alphabet, alphabet-32);
		} else {
			System.out.println("영문자만 입력하시오.");
		}
	}

}
