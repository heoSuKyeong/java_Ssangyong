package com.test.java;

public class Ex21_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//public static void hello(String name) {}
		
		//void : 메소드 반환값(리턴값)
		// - 메소드가 실행 후 호출한 곳으로 돌려주는 값
		System.out.println(getNum());
		System.out.println(getName("홍길동"));
		
		String result = getName("아무개");
		System.out.println(result);
		
	}
	public static String getName(String name) {
		
		return "고객명 : " + name;
	}
	
	public static int getNum() {
		
		//return 문
		// - 메소드 종료
		// - 값을 반환
		
		return 1;
	}
	

}
