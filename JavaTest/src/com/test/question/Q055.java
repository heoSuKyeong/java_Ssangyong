package com.test.question;

public class Q055 {

 //	1부터 100사이의 완전수를 구하시오.
//
//	조건..
//	완전수: 자기 자신을 제외한 나머지 약수들의 합이 자신과 동일한 수
//	약수: 어떤 수나 식을 나누어 나머지가 없이 떨어지는 수
//	출력..
//	6 = [1, 2, 3,]
//	28 = [1, 2, 4, 7, 14,]
	
	//약수를 담는 변수
	static String divisor="";
	
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if (isPerfecNumber(i)) {
				System.out.printf("%d = [", i);
				System.out.printf("%s", divisor);
				System.out.printf("]\n");
			}
		}
	}

	private static boolean isPerfecNumber(int num) {
		// TODO Auto-generated method stub
		divisor = "";
		int sum=0;
		for (int i=1; i<=(num/2); i++) {
			//1~num까지의 약수들의 합을 구함.
			if (isDivisor(num, i)) {
				sum += i;
				divisor = divisor + i + ", ";
			}
		}
		//약수의 합과 num이 같다면, 완전수로 판단(true)
		if (sum == num) {
			return true;
		}		
		return false;
	}
	
	//약수인지 판단하는 메소드
	private static boolean isDivisor(int num, int i) {
		return num%i==0;
	}
}
