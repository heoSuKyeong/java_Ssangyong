package com.test.question;

import java.util.Scanner;

public class Q026 {
	
//	학생의 국어 점수를 입력받아 성적을 출력하시오.
//
//	조건..
//	90 ~ 100: A
//	80 ~  89: B
//	70 ~  79: C
//	60 ~  69: D
//	 0 ~   59: F
//	유효성 검사를 하시오.(점수: 0 ~ 100점 이내)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 스캐너 작성
		Scanner scan = new Scanner(System.in);
		
		//2. 안내메시지 출력 및 변수에 입력데이터 저장하기
		System.out.print("점수: ");
		int score = scan.nextInt();
		char grade = ' ';
		
		//3. 점수를 성적으로 환산
		if (score > 100) {
			grade = ' ';
		} else if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		}else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else if (score >= 0) {
			grade = 'F';
		}
		
		if (grade != ' ') {
			System.out.printf("입력한 %d점은 성적 %c입니다.", score, grade);
		} else {
			System.out.println("점수가 올바르지 않습니다. 0~100사이의 값을 입력하시오.");
		}
	}

}
