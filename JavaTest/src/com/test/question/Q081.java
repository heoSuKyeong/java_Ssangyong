package com.test.question;

import java.util.Scanner;

public class Q081 {

//	이메일 주소를 입력받아 아이디와 도메인을 각각 추출하시오.
//
//	입력..
//	이메일: hong@gmail.com 
//
//	출력..
//	아이디: hong
//	도메인: gmail.com
	
	public static void main(String[] args) {
		
		//스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		//입력받기
		String email ="";
		
		System.out.print("이메일: ");
		
		email = scan.nextLine();
		
		
		//아이디, 도메인 추출
		divideBySplit(email);
		divideBySubstring(email);
		
	}

	private static void divideBySubstring(String email) {
		// TODO Auto-generated method stub

		String id = "", domain = "";

		int index = email.indexOf("@");

		id = email.substring(0, index);
		domain = email.substring(index + 1);

		// 결과 추출
		System.out.println("아이디: " + id);
		System.out.println("도메인: " + domain);

	}

	private static void divideBySplit(String email) {
		// TODO Auto-generated method stub
		String id = "", domain = "";

		id = email.split("@")[0];
		domain = email.split("@")[1];

		// 결과 추출
		System.out.println("아이디: " + id);
		System.out.println("도메인: " + domain);
	}
	
}
