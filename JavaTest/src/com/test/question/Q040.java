package com.test.question;

import java.util.Scanner;

public class Q040 {

//	아래와 같이 출력하시오.
//
//	입력..
//	시작 숫자: 1 
//
//	종료 숫자: 10 
//
//	출력..
//	1 - 2 + 3 - 4 + 5 - 6 + 7 - 8 + 9 - 10 = -5
	
	public static void main(String[] args) {
		
		//스캐너 작성하기
		Scanner scan = new Scanner(System.in);
		
		//안내문 출력 및 입력값 변수로 저장
		int start=0, end=0;
		
		System.out.print("시작 숫자: ");
		start = scan.nextInt();
		System.out.print("종료 숫자: ");
		end = scan.nextInt();
		
		//홀수번째는 더하기, 짝수번째는 빼기 연산
		int sum=0;
		for (int i=start, j=1; i<=end; i++, j++) {
			//i가 마지막번째이고, 홀수번째이면 sum에서 i를 더하고, 짝수번째이면 sum에서 i를뺀다.
			//그리고 '='와 누적합(sum)을 출력한다.
			if(i == end) {
				sum = (j%2==0) ? sum-i : sum+i;
				System.out.printf("%d = %d", i, sum);
			} else {
				System.out.print(i);
				if(j % 2 == 0) {
					sum -= i;
					System.out.print(" + ");
				} else {
					sum += i;
					System.out.print(" - ");
				}
			}
			
		}
	}
	
	
}
