package com.test.java;

public class Ex10_Input {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		콘솔 출력 > 모니터
		1. System.out.print()
		2. System.out.println()
		3. System.out.printf()
		
		콘솔 입력 > 키보드
		1. System.in.read() //불편함
		2. BufferedReader 클래스
		3. Scanner 클래스
		
		
		*/
//		요구사항) 사용자에게 문자 1개를 입력 받아 화면에 출력하시오
//		1. 안내 메시지 출력
//		2. 키 입력
//		3. 키를 화면에 출력
		
//		1.
		System.out.print("문자를 입력하세요 : ");
//		2. 입력대기 상태 > "블럭 걸렸다."
		//read() 메소트 1회 > 문자 1개 입력
		int code = System.in.read();	//main에 "throws Exception" 기재
//		3.
		System.out.println("출력 : " + code);
		System.out.printf("출력 : %c\n", code);
		
		code = System.in.read();
		
		System.out.println("출력 : " + code);
		System.out.printf("출력 : %c\n", code);
		
		code = System.in.read();
		
		System.out.println("출력 : " + code);
		System.out.printf("출력 : %c\n", code);
		
		code = System.in.read();
		
		System.out.println("출력 : " + code);
		System.out.printf("출력 : %c\n", code);
		
		code = System.in.read();
		
		System.out.println("출력 : " + code);
		System.out.printf("출력 : %c\n", code);
		
		System.out.println("프로그램 종료");
	}

}
