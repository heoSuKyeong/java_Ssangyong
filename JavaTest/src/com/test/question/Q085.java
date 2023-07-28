package com.test.question;

import java.util.Scanner;

public class Q085 {
//	
//	주민 등록 번호 유효성 검사를 하시오.
//
//	조건..
//	'-'의 입력 유무 상관없이 검사하시오.
//	입력..
//	주민등록번호: 951220-1234567 
//
//	출력..
//	올바르지 않은 주민등록번호입니다.
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String jumin = "";
		
		System.out.print("주민등록번호 : ");
		jumin = scan.nextLine();

		if (isValidation(jumin)) {
			System.out.println("올바른 주민등록번호입니다.");
		} else {
			
			System.out.println("올바르지 않은 주민등록번호입니다.");
		}
		
//		int month = Integer.valueOf(jumin.substring(2,4));
//		System.out.println(month);
	}

private static boolean isValidation(String jumin) {
	// TODO Auto-generated method stub
	
	//1. 월일 유효성
	int month = Integer.valueOf(jumin.substring(2,4));
	int day = Integer.valueOf(jumin.substring(4,6));
	if(month<1 || month >12 || day<1 || day>31) {
		return false;
	}
	
	/*
	//2. 성별코드 유효성
		//성별(홀수>남자, 짝수>여자) : (1900년대생)1,2 / (2000년대생)3,4 / (1800년대생)9,0 / (외국인 귀화)5,6,7,8
	int year = Integer.valueOf(jumin.substring(0,2));
	int sexCode = Integer.valueOf(jumin.substring(8,9));
	if(sexCode==1 && (year)
	*/
	
	//유효성 검사 공식
	int[] checkAry = {2,3,4,5,6,7,0,8,9,2,3,4,5,6};
//	int[] checkIndex = {0,3,5,7,9};
	
	int sum=0;
	for(int i=0; i<jumin.length()-1; i++) {
		if (i==6) {		//'-'는 패스
			continue;
		}
		int value = Integer.valueOf(jumin.substring(i,i+1));
//		int check = checkAry[checkIndex[i]];
		sum += (value * checkAry[i]);
	}
	sum %= 11;
	int verification = 11 - sum;
	
	if (verification > 10 ) {	//10은 0으로, 11은 1로 만들어줌
		verification %= verification;
	}
	
	int lastNum = Integer.valueOf(jumin.substring(jumin.length()-1));
	if(verification == lastNum) {
		return true;
	}
	
	return false;
	
}

}
