package com.test.question;

import java.util.Calendar;

public class Q020 {

//	오늘 태어난 아이의 백일과 첫돌을 출력하시오.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//백일 계산
		
		//오늘 날짜 변수 지정
		Calendar birthday = Calendar.getInstance();
		
		//오늘 태어난 날짜에 100일 더하기
		birthday.add(Calendar.DATE, 100);
		
		//결과(백일 날짜) 출력
		System.out.printf("백일: %tF\n", birthday);
		
		//오늘 날짜 재정의
		birthday = Calendar.getInstance();
		
		//첫돌 계산
		birthday.add(Calendar.YEAR, 1);
		
		//결과(첫돌 날짜) 출력
		System.out.printf("첫돌: %tF\n", birthday);
		
		
	}

}
