package com.test.question;

public class Q009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		이름을 전달하면 이름뒤에 '님'을 붙여서 반환하는 메소드를 선언하시오.
		
		String result = getName("홍길동");
		System.out.printf("고객: %s\n", result);

		result = getName("아무개");
		System.out.printf("고객: %s\n", result);
	}
	
	public static String getName(String name) {
		return name + "님";
	}

}
