package com.test.question;

import java.util.Scanner;

public class Q006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		사용자의 한달 수입을 입력받아 세후 금액을 출력하시오.
		
		//1. 스캐너 작성하기
		Scanner scan = new Scanner(System.in);
		
		//2. 안내메시지 출력하기 및 입력데이터 변수에 저장하기
		System.out.print("한달 수입 금액(원): ");
		int salary = scan.nextInt();
		
		//3. 세후 금액 계산하기
		final double TAX = 0.033;
		double salaryTax = salary * TAX;
		double salaryAfterTax = salary - salaryTax;
		
		//4. 결과 출력하기
		System.out.printf("세후 금액(원): %,.0f원\n세금(원): %,.0f원", salaryAfterTax, salaryTax);
		
		//5. 스캐너 닫기
		scan.close();
		
		
	}

}
