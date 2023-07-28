package com.test.question;

public class Q077 {

	//배열 인덱스가 적어가면서 규칙 찾기
//	아래와 같이 출력하시오.
//
//	출력..
//	1	2	4	7	11
//	3	5	8	12	16
//	6	9	13	17	20
//	10	14	18	21	23
//	15	19	22	24	25
	
	public static void main(String[] args) {
		
		// 5x5 2차원 배열
		int[][] num = new int[5][5];

		// 데이터 입력
		int n=1;
		
		//사선으로 배열 담기(왼쪽)
		for (int i=0; i<num.length; i++) {			//행 : 0부터 4까지 증가
			for (int k=0, l=i; k<=i; k++, l--) {	//열 : i부터 시작하여 0까지 감소
				num[k][l]=n;
				n++;
			}
		}
		
		//사선으로 배열 담기(오른쪽)
		for (int i=1; i<num.length; i++) {			//나머지 4번 반복
			for (int k=i, l=num.length-1; k<num.length; k++, l--) {	//
				num[k][l]=n;
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
