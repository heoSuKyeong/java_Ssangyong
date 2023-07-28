package com.test.question;

public class Q073 {
//
//	아래와 같이 출력하시오.
//
//	출력..
//	1	2	3	4	5
//	6	7	8	9	0
//	10	11	12	0	0
//	13	14	0	0	0
//	15	0	0	0	0

	
	public static void main(String[] args) {
		
		// 5x5 2차원 배열
		int[][] num = new int[5][5];

		// 데이터 입력
		int n=1;
		
		for(int i=0; i<num.length; i++) {
			for (int j=0; j<num[i].length-i; j++) {		//i 증가하는만큼 j 감소
				num[i][j] = n;
				n++;
			}
		}
		
		//결과 출력
		for (int i=0; i<num.length; i++) {
			for (int j=0; j<num.length; j++) {
				System.out.printf("%5d", num[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
}
