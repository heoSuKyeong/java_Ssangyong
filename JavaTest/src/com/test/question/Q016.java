package com.test.question;

public class Q016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		인자로 받은 숫자들의 합을 구하는 메소드를 선언하시오.
		
		sum(10);
		sum(10, 20);
		sum(10, 20, 30);
		sum(10, 20, 30, 40);
		sum(10, 20, 30, 40, 50);
	}
	
	public static void sum(int num) {
		System.out.printf("%d = %d\n", num, num);
	}
	public static void sum(int num1, int num2) {
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
	}
	public static void sum(int num1, int num2, int num3) {
		System.out.printf("%d + %d + %d = %d\n", num1, num2, num3, num1 + num2+ num3);
	}
	public static void sum(int num1, int num2, int num3, int num4) {
		System.out.printf("%d + %d + %d + %d = %d\n", num1, num2, num3, num4, num1 + num2 + num3+ num4);
	}
	public static void sum(int num1, int num2, int num3, int num4, int num5) {
		System.out.printf("%d + %d + %d + %d + %d = %d\n", num1, num2, num3, num4, num5, num1 + num2 + num3 + num4 + num5);
	}

}
