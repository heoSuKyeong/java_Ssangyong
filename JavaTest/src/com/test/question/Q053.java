package com.test.question;

public class Q053 {
	
//	아래와 같이 출력하시오.
//
//	조건..
//	구구단을 출력하시오.
//	2~5단
//	6~9단
	
	public static void main(String[] args) {
		
		triple();	//3중 for문
//		quadruple();	//4중 for문
		
	}

private static void triple() {
	// TODO Auto-generated method stub
	
	//3중 for문
	for(int i=1; i<=9; i++) {
		for (int j=2; j<=5; j++) {
			System.out.printf("%d X %d = %2d\t", j, i, j*i);
		}
		System.out.println();
		for (int j=6; j<=9; j++) {
			System.out.printf("%d X %d = %2d\t", j, i, j*i);
		}
	}
	
	
	
}

private static void quadruple() {
	// TODO Auto-generated method stub
	
	//4중 for문
	for(int i=1; i<=9; i++) {
		for (int j=2; j<=5; j++) {
			System.out.printf("%d X %d = %2d\t", j, i, j*i);
		}
		System.out.println();
	}
	
	System.out.println();
	
	for(int i=1; i<=9; i++) {
		for (int j=6; j<=9; j++) {
			System.out.printf("%d X %d = %2d\t", j, i, j*i);
		}
		System.out.println();
	}
}
	
	
}
