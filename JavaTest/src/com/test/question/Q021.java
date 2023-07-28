package com.test.question;

import java.util.Calendar;
import java.util.Scanner;

public class Q021 {

//	태어난 년도를 입력하면 나이를 출력하시오.
//
//	조건..
//	올해를 기준으로 나이를 계산하시오.
//	내년, 내후년에 실행해도 그때에 맞는 나이를 출력한다.
//	우리나라 나이로 출력하시오.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 스캐너 작성
		Scanner scan = new Scanner(System.in);
		
		//2. 안내메시지 출력 및 변수에 입력데이터 저장하기
		int year=0;
		
		System.out.print("태어난 년도: ");
		year = scan.nextInt();
		
		//3. 나이계산
		Calendar c1 = Calendar.getInstance();
		
		int age =0;
		age = c1.get(Calendar.YEAR) - year +1;
		
		System.out.printf("나이: %d세", age);

	}

}
