package com.test.question;

import java.util.Scanner;

public class Q061 {

//	숫자를 5개 입력받아 배열에 담은 뒤 역순으로 출력하시오.
//
//	조건..
//	int[] nums = new int[5];
//	입력..
//	숫자: 5 
//
//	숫자: 1 
//
//	숫자: 7 
//
//	숫자: 2 
//
//	숫자: 3 
//
//	출력..
//	nums[4] = 3
//	nums[3] = 2
//	nums[2] = 7
//	nums[1] = 1
//	nums[0] = 5
	
	public static void main(String[] args) {
		
		//스캐너 생성하기
		Scanner scan = new Scanner(System.in);
		
		//숫자 입력 받기
		int[] nums = new int[5];
		
		for (int i=0; i<nums.length; i++) {
			System.out.print("숫자: ");
			nums[i] = scan.nextInt();
		}
		
		//역순으로 출력하기
		for(int i=nums.length-1; i>=0; i--) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}
		
	}
	
}
