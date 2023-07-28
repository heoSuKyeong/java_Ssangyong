package com.test.question;

public class Q054 {
//2부터 100사이의 소수를 구하시오.
//
//조건..
//소수: 1과 자기자신으로밖에 나눠지지 않는 수
//출력..
//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
	
	public static void main(String[] args) {
		
		for (int i=2; i<=100; i++) {
			if (isprime(i)) {
				System.out.printf("%d, ", i);
			}
		}
	}
	
	private static boolean isprime(int num) {
		for (int i=2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
