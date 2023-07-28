package com.test.question;

import java.util.Scanner;

public class Q043 {
//
//	컴퓨터가 1~10 사이의 숫자 1개를 생각하면 사용자가 맞추는 프로그램을 구현하시오.
//
//	조건..
//	시도 횟수가 10회가 넘어가면 프로그램을 종료하시오.
	
	public static void main(String[] args) {

		//스캐너 작성하기
		Scanner scan = new Scanner(System.in);
		
		//안내문 출력 및 입력값 변수로 저장
		System.out.println("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.");
		
		int num = 0;
		
		//컴퓨터가 생각한 숫자 랜덤 생성
		int random = (int)(Math.random()*10)+1;
		System.out.println(random);
		
		int i=1;
		for (i=1; i<=10; i++) {
			System.out.printf("%d. 숫자: ", i);
			num = scan.nextInt();
			
			if(num != random) {
				System.out.println("틀렸습니다.");
			} else {
//				사용자가 입력한 숫자와 랜덤한 숫자가 같으면 반복문을 빠져나옴
				System.out.println("맞았습니다.");
				System.out.println();
				break;
			}
		}
		
		System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", random);
		//사용자가 시도한 횟수(i)가 10번 미만이면 시도한 횟수 출력, 이상이면, 실패 결과 출력 
		if (i<10) {
			System.out.printf("정답을 맞추는데 시도한 횟수는 %d회입니다.\n",i);
		} else {
			System.out.println("모든 기회를 실패했습니다.");
		}
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
	}

}
