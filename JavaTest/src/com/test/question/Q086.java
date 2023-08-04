package com.test.question;

import java.util.Scanner;

public class Q086 {
//	에러남
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
		
		int index = -1;
		String result = "";
		//3자리마다 , 붙이기
		index = (num.length()%3==0)? 3 : num.length()%3;
		if (num.length() > 3) {
			int i=0;
			
			while(true) {
				if (index > num.length()) break;
				
				result += num.substring(i, index);
				
				
				result += ",";
				
				i += index;
				index += 3;
				
			}
			
//			for (int i=0; i<num.length(); i++) {
//				result += num.substring(i, index+i);
//				
//				if (i > num.length()) break;
//				result += ",";
//				index += 3;
				
//			}
		} else {
			result = num;
		}
		
		System.out.printf("결과: %s", result);
		
	}

}
