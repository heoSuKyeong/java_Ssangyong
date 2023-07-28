package com.test.java;

public class Ex33_Array {

	
	public static void main(String[] args) {
		
		//다차원 배열
		
//		m1();	//1차원 배열, 2차원 배열, 3차원 배열 접근과 출력
//		m2();	//다차원 초기화 리스트
//		m3();	//다차원 배열의 길이(length)
//		m4()	//배열 내에서 존재하는지 검색
		m5();	//과제 설명용
		
		
	}

	private static void m5() {
		// TODO Auto-generated method stub
		
		//5x5 2차원 배열
		
		int[][] num = new int[5][5];
		
		//데이터 입력
		int n=1;
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				num[i][j] = n;
				n++;
			}
		}
		
		//출력 > 수정없이 그대로 사용
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.printf("%5d", num[i][j]);
			}
			System.out.println();
		}
		
	}

	private static void m4() {
		// TODO Auto-generated method stub
		
		String[] member = {"홍길동", "아무개", "하하하", "강호동", "유재석", "정형돈", "노홍철", "박명수", "하하", "정준하"};
		
		//1. 배열 안에서 원하는 데이터가 존재하는지 검색
		String name = "홍길";
		if (contains(member, name)) {
			System.out.println(name + "을 찾았습니다.");
		} else {
			System.out.println(name + " 없습니다.");
		}
		
		//2. 배열 > 원하는 데이터 존재하는 검색 후 있다면 몇번째 방에 있는지 출력
		
		int index = indexOf(member, name);
		
		if (index>=0) {
			System.out.println(index + "방에 있습니다.");
		} else {
			System.out.println(name + " 없습니다.");
		}
				
	}

	private static int indexOf(String[] member, String name) {
		// TODO Auto-generated method stub
		
		for (int i=0; i<member.length; i++) {
			if (member[i].equals(name)) {
				return i;
			}
		}
		return -1;
	}

	private static boolean contains(String[] member, String name) {
		// TODO Auto-generated method stub
		
		for (int i=0; i<member.length; i++) {
			if (member[i].equals(name)) {
				return true;
			}
		}
		return false;
	}

	private static void m3() {
		// TODO Auto-generated method stub
		
		int[] num1 = {10,20,30};
		
		for(int i=0; i<num1.length; i++) {
			System.out.println(num1[i]);
		}
		System.out.println();
		
		int[][] num2 = {{10,20,30}, {40,50,60}};
		
		System.out.println(num2.length);		//열의 갯수 > 2
		System.out.println(num2[0].length);		//0열의 길이 > 3
		
		for (int i=0; i<num2.length; i++) {
			for (int j=0; j<num2[0].length; j++) {
				System.out.println(num2[i][j]);
			}
		}
		
	}

	private static void m2() {
		// TODO Auto-generated method stub
		
		//다차원 초기화 리스트
		int[] num1;
		num1 = new int[] {10, 20, 30};
		
		int[] num2 = {10, 20, 30};
		
		int[][] num3 = new int[2][3];
		int[][] num4 = new int[][] {{10,20,30}, {40,50,60}};
		int[][] num5 = {{10,20,30}, {40,50,60}};
		
		int[][][] num6 = new int[2][2][3];
		int[][][] num7 = new int[][][] {{{10,20,30}, {40,50,60}}, {{10,20,30}, {40,50,60}}};
		int[][][] num8 = {{{10,20,30}, {40,50,60}}, {{10,20,30}, {40,50,60}}};
		int[][][] num9 = 
		{
			{
				{10,20,30}, 
				{40,50,60}
			}, 
			{
				{10,20,30}, 
				{40,50,60}
			}
		};
		
		
		
	}

	private static void m1() {
		//1차원 배열
		int[] num1 = new int[3];
		
		//1차원 배열의 요소 접근
		num1[0] = 100;
		
		//탐색
		for(int i=0; i<3; i++) {
			System.out.printf("num1[%d] = %d\n", i, num1[i]);
		}
		System.out.println();
		System.out.println();
		
		
		//2차원 배열
		int[][] num2 = new int[2][3];	//[2] : 2차원,행 / [3] : 1차원,열
		
		num2[0][0] = 100;
		num2[0][1] = 200;
		num2[0][2] = 300;
		
		num2[1][0] = 400;
		num2[1][1] = 500;
		num2[1][2] = 600;
		
		for (int i=0; i<2; i++) {
			for (int j=0; j<3; j++) {
				System.out.printf("num2[%d][%d] = %d\n", i, j, num2[i][j]);
			}
		}
		System.out.println();
		System.out.println();
		
		//3차원 배열
		int[][][] num3 = new int[2][2][3]; 	//[2] : 3차원, 동, 면 / [2] : 2차원, 층, 행 / [3] : 1차원, 호, 열
		
		num3[0][0][0] = 1;
		num3[0][0][1] = 2;
		num3[0][0][2] = 3;
		
		num3[0][1][0] = 4;
		num3[0][1][1] = 5;
		num3[0][1][2] = 6;
		
		num3[1][0][0] = 7;
		num3[1][0][1] = 8;
		num3[1][0][2] = 9;
		
		num3[1][1][0] = 10;
		num3[1][1][1] = 11;
		num3[1][1][2] = 12;
		
		for (int i=0; i<2; i++) {
			for (int j=0; j<2; j++) {
				for (int k=0; k<3; k++) {
					System.out.printf("num3[%d][%d][%d] = %d\n", i, j, k, num3[i][j][k]);
				}
			}
		}
		
	}
	
	
}
