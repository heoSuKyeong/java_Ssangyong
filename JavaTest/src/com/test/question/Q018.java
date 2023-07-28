package com.test.question;

public class Q018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		인자로 받은 숫자들 중 양수의 갯수를 반환하는 메소드를 선언하시오.
		
		int count = positive(10);
		System.out.printf("양수: %d개\n", count);
		
		count = positive(10, 20);
		System.out.printf("양수: %d개\n", count);
		
		count = positive(10, 20, -30);
		System.out.printf("양수: %d개\n", count);
		
		count = positive(10, 20, -30, 40);
		System.out.printf("양수: %d개\n", count);
		
		count = positive(10, 20, -30, 40, 50);
		System.out.printf("양수: %d개\n", count);
		
		
	}
	
	public static int positive(int num) {
		//양수 누적 계수 count 선언
		int count = 0;
		
		//매개변수 num이 0이상이면 양수 카운트 +1
		count = (num > 0) ? ++count : count;
		
		//양수 누적 계수 반환
		return count;
	}
	public static int positive(int num1, int num2) {
		int count = 0;
		count = (num1 > 0) ? ++count : count;
		count = (num2 > 0) ? ++count : count;
		return count;
	}
	public static int positive(int num1, int num2, int num3) {
		int count = 0;
		count = (num1 > 0) ? ++count : count;
		count = (num2 > 0) ? ++count : count;
		count = (num3 > 0) ? ++count : count;
		return count;
	}
	public static int positive(int num1, int num2, int num3, int num4) {
		int count = 0;
		count = (num1 > 0) ? ++count : count;
		count = (num2 > 0) ? ++count : count;
		count = (num3 > 0) ? ++count : count;
		count = (num4 > 0) ? ++count : count;
		return count;
	}
	public static int positive(int num1, int num2, int num3, int num4, int num5) {
		int count = 0;
		count = (num1 > 0) ? ++count : count;
		count = (num2 > 0) ? ++count : count;
		count = (num3 > 0) ? ++count : count;
		count = (num4 > 0) ? ++count : count;
		count = (num5 > 0) ? ++count : count;
		return count;
	}

}
