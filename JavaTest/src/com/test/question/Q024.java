package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q024 {

//	여러 배달 음식을 같은 시간에 받기를 원하는 고객이 있다. 
//	고객이 각각의 매장에 몇시에 전화를 해야 모든 음식을 같은 시간에 받을 수 있는지 알려주시오.
//
//	조건..
//	전화를 걸면 짜장면은 10분 뒤에 도착합니다.
//	전화를 걸면 치킨은 18분 뒤 도착합니다.
//	전화를 걸면 피자는 25분 뒤 도착합니다.
//	음식을 받기 원하는 시간은 오후 11시 이전에만 가능합니다.(날짜 변경 금지)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 스캐너 작성
		Scanner scan = new Scanner(System.in);
		
		//2. 안내메시지 출력 및 변수에 입력데이터 저장하기
		int hour=0, minute=0;
		int noodle = 10;
		int chicken = 18;
		int pizza = 25;
		
		System.out.println("음식을 받기 원하는 시각");
		System.out.print("시: ");
		hour = scan.nextInt();
		System.out.print("분: ");
		minute = scan.nextInt();
		
		//3. 음식받기 원하는 시각 셋팅
		Calendar c1 = Calendar.getInstance();
		c1.set(Calendar.HOUR_OF_DAY, hour);
		c1.set(Calendar.MINUTE, minute);
//		c1.set(hour, minute);
		
		//4. 음식마다 주문할 시각 계산
		if (c1.get(Calendar.HOUR_OF_DAY) >= 23) {
			System.out.println("주문할 시간이 지났습니다.");
		} else {
			
			c1.add(Calendar.MINUTE, -noodle);
			System.out.printf("짜장면: %d시 %d분\n", c1.get(Calendar.HOUR_OF_DAY), c1.get(Calendar.MINUTE));
			
			c1.set(Calendar.HOUR_OF_DAY, hour);
			c1.set(Calendar.MINUTE, minute);
			c1.add(Calendar.MINUTE, -chicken);
			System.out.printf("짜장면: %d시 %d분\n", c1.get(Calendar.HOUR_OF_DAY), c1.get(Calendar.MINUTE));
			
			c1.set(Calendar.HOUR_OF_DAY, hour);
			c1.set(Calendar.MINUTE, minute);
			c1.add(Calendar.MINUTE, -pizza);
			System.out.printf("짜장면: %d시 %d분\n", c1.get(Calendar.HOUR_OF_DAY), c1.get(Calendar.MINUTE));
		}
	}

}
