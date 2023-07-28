package com.test.question;

import java.util.Scanner;

public class Q012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		숫자를 전달하면 '짝수' 혹은 '홀수' 라는 단어를 반환하는 메소드를 선언하시오.
		
		//1. 스캐너 작성
		Scanner scan = new Scanner(System.in);
		
		//2. 안내메시지 출력 및 변수에 입력데이터 저장하기
		System.out.print("숫자 : ");
		int n = scan.nextInt();
		
		//3. 메소드 호출
		String result = getNumber(n); 
		System.out.printf("입력하신 숫자 '%d'는(은) '%s'입니다.\n", n, result);
		
		//4. 스캐너 종료
		scan.close();
		
	}
	
	public static String getNumber(int num) {
		
		return (num % 2 == 0 ? "짝수" : "홀수");
	}

}
