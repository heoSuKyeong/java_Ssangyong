package com.test.question;

public class Q075 {

//	아래와 같이 출력하시오.
//
//	출력..
//	1	2	3	4	10
//	5	6	7	8	26
//	9	10	11	12	42
//	13	14	15	16	58
//	28	32	26	40	136
	
	public static void main(String[] args) {
		
		// 5x5 2차원 배열
		int[][] num = new int[5][5];

		// 데이터 입력
		int n=1;
		
		// 4x4 2차원 공간에 숫자 대입
		for (int i=0; i<num.length-1; i++) {
			for (int j=0; j<num[i].length-1; j++) {
				num[i][j] = n;
				n++;
			}
		}
		
		// 가로의 합
		for (int i=0; i<num.length-1; i++) {
			int sum=0;
			for (int j=0; j<num[i].length-1; j++) {
				sum += num[i][j];
				
			}
			num[i][num.length-1] = sum;
		}
		
		// 세로의 합
		for (int i=0; i<num.length; i++) {
			int sum=0;
			for (int j=0; j<num[i].length; j++) {
				sum += num[j][i];
				
			}
			num[num.length-1][i] = sum;
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
