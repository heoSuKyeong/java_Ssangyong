package com.test.java;

public class Ex30_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		m1();
//		m2();
//		m3();
//		m4();
		m5();
		
	}


	private static void m5() {
		// TODO Auto-generated method stub
		
		//별찍기(5x5)
		int n=1;
		for(int i=0; i<5; i++) {	//행 만들기(통상적)
			for (int j=0; j<5; j++) {	//열만들기
				System.out.print("*");
//				System.out.printf("%2d", n);
//				n++;
			}
			System.out.println();
		}
		System.out.println();
		
		//아래로 감소하는 삼각형
		for(int i=0; i<5; i++) {	//행 만들기(통상적)
			for (int j=i; j<5; j++) {	//열만들기
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//아래로 증가하는 삼각형
		for(int i=0; i<5; i++) {	//행 만들기(통상적)
			for (int j=0; j<=i; j++) {	//열만들기
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
	}


	private static void m4() {
		// TODO Auto-generated method stub
		
		//루프 > 분기문 개입(break, continue)
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if (j==5) {
					break;	//자신이 포함된 제어문을 탈출한다.
				}
				System.out.printf("i: %d, j: %d\n", i, j);
			}
		}
	}


	private static void m3() {
		// TODO Auto-generated method stub
		
		//쌍용교육센터
		//- 강의실(1강의실 ~ 6강의실)
		//- 학생들(30명)
		
		for (int i=1; i<=6; i++) {
			for (int j=1; j<=30; j++) {
				System.out.printf("%d강의실 %d번 학생\n", i, j);
			}
		}
		
	}


	private static void m2() {
		// TODO Auto-generated method stub
		
		//구구단(2단~9단)
		for (int i=2; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				System.out.printf("%d X %d = %2d\n", i, j, i*j);
			}
			System.out.println();
		}
	}


	private static void m1() {
		// TODO Auto-generated method stub
		
		//중첩된 반복문
		
		/*
		 * 2중 반복문
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
//				System.out.println("실행문");
				System.out.printf("i :%d, j: %d\n", i, j);
			}
		}
		*/
		
		//3중 for문
		for(int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				for (int k=0; k<10; k++) {
					System.out.printf("i: %d, j: %d, k: %d\n", i, j, k);
				}
			}
		}
		
	}

}
