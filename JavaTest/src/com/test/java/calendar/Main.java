package com.test.java.calendar;

import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		
		//파일
		//- Main : 달력 출력
		//- Data : 일정 처리(읽기)
		//- Item : 일정 저장
		
		
		//달력 + 일정 출력
		
		
		//일정 불러오기
		//- item.txt 를 Data.list로 불러오기
		Data.load();
		
		
		//달력 출력
		//1. 년월 > 1일이 무슨 요일 인지
		//2. 해당 년월의 마지막 날짜
		
		int year = 2023;
		int month = 8;
		
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1);	// 2023/08/01 설정
		
		int lastDate = c.getActualMaximum(Calendar.DATE);	//DATE가 가지는 가장 큰 숫자 > 마지막 날
		int firstDay = c.get(Calendar.DAY_OF_WEEK);		//1일의 요일
		
//		for (month = 1; month<=12; month++) {}
		System.out.println("\t\t\t" + month + "월");
		System.out.println("[일]\t[월]\t[화]\t[수]\t[목]\t[금]\t[토]");
		
		for(int i=0; i<firstDay-1; i++) {
			System.out.print("\t");
		}
		
		for (int i=1; i<=lastDate; i++) {
			System.out.printf("%3d\t",i);
			
			if ((i + firstDay) %7 == 1) {
				System.out.println();
				
				/*
				//일정출력
				//- 위에서 출력 된 날짜와 동일한 날짜의 일정이 있는지 확인하기 위한 Loop
				for (int j=0; j<Data.list.size(); j++) {
					if(Data.list.get(j).getDate().equals(String.format("%d-%02d-%02d", year,month, i))) {
						System.out.print(Data.list.get(j).getTitle());
					}
				}
				*/
				
				//현재 출력되는 날짜의 한주(일주일)
				for (int j= i+1-7; j<i+8-7 && j<=lastDate; j++) {
					System.out.printf("%s\t", getItem(String.format("%d-%02d-%02d", year,month, j)));
				}
				System.out.println();
				System.out.println();
			}
		}
		
		
		
	}

	private static Object getItem(String date) {
		
		for (Item item : Data.list) {
			if (item.getDate().equals(date)) {
				return item.getTitle();
			}
		}
		return "";
	}
	
	
	
}
