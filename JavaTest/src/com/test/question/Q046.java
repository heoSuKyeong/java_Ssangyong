package com.test.question;

import java.util.Scanner;

public class Q046 {

//	숫자를 10개 입력받아 한글로 변환 후 출력하시오.
//
//	조건..
//	1~9까지만 입력하시오.
	
	public static void main(String[] args) {
		
		// 스캐너 작성하기
		Scanner scan = new Scanner(System.in);

		// 안내문 출력 및 10개의 입력값 변수로 저장
		String result ="", korean="";
		int num=0;
		for (int i=0; i<10; i++) {
			System.out.print("숫자: ");
			num = scan.nextInt();
			switch (num) {
			case 1:
				korean = "일";
				break;
			case 2:
				korean = "이";
				break;
			case 3:
				korean = "삼";
				break;
			case 4:
				korean = "사";
				break;
			case 5:
				korean = "오";
				break;
			case 6:
				korean = "육";
				break;
			case 7:
				korean = "칠";
				break;
			case 8:
				korean = "팔";
				break;
			case 9:
				korean = "구";
				break;

			default:
				break;
			}
			result = result + korean;
		}
		
		//결과출력
		System.out.println(result);
	}
}
