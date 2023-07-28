package com.test.question;

import java.util.Scanner;

public class Q044 {

//	숫자를 N개 입력받아 아래와 같이 출력하시오.
//
//	조건..
//	누적값이 100을 넘어가는 순간 루프를 종료하시오.
//	짝수는 더하고 홀수는 빼시오.
	
	
	public static void main(String[] args) {
		
		//스캐너 작성하기
		Scanner scan = new Scanner(System.in);
		
		//누적합(sum)이 100미만일 때까지 입력 값 받기
		
		int num=0, sum=0;
		String result="";
		
		for (int i=0; sum<100; i++) {
			System.out.print("숫자: ");
			num = scan.nextInt();
			
			//입력 값이 짝수이면, sum에 더하고 result에 '+'와 입력 값 붙여주기
			if (num % 2 == 0) {
				sum += num;
				result = result + " + " + num;
			} else {
				sum -= num;
				result = result + " - " + num;
			}
		}
		
		System.out.print(result + " = " + sum);
		
	}

}
