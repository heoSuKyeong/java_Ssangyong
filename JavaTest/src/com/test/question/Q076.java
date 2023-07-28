package com.test.question;

import java.util.Scanner;

public class Q076 {

//	성적을 입력받아 아래와 같이 출력하시오.
//
//	조건..
//	String[][] score = new String[10][3];
	
//	입력..
//	국어 점수: 80 
//	영어 점수: 50 
//	수학 점수: 70 
	
	public static void main(String[] args) {
		
		String[][] score = new String[10][3];	//성적 그래프 배열
		int[] scoreInt = new int[3];			//국어, 영어, 수학 점수 저장
		
		//스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		//점수 입력받기
		System.out.print("국어 점수: ");
		scoreInt[0] = scan.nextInt();
		
		System.out.print("영어 점수: ");
		scoreInt[1] = scan.nextInt();
		
		System.out.print("수학 점수: ");
		scoreInt[2] = scan.nextInt();

		//세로로 접근하기
		for(int i=0; i<score[0].length; i++) {		//0~2까지
			int empty = (100-scoreInt[i])/10;		//빈칸 수
			for (int j=0; j<score.length; j++) {	//0~9까지
				if (j<empty) {
					score[j][i] = " ";
					
				} else {
					score[j][i] = "■";
				}
			}
		}
		
		//결과출력
		for (int i=0; i<score.length; i++) {
			for (int j=0; j<score[i].length; j++) {
				System.out.printf("%s\t", score[i][j]);
			}
			System.out.println();
		}
		System.out.println("--------------------");
		System.out.println("국어\t영어\t수학");
	}
}
