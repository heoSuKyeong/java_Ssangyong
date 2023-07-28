package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q067 {
//
//	배열에 요소를 삽입하시오. >> 배열 삽입, Right Shift 구현
//
//	조건..
//	배열 길이: 10
//	마지막 요소는 우측으로 옮겨질 공간이 없으면 삭제된다.
//	입력..
//	삽입 위치: 2 
//
//	값: 100 
//
//	출력..
//	원본: [5, 6, 1, 3, 2, 0, 0, 0, 0, 0]
//	결과: [5, 6, 100, 1, 3, 2, 0, 0, 0, 0]
	
	public static void main(String[] args) {
		
		//변수 생성
		int count = 10;	//배열 길이
		int location=0, value=0;
		int nums[] = new int[count];
		
		//배열에 랜덤생성
		for (int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random()*10);	//0~10 난수 생성하여 배열에 담기
		}
		//원본출력(dump)
		System.out.printf("원본: %s\n", Arrays.toString(nums));
		
		//스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		//입력받기
		System.out.print("삽입 위치: ");
		location = scan.nextInt();
		
		System.out.print("값: ");
		value = scan.nextInt();
		
		//배열 맨마지막-1 인덱스부터 삽입위치까지 우측으로 이동
		for (int i=nums.length-1; i>=location; i--) {	
			nums[i] = nums[i-1];
		}
		
		//삽입 위치에 값 삽입
		nums[location] = value;
		
		//결과출력(dump)
		System.out.printf("결과: %s", Arrays.toString(nums));
		
	}
}
