package com.test.question;

import java.util.Scanner;

public class Q045_TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("최대 숫자: ");
		max = scan.nextInt();
		
		if(max<1000) {
			for (int i=1; i<=max; i++) {
				System.out.print(checkClap(i)+" ");
			}
			System.out.println();
		} else {
			System.out.println("1000");
		}
	}

	private static String checkClap(int i) {
		// TODO Auto-generated method stub
		String temp ="";
		int n=i;
		
		for (;n>0;) {
			if(n%10%3==0 && n%10!=0) {
				temp+="짝";
			}
			n/=10;
		}
		if(temp.equals("")) {
			return i+"";
		}else {
			return temp;
		}
		
		
	}
	
	

}
