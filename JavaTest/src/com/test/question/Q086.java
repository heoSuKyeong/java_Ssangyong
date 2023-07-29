package com.test.question;

import java.util.Scanner;

public class Q086 {
	
//	숫자를 입력받아 3자리마다 , 를 붙이시오.
//
//	조건..
//	%,d 사용 금지
//	입력..
//	숫자: 1234 
//
//	출력..
//	결과: 1,234
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//입력받기
		System.out.print("숫자: ");
		
		String num = scan.nextLine();
		
		int len = num.length();
		String result = "";
		//3자리마다 , 붙이기
//		for (int i=num.length(); i>0; i--) {
//			if (i%3==0) {
//				result += 
//			}
//		}
		if (len > 3) {
//			int i = len % 3;
			for (int i = 0; i<len-1; i++) {
				if (i>len-3) {
					break;
				}
				result += num.substring(i, len%3 + i) + ",";
				result += num.substring(i, i+1);
//				i += 3;
				
			}
			
		}
		
		System.out.printf("결과: %s", result);
		
	}

}
