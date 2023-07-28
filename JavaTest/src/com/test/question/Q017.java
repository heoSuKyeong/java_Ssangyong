package com.test.question;

public class Q017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		인자로 받은 이름들을 직급 순으로 출력하는 메소드를 선언하시오
		
		position("홍길동");
		position("홍길동", "유재석");
		position("홍길동", "유재석", "박명수");
		position("홍길동", "유재석", "박명수", "정형돈");
	}
	
	public static void position(String s) {
		System.out.printf("사원: %s\n", s);
		System.out.println();
	}
	public static void position(String s1, String s2) {
		System.out.printf("사원: %s\n대리: %s\n", s1, s2);
		System.out.println();
	}
	public static void position(String s1, String s2, String s3) {
		System.out.printf("사원: %s\n대리: %s\n과장: %s\n", s1, s2, s3);
		System.out.println();
	}
	public static void position(String s1, String s2, String s3, String s4) {
		System.out.printf("사원: %s\n대리: %s\n과장: %s\n부장: %s\n", s1, s2, s3, s4);
		System.out.println();
	}
	

}
