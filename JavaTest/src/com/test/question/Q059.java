package com.test.question;

public class Q059 {

//	아래와 같이 출력하시오.
//
//	조건..
//	마지막 숫자가 100이 넘기 전까지 출력하시오.
//	출력..
//	1 + 2 + 4 + 7 + 11 + 16 + 22 + 29 + 37 + 46 + 56 + 67 + 79 + 92 +  = 469
	
	//계차수열
	public static void main(String[] args) {
		
		int sum=0;
		int i=1, num=1;
		while(true) {
			if (i>=100) {
				System.out.printf("= %d", sum);
				break;
			}
			System.out.printf("%d + ", i);
			sum += i;
			i += num;
			num++;
		}
		
	}
}
