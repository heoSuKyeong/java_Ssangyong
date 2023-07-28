package com.test.question;

import java.util.Scanner;

public class Q045 {

//	사용자가 입력한 범위의 숫자까지 369 게임 과정을 출력하시오.
//
//	조건..
//	최대 3자리까지만 입력하시오.

	public static void main(String[] args) {

		// 스캐너 작성하기
		Scanner scan = new Scanner(System.in);

		// 안내문 출력 및 입력값 변수로 저장
		int num = 0;

		System.out.print("최대 숫자: ");
		num = scan.nextInt();
		
		//유효성 검사 및 369게임 출력
		String result="";
		if (num<1000) {
			for (int i=1; i<=num; i++) {
				String temp="";
				int n=i;
				
				for (;n>0;) {
					if(n % 10 % 3 == 0 && n % 10 != 0) {
						temp += "짝";
						
					}
					n/=10;
				}
				if (temp.equals("")) {
					temp += i;
				}
				result = result + temp + " ";
			}
			System.out.println(result);
		} else {
			System.out.println("1000 이하만 가능합니다.");
		}
		
		// 369출력
		
		
		
		
//		for (int i=1; i<=num; i++) {
//			//3,6,9가 들어가면 "짝"으로 출력
//			String a = i+"";
//			if (i<10) {
//				char c1 = a.charAt(0);
//				if(c1 =='3' || c1=='6' || c1=='9') {
//					System.out.print("짝");
//				} else {
//					System.out.printf(" %d ", i);
//				}
//			} else if (i<100) {
//				for (int j=0; j<2; j++) {
//					char c1 = a.charAt(j);
//					if(c1 =='3' || c1=='6' || c1=='9') {
//						System.out.print("짝");
//					} 
//					continue;
//				}
//				System.out.printf(" %d ", i);
//				
//			}
//			
//		}
		

	}

}
