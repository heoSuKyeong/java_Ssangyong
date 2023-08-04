package com.test.question;

import java.util.Scanner;

public class Q089 {
	
//	입력받은 금액을 한글로 출력하시오.
//
//	조건..
//	입력 범위(원): 0 ~ 99,999,999
//	
//	입력..
//	금액(원): 53216 
//
//	출력..
//	일금 오만삼천이백일십육원
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액(원): ");
		
		String amount = scan.nextLine();
		String money = "";
		
		if (amount.length() < 9) {
			for (int i=0; i<amount.length(); i++) {
				money += getInt(amount.charAt(i));
				money += getUnit(i, amount.length(),amount.charAt(i));
				
			}
		}
		System.out.printf("일금 %s원", money);
		
	}

	private static String getUnit(int i, int length, char c) {
	// TODO Auto-generated method stub
		if (c=='0') return "";
		
		int unit = length - i;
		switch (unit) {
		case 2:
			return "십";
		case 3:
			return "백";
		case 4:
			return "천";
		case 5:
			return "만";
		case 6:
			return "십";
		case 7:
			return "백";
		case 8:
			return "천";

		default:
			return "";
		}
		
		
	}

	private static String getInt(char num) {
		// TODO Auto-generated method stub
		String result = "";
		switch (num) {
		case '1':
			result = "일";
			break;
		case '2':
			result = "이";
			break;
		case '3':
			result = "삼";
			break;
		case '4':
			result = "사";
			break;
		case '5':
			result = "오";
			break;
		case '6':
			result = "육";
			break;
		case '7':
			result = "칠";
			break;
		case '8':
			result = "팔";
			break;
		case '9':
			result = "구";
			break;

		default:
			result = "";
			break;
		}

		return result;
	}
	
}
