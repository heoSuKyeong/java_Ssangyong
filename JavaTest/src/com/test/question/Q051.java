package com.test.question;

import java.util.Scanner;

public class Q051 {
//	아래와 같이 출력하시오.
//
//	조건..
//	행의 갯수를 입력받으시오.
//	입력..
//	행: 5 
//
//	출력..
//	    *
//	   ***
//	  *****
//	 *******
//	*********
	
	public static void main(String[] args) {
		
		//스캐너 작성하기
		Scanner scan = new Scanner(System.in);
		
		//행 입력받기
		int row=0;
		System.out.print("행: ");
		row = scan.nextInt();
		
		//출력하기
		for (int i=0; i<row; i++) {
			//가운데 별 기준 왼쪽 공백
			for (int j=0; j<row-i; j++) {
				System.out.print(" ");
			}
			//가운데 별 기준 왼쪽 별
			for (int k=0; k<=i ; k++) {
				System.out.print("*");
			}
			//가운데 별 기준 오른쪽 별
			for (int l=0; l<i; l++) {
				System.out.print("*");
			}
			//가운데 별 기준 오른쪽 공백
			for (int m=0; m<row-i; m++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
		
	}
}
