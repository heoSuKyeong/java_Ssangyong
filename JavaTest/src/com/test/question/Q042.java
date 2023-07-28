package com.test.question;

import java.util.Calendar;

public class Q042 {

//	서기 1년 1월 1일부터 오늘까지 며칠째인지 합을 구하시오.
//
//	조건..
//	Calendar 클래스 사용 금지
	
//	강사님 코드 보고 진행하였음
//	윤년에는 2월 29일, 366일 / 평년에는 2월 28일, 365일

	public static void main(String[] args) {

		int sum = 0, year = 0, month = 0, date = 0;
		String day = "";

		Calendar now = Calendar.getInstance();

		year = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH)+1;
		date = now.get(Calendar.DATE);

		for (int i = 1; i < year; i++) {
			if (isLeafYear(i)) {
				//윤년이면 366일을 더해준다.
				sum += 366;
			} else {
				sum += 365;
			}
		}
		
		//2023년 1월 1일 ~ 2023년 6월 30일
		for (int i=1; i<month; i++) {
			sum += getMaxDate(i, year);
		}
		
		//2023년 7월 1일 ~ 2023년 7월 25일
		sum += date;
		
		//검증 및 요일 구하기
		day = getDay(sum);
		
		System.out.printf("%d년 %d월 %d일은 %,d일째 되는 날이고 %s입니다.\n", year, month, date, sum, day);

	}

	private static String getDay(int sum) {
	// TODO Auto-generated method stub
		//원하는 날짜의 요일 구하는 방법
		// 기준일의 요일을 알아야 함. : 서기 1년1월1일의 요일은 월요일
		int num = sum % 7;
		
		switch (num) {
		case 0:
			return "일요일";
		case 1:
			return "월요일";
		case 2:
			return "화요일";
		case 3:
			return "수요일";
		case 4:
			return "목요일";
		case 5:
			return "금요일";
		case 6:
			return "토요일";

		}
		
		
	return null;
}

	private static int getMaxDate(int month, int year) {
		// TODO Auto-generated method stub
		
		switch (month) {
		case 1:		case 3:		case 5:		case 7:		case 8:		case 10:		case 12:
			return 31;
		case 4:		case 6:		case 9:		case 11:
			return 30;
		case 2:
			return isLeafYear(year)?29:28;
		}
		return 0;
		
	}

	private static boolean isLeafYear(int year) {
		// TODO Auto-generated method stub
		
		//윤년이면 true를 넘겨준다.
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
