package com.test.question;

import java.util.Arrays;

public class Q063 {

//	int 배열을 매개변수로 받아 내용을 문자열로 반환하는 dump 메소드를 구현하시오.
//
//	조건..
//	String dump(int[] list)
	
	public static void main(String[] args) {
		int[] list = new int[4];

		list[0] = 10;
		list[1] = 20;
		list[2] = 30;
		list[3] = 40;
		
		String result = dump(list);
		System.out.printf("nums = %s\n", result);
	}

	private static String dump(int[] list) {
		String result = "";
		result = Arrays.toString(list);	//문자열 반환
		return result;
	}
	
	
}
