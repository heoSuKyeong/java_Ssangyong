package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q034 {
	
//	날짜를 입력받아 아래의 조건에 맞게 결과를 출력하시오.
//
//	조건..
//	입력받은 날짜가 평일이면 해당 주의 토요일을 알아낸다.
//	입력받은 날짜가 토/일요일이면 아무것도 안한다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 스캐너 작성
		Scanner scan = new Scanner(System.in);
		
		//2. 안내메시지 출력 및 변수에 입력데이터 저장하기
		int year=0, month=0, day=0;
		
		System.out.print("년: ");
		year = scan.nextInt();
		System.out.print("월: ");
		month = scan.nextInt();
		System.out.print("일: ");
		day = scan.nextInt();
		
		weekend(year, month, day);
	}

	private static void weekend(int year, int month, int day) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		now.set(year, month-1, day);
//		now.set(Calendar.YEAR, year);
//		now.set(Calendar.MONTH, month);
//		now.set(Calendar.DATE, day);
		System.out.println(now.get(Calendar.DAY_OF_WEEK));
		
		if (now.get(Calendar.DAY_OF_WEEK)==1 || now.get(Calendar.DAY_OF_WEEK)==7) {
			System.out.println("입력하신 날짜는 '휴일(토/일)'입니다.");
			System.out.println("결과가 없습니다.");
		} else {
			System.out.println("입력하신 날짜는 '평일'입니다.");
			System.out.println("해당 주의 토요일로 이동합니다.");
			int gap = 7 - now.get(Calendar.DAY_OF_WEEK);
			now.add(Calendar.DATE, gap);
			System.out.printf("이동한 날짜는 '%tF'입니다.", now);
		}
	}

}
