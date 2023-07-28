package com.test.question;

import java.util.Scanner;

public class Q015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		사과 나무가 있다. 
//		사과 나무 씨앗을 심을 날로부터 특정 시간이 흘렀을 때 사과 총 몇개가 열리는지 구하는 메소드를 선언하시오.
//		조건..
	//		int getApple(int sunny, int foggy)
	//		사과 나무를 처음 심었을 때 나무의 길이: 0m
	//		맑은 날 사과 나무의 성장률: 5㎝
	//		흐린 날 사과 나무의 성잘률: 2㎝
	//		사과 나무는 길이가 1m 넘는 시점부터 사과가 열린다.
	//		1m 넘는 시점부터 10㎝ 자랄 때마다 사과가 1개씩 열린다.
	
		//1. 스캐너 작성
		Scanner scan = new Scanner(System.in);
		
		//2. 안내메시지 출력 및 변수에 입력데이터 저장하기
		System.out.print("맑은 날 : ");
		int sunny = scan.nextInt();
		System.out.print("흐린 날 : ");
		int foggy = scan.nextInt();
		
		//3. 메소드 호출하기
		int result = getApple(sunny, foggy);
		System.out.printf("사과가 총 %d개 열렸습니다.\n", result);
		
		//4. 스캐너 종료
		scan.close();
		
	}
	public static int getApple(int sunny, int foggy) {
		int treeHeightCM = sunny * 5 + foggy * 2;
		int appleCnt = (treeHeightCM - 100) / 10;
		return appleCnt;
	}

}
