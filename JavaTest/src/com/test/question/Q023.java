package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q023 {

//	아빠와 딸의 생일을 입력받아 아빠가 딸보다 며칠을 더 살았는지 출력하시오.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 스캐너 작성
		Scanner scan = new Scanner(System.in);
		
		//2. 안내메시지 출력 및 변수에 입력데이터 저장하기
		int dadYear=0, dadMonth=0, dadDay=0, daughterYear=0, daughterMonth=0, daughterDay=0;
		
		System.out.print("아빠 생일(년): ");
		dadYear = scan.nextInt();
		System.out.print("아빠 생일(월): ");
		dadMonth = scan.nextInt();
		System.out.print("아빠 생일(일): ");
		dadDay = scan.nextInt();
		
		System.out.print("딸 생일(년): ");
		daughterYear = scan.nextInt();
		System.out.print("딸 생일(월): ");
		daughterMonth = scan.nextInt();
		System.out.print("딸 생일(일): ");
		daughterDay = scan.nextInt();
		
		//아빠 생년월일 셋팅
		Calendar dad = Calendar.getInstance();
		dad.set(dadYear, dadMonth, dadDay);
		
		//딸 생년월일 셋팅
		Calendar daughter = Calendar.getInstance();
		daughter.set(daughterYear, daughterMonth, daughterDay);
		
		//아빠 딸 날짜 계산
		long dadTick = dad.getTimeInMillis();
		long dauthterTick = daughter.getTimeInMillis();
		
		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.\n"
				, (dauthterTick - dadTick) / 1000 / 60 / 60 / 24);
		
	}

}
