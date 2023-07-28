package com.test.question;

public class Q058 {

//	아래와 같이 출력하시오.
//
//	출력..
//	 1 ~  10:  55
//	11 ~  20: 155
//	21 ~  30: 255
//	31 ~  40: 355
//	41 ~  50: 455
//	51 ~  60: 555
//	61 ~  70: 655
//	71 ~  80: 755
//	81 ~  90: 855
//	91 ~ 100: 955
	
	public static void main(String[] args) {
		int sum=0;
		for (int i=1; i<=100; i++) {
			sum += i;
			//10단위마다 출력
			if (i%10==0) {
				System.out.printf("%2d ~ %3d: %3d\n", i-9, i, sum);
				sum=0;
//				System.out.println();
			}
		}
		
	}
}
