package com.test.question;

import java.util.Scanner;

public class Q047 {

//	자판기 프로그램을 구현하시오..
//	선택 가격보다 투입 금액이 적을 경우 에러메시지 출력
	
//	엔터문제 해결하기!!
	
	public static void main(String[] args) {
		// 스캐너 작성하기
		Scanner scan = new Scanner(System.in);
		
		//자판기 메뉴 출력
		int cola=700, cider=600, vita=500;
		int amount=0, num=0;
		
		for(;;) {
			System.out.println("==================");
			System.out.println("      자판기");
			System.out.println("==================");
			System.out.printf("1. 콜라 : %d원\n", cola);
			System.out.printf("2. 사이다 : %d원\n", cider);
			System.out.printf("3. 비타500: %d원\n", vita);
			System.out.println("------------------");
			System.out.print("금액 투입(원) : ");
			amount = scan.nextInt();
			System.out.println("------------------");
			System.out.print("음료 선택(번호) : ");
			num = scan.nextInt();
			
			String drinkName="";
			int drinkPirce=0;
			switch (num) {
			case 1:
				drinkName = "콜라";
				drinkPirce = cola;
				break;
			case 2:
				drinkName = "사이다";
				drinkPirce = cider;
				break;
			case 3:
				drinkName = "비타500";
				drinkPirce = vita;
				break;

			default:
				System.out.println("메뉴 내에서 선택해주세요");
//				break;
				continue;
			}
			
			if(amount < drinkPirce) {
				System.out.println("음료가격보다 투입금액이 적습니다.");
//				break;
				continue;
			}
			
			System.out.printf("+%s를 제공합니다.\n"
					+ "+잔돈 %d을 제공합니다.\n", drinkName, amount-drinkPirce);
			System.out.println("계속하시려면 엔터를 입력하세요. ");
			scan.nextLine();
			scan.nextLine();
			
		}
		
	}
}
