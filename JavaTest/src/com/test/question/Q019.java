package com.test.question;

import java.util.Calendar;

public class Q019 {

//	현재 시간을 출력하는 메소드 선언하시오.
//
//	조건..
//	void nowTime()
//	현재 시간을 24시간으로 출력하시오.
//	현재 시간을 오전/오후로 출력하시오.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		nowTime();
	}

	private static void nowTime() {
		// TODO Auto-generated method stub
		
		//Calendar 클래스 변수 지정
		Calendar c1 = Calendar.getInstance();
		
		System.out.printf("현재 시간: %d시 %02d분 %02d초\n",
				c1.get(Calendar.HOUR_OF_DAY),
				c1.get(Calendar.MINUTE),
				c1.get(Calendar.SECOND));
		
		System.out.printf("현재 시간: %s %d시 %02d분 %02d초\n",
				(c1.get(Calendar.AM_PM)==1 ? "오후" : "오전"),
				c1.get(Calendar.HOUR_OF_DAY),
				c1.get(Calendar.MINUTE),
				c1.get(Calendar.SECOND));
	}

}
