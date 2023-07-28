package com.test.question;

import java.util.Scanner;

public class Q049 {
	
//	아래와 같이 출력하시오.
//
//	조건..
//	행의 갯수를 입력받으시오.
//	
//	*****
//	 ****
//	  ***
//	   **
//	    *

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//스캐너 작성하기
		Scanner scan = new Scanner(System.in);
		
		//행 입력받기
		int row=0;
		System.out.print("행: ");
		row = scan.nextInt();
		
		//출력하기
		for (int i=0; i<row; i++) {
			for (int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for (int k=i; k<row; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
