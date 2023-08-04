package com.test.question;

import java.util.Scanner;

public class Q088 {
다시하기
//	금지어를 마스킹 처리 하시오.
//
//	조건..
//	금지어
//	바보
//	멍청이
//	입력..
//	입력: 너랑 안놀아 바보야!! 
//
//	출력..
//	너랑 안놀아 **야!!
//	금지어를 1회 마스킹했습니다.
	
	public static void main(String[] args) {
		
		String[] words = {"바보", "멍청이"};
		
		
		int count =0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력: ");
		
		String input = scan.nextLine();
		
		//방법 2 : indexOf 로 위치를 찾고, 마스킹 처리
		int index = -1;
		
//		while(true) {
//			for (int i=0; i<words.length; i++) {
//				index = input.indexOf(words[i], index);
//				count++;
//				if (index < 0) {
//					break;
//				}
//				index += words[i].length();
//			}
//		}
//		
//		for (int i=0; i<words.length; i++) {
//			String masking = "";
//			if (input.contains(words[i])) {			//입력문구에 금지어 포함 여부
//				for (int j=0; j<words[i].length(); j++) {		//금지어 길이 만큼 마스킹
//					masking += "*";
//				}
//				input = input.replace(words[i], masking);
//			}
//		}
//		
		
		
		//방법 1 : contains 검색 후 있다면 치환(마스킹)처리한다. > 단, 중복 금지어가 있으면 count가 하나만 올라간다.
		/*
		for (int i=0; i<words.length; i++) {
			String masking = "";
			if (input.contains(words[i])) {			//입력문구에 금지어 포함 여부
				for (int j=0; j<words[i].length(); j++) {		//금지어 길이 만큼 마스킹
					masking += "*";
				}
				input = input.replace(words[i], masking);
				count++;
			}
		}
		*/
		System.out.println(input);
		System.out.printf("금지어를 %d회 마스킹했습니다.", count);
		
		
	}
	
	
}
