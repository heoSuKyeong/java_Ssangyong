package com.test.question;

import java.util.Scanner;

public class Q027 {
	
//	문자 1개를 입력받아 아래와 같이 출력하시오.
//
//	조건..
//	f, F → Father
//	m, M → Mother
//	s, S → Sister
//	b, B → Brother
//	유효성 검사를 하시오.(위의 문자가 아닌 문자는 예외 처리)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 스캐너 작성
		Scanner scan = new Scanner(System.in);
		
		//2. 안내메시지 출력 및 변수에 입력데이터 저장하기
		System.out.print("문자: ");
		char input = scan.nextLine().charAt(0);
		String result = "";
		if (input == 'f' || input == 'F') {
			result = "Father";
		} else if (input == 'm' || input == 'M') {
			result = "Mother";
		} else if (input == 's' || input == 'S') {
			result = "Sister";
		} else if (input == 'b' || input == 'B') {
			result = "Brother";
		} 
		
		//결과 출력하기
		if (result != "") {
			System.out.println(result);
		} else {
			System.out.println("입력한 문자가 올바르지 않습니다.");
		}
	}

}
