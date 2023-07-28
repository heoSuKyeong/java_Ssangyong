package com.test.question;

import java.util.Scanner;

public class Q035 {

//	사용자의 이름과 인사할 횟수를 입력 받아 출력하시오.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//스캐너 작성하기
		Scanner scan = new Scanner(System.in);
		
		//안내문 출력 및 입력값 변수로 저장
		String name="";
		int cnt = 0;
		
		System.out.print("이름: ");
		name = scan.nextLine();
		
		System.out.print("횟수: ");
		cnt = scan.nextInt();
		
		//인사하는 메소드 출력
		hello(name, cnt);
		
		//스캐너 닫기
		scan.close();
	}

	private static void hello(String name, int cnt) {
		// TODO Auto-generated method stub
		for(int i=0; i<cnt; i++) {
			System.out.printf("%s님 안녕하세요~\n", name);
		}
	}

}
