package com.test.question;

public class Q074 {
//모르겟다
	//다이아몬드 출력
	//중간을 기준으로 위, 아래 나눠 대입
//	아래와 같이 출력하시오.
//
//	출력..
//	0	0	1	0	0
//	0	2	3	4	0
//	5	6	7	8	9
//	0	10	11	12	0
//	0	0	13	0	0

	public static void main(String[] args) {
//		0,2 : num-4
//		1,1 : num-2
//		2,0 : num
//
//		3,1 : num-2
//		4,2 : num-4
		
		
		// 5x5 2차원 배열
		int[][] num = new int[5][5];

		// 데이터 입력
		int n=1;
		
		int len = num.length;
		int middleValue = len/2;
		
		
		//0행~중간행(num.length/2)
		for (int i=0; i<=middleValue; i++) {
			for(int j=middleValue-i; j<=len-j*2; j++) {		//중간위치부터 프린트
				int end = len-j*2;
				num[i][j] = n;
				n++;
			}
		}
		
		for (int i=middleValue+1; i<len; i++) {
			for (int j=1; j<=len-j*2; j++) {
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
