package com.test.question;

import java.util.Scanner;

public class Q052 {
	
//	아래와 같이 출력하시오.
//
//	조건..
//	행의 갯수를 입력받으시오.
//	입력..
//	행: 5 
//
//	출력..
//	    aa
//	   abba
//	  abccba
//	 abcddbca
//	abcdeedcba
	public static void main(String[] args) {
		
		//스캐너 작성하기
		Scanner scan = new Scanner(System.in);
		
		//행 입력받기
		int row=0;
		System.out.print("행: ");
		row = scan.nextInt();
		
		//출력하기
		m1(row);
		
	}

	private static void m1(int row) {
		
		// 알파벳 a로 시작
		char alphabet='a';
		
		for (int i=0; i<row; i++) {
			for (int j=i; j<row; j++) {
				System.out.print(" ");
			}
			for (int k=0; k<=i; k++) {
				System.out.printf("%c", alphabet++);
			}
			for (int l=i; l>=0; l--) {
				System.out.printf("%c", --alphabet);
			}
//			for (int m=i; m<row; m++) {
//				System.out.print(" ");
//			}
			System.out.println();
		}
		
		
	}

}
