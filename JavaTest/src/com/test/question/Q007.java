package com.test.question;

import java.util.Scanner;

public class Q007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		영문 소문자를 1글자 입력받은 후 대문자로 변환해서 출력하시오.
		
		//1. 스캐너 작성하기
		Scanner scan = new Scanner(System.in);
		
		//2. 안내메시지 출력하기 및 입력데이터 변수에 저장하기
		System.out.print("문자 입력: ");
		char smallLetter = scan.nextLine().charAt(0);
		
		//3. 소문자 > 대문자 변환하기
		int bigLetter = smallLetter - 32;
		
		//4. 결과 출력하기
		System.out.printf("소문자 '%c'의 대문자는 '%c'입니다.", smallLetter, bigLetter);
		
		//5. 스캐너 닫기
		scan.close();
	}

}
