package com.test.question;

import java.util.Scanner;

public class Q080 {

//	문장을 입력받아 역순으로 출력하시오.
	
	public static void main(String[] args) {
		
		//스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		//입력받기
		String str="";
		System.out.print("문장 입력: ");
		str = scan.nextLine();
		
		//역순으로 출력
		System.out.print("역순 결과: \"");
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println("\"");
	}
}
