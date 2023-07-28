package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q022 {

//	남녀 커플의 이름과 만난날을 입력받아 기념일을 출력하시오.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 스캐너 작성
		Scanner scan = new Scanner(System.in);
		
		//2. 안내메시지 출력 및 변수에 입력데이터 저장하기
		String manName="", femaleName="";
		int year=0, month=0, day=0;
		
		System.out.print("남자이름 : ");
		manName = scan.nextLine();
		
		System.out.print("여자이름 : ");
		femaleName = scan.nextLine();
		
		System.out.print("만난날(년) : ");
		year = scan.nextInt();
		scan.nextLine();
		
		System.out.print("만난날(월) : ");
		month = scan.nextInt();
		scan.nextLine();
		
		System.out.print("만난날(일) : ");
		day = scan.nextInt();
		scan.nextLine();
		
		
		// 만난 날짜 설정
		Calendar anniversary = Calendar.getInstance();
		anniversary.set(year, month-1, day);
		System.out.printf("'%s'과(와) '%s'의 기념일\n", manName, femaleName);
		
		// 100일 계산
		anniversary.add(Calendar.DATE, 100);
		System.out.printf("100일: %tF\n", anniversary);
		
		// 200일 계산
		anniversary.set(year, month-1, day);
		anniversary.add(Calendar.DATE, 200);
		System.out.printf("200일: %tF\n", anniversary);
		
		// 300일 계산
		anniversary.set(year, month-1, day);
		anniversary.add(Calendar.DATE, 300);
		System.out.printf("300일: %tF\n", anniversary);
		
		// 500일 계산
		anniversary.set(year, month-1, day);
		anniversary.add(Calendar.DATE, 500);
		System.out.printf("500일: %tF\n", anniversary);
		
		// 1000일 계산
		anniversary.set(year, month-1, day);
		anniversary.add(Calendar.DATE, 1000);
		System.out.printf("1000일: %tF\n", anniversary);
	}

}
