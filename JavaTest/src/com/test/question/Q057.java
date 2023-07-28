package com.test.question;

public class Q057 {
//
//	아래와 같이 출력하시오.
//
//	출력..
//	1 ~  10:   55
//	1 ~  20:  210
//	1 ~  30:  465
//	1 ~  40:  820
//	1 ~  50: 1275
//	1 ~  60: 1830
//	1 ~  70: 2485
//	1 ~  80: 3240
//	1 ~  90: 4095
//	1 ~ 100: 5050
	
	public static void main(String[] args) {
		
		//1 ~ i
		for (int i=10; i<=100; i+=10) {
			int sum=0;
			//1 ~ i 의 합계
			for (int j=1; j<=i; j++) {
				sum += j;
			}
			System.out.printf("1 ~ %3d: %5d\n", i, sum);
		}
	}
}
