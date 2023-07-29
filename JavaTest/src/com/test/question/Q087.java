package com.test.question;

import java.util.Scanner;

public class Q087 {

//	영단어를 입력받아 분리하시오.
//
//	조건..
//	합성어를 입력한다.
//	합성어는 파스칼 표기법으로 입력한다.
//	출력은 각 단어를 공백으로 구분한다.
//	입력..
//	단어: StudentName 
//
//	출력..
//	결과: Student Name
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단어: ");
		
		String str = scan.nextLine();
		String result = "";
		result = getEmtpy(str);		//substring 사용
		result = getEmtpy(str, 1);	//charAt 사용
		
		System.out.printf("결과: %s", result);
	}
	
	

	private static String getEmtpy(String str, int a) {
	// TODO Auto-generated method stub
		
		//charAt 사용
		
		String result = "";
		
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' && i!=0) {
				result += " ";
			}
			result += str.charAt(i);
		}
		
	return result;
}



	private static String getEmtpy(String str) {
		// TODO Auto-generated method stub

//		substring 사용
		
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < alphabet.length(); j++) {
				if (str.substring(i, i + 1).equals(alphabet.substring(j, j + 1))) {
					result += " ";
				}
			}
			result += str.substring(i, i + 1);
		}

		return result;
	}
	
}
