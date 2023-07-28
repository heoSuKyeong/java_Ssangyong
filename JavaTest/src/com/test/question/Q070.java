package com.test.question;

public class Q070 {

//	아래와 같이 출력하시오.
//
//	출력..
//	1	2	3	4	5
//	10	9	8	7	6
//	11	12	13	14	15
//	20	19	18	17	16
//	21	22	23	24	25
	
	
	public static void main(String[] args) {
		//5x5 2차원 배열
		int[][] num = new int[5][5];
		
		//데이터 입력
		int n=1;
		
		for (int i=0; i<num.length; i++) {
			//짝수 번째 행은 순서대로 대입
			if (i%2==0) {
				for (int j=0; j<num[i].length; j++) {
					num[i][j] = n;
					n++;
				}
			//홀수 번째 행은 역순으로 대입
			} else {
				for (int j=num[i].length-1; j>=0; j--) {
					num[i][j] = n;
					n++;
				}
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
