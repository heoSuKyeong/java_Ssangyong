package com.test.question;

public class Q041 {

//	아래와 같이 출력하시오.
//
//	조건..
//	누적값이 1000을 넘어가는 순간 루프를 종료하시오.
	
	public static void main(String[] args) {
		
		int sum=0;
		for (int i=1; sum<1000; i++) {
			System.out.printf("%d", i);
			sum += i;
			if(sum<1000) {
				System.out.print(" + ");
			}
		}
		//sum이 1000이상으로 탈출하였으므로 sum출력
		System.out.printf(" = %d", sum);
		
	}
}
