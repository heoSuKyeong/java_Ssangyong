package com.test.question;

public class Q071 {
	
//	아래와 같이 출력하시오.
//
//	출력..
//	25	24	23	22	21
//	20	19	18	17	16
//	15	14	13	12	11
//	10	9	8	7	6
//	5	4	3	2	1
//	
	public static void main(String[] args) {
		// 5x5 2차원 배열
		int[][] num = new int[5][5];

		// 데이터 입력
		int n=25;
		
		for(int i=0; i<num.length; i++) {
			for (int j=0; j<num[i].length; j++) {
				num[i][j] = n;
				n--;
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
