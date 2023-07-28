package com.test.question;

public class Q072 {

//	아래와 같이 출력하시오.
//
//	출력..
//	1	6	11	16	21
//	2	7	12	17	22
//	3	8	13	18	23
//	4	9	14	19	24
//	5	10	15	20	25
	
	public static void main(String[] args) {
		// 5x5 2차원 배열
		int[][] num = new int[5][5];

		// 데이터 입력
		int n=1;
		
		for(int i=0; i<num.length; i++) {
			for (int j=0; j<num[i].length; j++) {
				num[j][i] = n;	//i와 j의 위치를 바꾸어 세로로 출력
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
