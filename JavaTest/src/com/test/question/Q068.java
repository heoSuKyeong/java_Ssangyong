package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q068 {
//
//	배열의 요소를 삭제하시오. >> Left Shift 구현
//
//	조건..
//	배열 길이: 10
//	마지막 요소는 0으로 채우시오.
//	입력..
//	삭제 위치: 2 
//
//	출력..
//	원본: [5, 6, 1, 3, 2, 0, 0, 0, 0, 0]
//	결과: [5, 6, 3, 2, 0, 0, 0, 0, 0, 0]
	
	public static void main(String[] args) {
		
		//변수 생성
		int count = 10;	//배열 길이
		int location=0;
		int nums[] = new int[count];
		
		//배열에 랜덤생성
		for (int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random()*10);	//0~10 난수 생성하여 배열에 담기
		}
		System.out.printf("원본: %s\n", Arrays.toString(nums));
		
		//스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		//입력받기
		System.out.print("삭제 위치: ");
		location = scan.nextInt();
		
		//배열 삭제 위치+1부터 좌측으로 이동
		for (int i=location; i<nums.length-1; i++) {	//삭제 위치부터 배열 마지막-1까지 좌측으로 이동
			nums[i] = nums[i+1];
		}
		nums[count-1] = 0;
		
		//결과출력
		System.out.printf("결과: %s", Arrays.toString(nums));
		
		
	}
}
