package com.test.question;

import java.util.Scanner;

public class Q003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		사각형의 너비와 높이를 입력받아 넓이와 둘레를 출력하시오.
		
		//1. 스캐너 작성하기
		Scanner scan = new Scanner(System.in);
		
		//2. 안내메시지 출력하기 및 입력데이터 변수에 저장하기
		System.out.print("너비(cm) : ");
		int width = scan.nextInt();
		
		System.out.print("높이(cm) : ");
		int height = scan.nextInt();
		
		//3. 넓이 계산하기
		int squareArea = width * height;
		
		//4. 둘레 계산하기
		int squareRound = (width + height) * 2;
		
		//5. 결과 출력하기
		System.out.printf("사각형의 넓이는 %dcm2입니다.\n", squareArea);
		System.out.printf("사각형의 둘레는 %dcm입니다.\n", squareRound);
		
		//6. 스캐너 닫기
		scan.close();
		
	}

}
