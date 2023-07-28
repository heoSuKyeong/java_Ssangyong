package com.test.java;

import java.util.Scanner;

public class Ex31_while {

	public static void main(String[] args) {
		/*
		반복문
		1. for문
		2. while문
		3. do while문
		4. 다른 형식의 for문
		
		if (조건식) {
			문장;
		}
		
		while (조건식) {
			문장;
		}
		
		*/
		
//		m1();	//while
//		m2();	//do while
//		m3();	//for, while
		m4();	//콘솔 > UI
		
	}

	private static void m4() {
		// TODO Auto-generated method stub
		
		//콘솔 > UI
		//자판기 예시
		//1. 메뉴출력
		//2. 사용자 선택
		//3. 결과 출력
		//1~3 반복
		
		Scanner scan = new Scanner(System.in);
		
		int sel =0;	//사용자가 선택한 메뉴 번호
		boolean loop = true;	//반복 조건
		
		while(loop) {
			menu();
			
			sel = scan.nextInt();
			scan.skip("\r\n");	//엔터 스킵
			
			if(sel==1) {
				
				System.out.println("콜라");
				pause(scan);
				
			} else if(sel==2) {
				System.out.println("사이다");
				pause(scan);
			} else if(sel==3) {
				System.out.println("커피");
				pause(scan);
			} else {
				loop=false;
			}
			
		}//while
		System.out.println("종료합니다.");
		
	}

	private static void menu() {
		System.out.println("===============");
		System.out.println("    자판기");
		System.out.println("===============");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 커피");
		System.out.println("4. 종료");
		System.out.println("---------------");
		System.out.print("선택(번호): ");
	}

	private static void pause(Scanner scan) { //scan 변수를 사용하고 있어서 매개변수로 받아온다.
		//프로그램을 잠시 중단(콘솔 버전) > 블럭 걸기
		System.out.println("계속하려면 엔터를 입력하세요.");
		
		scan.nextLine();
	}

	private static void m3() {
		// TODO Auto-generated method stub
		
		//요구사항) 1~10까지 누적하시오.
		
		//for
		int sum=0;
		
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.printf("sum: %d\n", sum);
		
		sum=0;
		int i=1;
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.printf("sum: %d\n", sum);
	}

	private static void m2() {
		// TODO Auto-generated method stub
		
		int num=11;
		while (num<=10) {
			System.out.println(num);
			num++;
		}
		System.out.println();
		
		num=11;
		do {
			System.out.println(num);
			num++;
		} while (num<=10);
	}

	private static void m1() {
		// TODO Auto-generated method stub
		
		//요구사항) 1~10까지 출력하시오.
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		int i=1;	//초기식
		while(i<=10) {	//조건식
			System.out.println(i);
			i++;	//증감식
		}
	}
}
