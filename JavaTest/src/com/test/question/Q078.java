package com.test.question;

public class Q078 {
// 회오리 모양으로 +1
	
//	아래와 같이 출력하시오.
//
//	출력..
//	1	2	3	4	5
//	16	17	18	19	6
//	15	24	25	20	7
//	14	23	22	21	8
//	13	12	11	10	9
	
	public static void main(String[] args) {
		
		// 5x5 2차원 배열
		int[][] num = new int[5][5];

		// 데이터 입력
		int n=1;
		
		//변수 생성
		int len = num.length;
		
		for (int i=0; i<len; i++) {	//반복 횟수
			for (int j=0; j<Math.ceil(len); j++) {
				
			}
			
		}
		
		
		
		
//		for (int i=0; i<5; i++) {
//			if (i%2 == 0) {								//ㄱ
//				int j=0;
//				for (j=i; j<num.length-i; j++) {
//					num[i][j] = n;
//					n++;
//				}
//				if (j>=num.length-1-i) {
//					for(int k=i+1; k<num.length-i; k++) {
//						num[k][j-1] = n;
//						n++;
//					}
//				}
//				
//			} else {								//ㄴ
//				int index = num.length-i;
//				int j=0;
//				for (j=num.length-i-1; j>=i-1; j--) {
//					num[num.length-i][j] = n;
//					n++;
//				}
//				for (int k=num.length-i-1; k>=i; k--) {
//					num[k][j+1] = n;
//					n++;
//				}
//			}
//			
//		}
		
		
		
		//결과 출력
		for (int i=0; i<num.length; i++) {
			for (int j=0; j<num.length; j++) {
				System.out.printf("%5d", num[i][j]);
			}
			System.out.println();
		}
		
	}
	
}
