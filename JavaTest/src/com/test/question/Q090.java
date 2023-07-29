package com.test.question;

import java.util.Scanner;

public class Q090 {

//	입력받은 문장에서 숫자를 찾아 그 합을 구하시오.
//
//	조건..
//	모든 숫자는 한자리 숫자로 처리한다.
//	입력..
//	입력: 국어 점수는 95점입니다. 
//
//	출력..
//	문장에 존재하는 모든 숫자의 합은 14입니다.
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력: ");
		
		String input = "";
		input = scan.nextLine();
		
		int sum=0;
		
		for (int i=0; i<input.length(); i++) {
			sum += getNumSum(input.charAt(i));
		}
		
		System.out.printf("문장에 존재하는 모든 숫자의 합은 %d입니다.", sum);
		
	}

	private static int getNumSum(char c) {
		// TODO Auto-generated method stub
		
		//아스키코드가 숫자가 맞으면 숫자를 반환
		if(c >= '1' && c <= '9') {
			return c-'1'+1;
		}
		return 0;
	}
	
}
