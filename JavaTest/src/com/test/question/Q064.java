package com.test.question;

import java.util.Arrays;

public class Q064 {
	
//	1~20 사이의 난수를 담고 있는 배열을 생성하고 최댓값과 최솟값을 출력하시오.
//
//	조건..
//	난수를 20개 발생 후 배열에 넣는다.
//	난수는 1 ~ 20 사이
//	출력..
//	원본: 10, 9, 3, 18, 15, 9, 5, 4, 3, 11, 15, 18, 9, 14, 18, 5, 8, 7, 9, 17,
//	최댓값: 18
//	최솟값: 3
	
	public static void main(String[] args) {
		
		//변수 생성
		int randomNum[] = new int[20];	//원본
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		System.out.print("원본: ");
		
		//난수 생성 및 출력
		for (int i=0; i<randomNum.length; i++) {
			randomNum[i] = (int)(Math.random()*20)+1;	//난수 배열에 담기
			System.out.print(randomNum[i] + ", ");		//난수, 하나씩 출력
			max = Math.max(max, randomNum[i]);
//			max = (randomNum[i]>max) ? randomNum[i] : max;
			min = Math.min(min, randomNum[i]);
//			min = (randomNum[i]<min) ? randomNum[i] : min;
		}
		System.out.println();
		System.out.printf("최댓값: %d\n", max);
		System.out.printf("최솟값: %d\n", min);
	}

}
