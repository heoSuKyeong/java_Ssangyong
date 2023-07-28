package com.test.question;

import java.util.Scanner;

public class Q065 {

//	난수를 담고 있는 배열을 생성한 뒤 아래와 같이 출력하시오.
//
//	조건..
//	난수를 20개 발생 후 배열에 넣는다.
//	난수는 1 ~ 20 사이
//	배열을 탐색하여 범위에 만족하는 숫자만 출력한다.
//	입력..
//	최대 범위: 15 
//
//	최소 범위: 5 
	public static void main(String[] args) {
		
		//변수 생성
		int count = 20; //난수 생성할 갯수
		int randomNum[] = new int[count];
		int maxRange=0, minRange=0;
		
		
		//스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		//입력 받기
		System.out.print("최대 범위: ");
		maxRange = scan.nextInt();
		
		System.out.print("최소 범위: ");
		minRange = scan.nextInt();
		
		//난수 생성 및 출력
		System.out.print("원본: ");
		
		for (int i=0; i<randomNum.length; i++) {
			randomNum[i] = (int)(Math.random()*count)+1;	//1~20 난수 생성하여 배열에 담기
			System.out.print(randomNum[i]);		//난수 하나씩 출력
			if (i<randomNum.length-1) {
				System.out.print(", ");
			}
		}
		
		//최대, 최소 범위내 값 출력
		System.out.print("\n결과: ");
		for (int i=0; i<randomNum.length; i++) {
			if (randomNum[i]>=minRange && randomNum[i]<=maxRange) {		//i번째 요소가 min보다 같거나 작고, max보다 같거나 작으면 출력
				System.out.print(randomNum[i]);		//난수 하나씩 출력
				if (i<randomNum.length-1) {
					System.out.print(", ");
				}
			}
		}
		
	}
}
