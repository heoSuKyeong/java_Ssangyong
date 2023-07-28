package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q069 {

//	배열의 요소를 순차적으로 2개씩 더한 결과를 배열로 생성한 뒤 출력하시오.
//
//	조건..
//	원본 배열 길이: 사용자 입력
//	원본 배열 요소: 난수(1~9)
//	결과 배열 길이: 사용자 입력 / 2
//	입력..
//	배열 길이: 10 
//
//	출력..
//	원본: [ 1, 5, 3, 6, 2, 7, 8, 2, 2, 9 ]
//	결과: [ 6, 9, 9, 10, 11 ]
	
	public static void main(String[] args) {
		
		//변수 생성
		int count=0;
		int nums[];			//원본
		int changeNums[];	//결과
		int changeLength=0;
		//스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		//입력받기
		System.out.print("배열 길이: ");
		count = scan.nextInt();
		
		nums = new int[count];
		
		changeLength = (count%2==0)? count/2 : (count/2)+1;		//원본 길이가 짝수이면 길이/2, 홀수이면 (길이/2)+1
		
		changeNums = new int[changeLength];

		
		//원본배열에 난수 생성하여 대입
		System.out.print("원본: ");
		
		for (int i=0; i<nums.length; i++) {
			nums[i] = (int)((Math.random()*10)%9)+1;	//1~9 난수 생성하여 배열에 담기
		}
		System.out.println(Arrays.toString(nums));		//원본 출력
		
		
		//결과 배열 길이: 사용자 입력 / 2
		for (int i=0,j=0; i<changeNums.length; i++) {
			if (j>=nums.length-1) {		//원본배열 길이가 홀수라서, 마지막번째에 도달하면 그냥 출력
				changeNums[i] = nums[j];
				break;
			}
			changeNums[i] = nums[j] + nums[j+1];
			j += 2;
		}
		
		System.out.println(Arrays.toString(changeNums));	//결과 출력
		
	}
}
