package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q032 {

//	주차 요금을 계산하시오.
//
//	조건..
//	무료 주차: 30분
//	초과 10분당: 2,000원
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 스캐너 작성
		Scanner scan = new Scanner(System.in);
		
		//2. 안내메시지 출력 및 변수에 입력데이터 저장하기
		int entranceHour=0, entranceMin=0, exitHour=0, exitMin=0;
		
		System.out.println("[들어온 시간]");

		System.out.print("시: ");
		entranceHour = scan.nextInt();
		System.out.print("분: ");
		entranceMin = scan.nextInt();
		
		System.out.println("[나간 시간]");
		
		System.out.print("시: ");
		exitHour = scan.nextInt();
		System.out.print("분: ");
		exitMin = scan.nextInt();
		
		ParkingFeeCalculation(entranceHour, entranceMin, exitHour, exitMin);
		
	}

	private static void ParkingFeeCalculation(int entranceHour, int entranceMin, int exitHour, int exitMin) {
		// TODO Auto-generated method stub
		long gap=0, fee=0;
		
		Calendar entrance = Calendar.getInstance();
		
		entrance.set(Calendar.HOUR_OF_DAY, entranceHour);
		entrance.set(Calendar.MINUTE, entranceMin);
		
		Calendar exit = Calendar.getInstance();
		
		exit.set(Calendar.HOUR_OF_DAY, exitHour);
		exit.set(Calendar.MINUTE, exitMin);
		
		gap = exit.getTimeInMillis() - entrance.getTimeInMillis(); //3000011
		fee = (((gap / 1000 / 60) - 30) / 10) * 2000;
		
		System.out.printf("주차 요금은 %,d원입니다.", fee);
	}

}
