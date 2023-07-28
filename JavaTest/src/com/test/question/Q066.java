package com.test.question;

import java.util.Arrays;

public class Q066 {

//	중복되지 않는 임의의 숫자 6개를 만드시오.(로또)
//
//	조건..
//	숫자의 범위: 1 ~ 45
//	오름차순 정렬
//	출력..
//	[1, 5, 23, 36, 37, 41]
	
	public static void main(String[] args) {
		
		//변수 생성
		int lotto[] = new int[6];
		
		//로또 번호 생성
		for (int i=0; i<lotto.length; i++) {
			int n = (int)(Math.random()*45) + 1;
			if (isDuplication(lotto, n)) {		//중복여부를 체크 
				i--;	//다시 해당 위치를 돌아야함
			} else {
				lotto[i] = n;	//중복이 아닌 숫자라면 lotto 배열에 추가
			}
		}
		Arrays.sort(lotto);		//오름차순 정렬	
		
		//결과 출력
		System.out.println(Arrays.toString(lotto));
		
	}

	private static boolean isDuplication(int[] lotto, int num) {
		// 난수의 중복여부를 체크
		for(int i=0; i<lotto.length; i++) {
			if (lotto[i] == num) {
				return true;
			}
		}
		return false;
	}


}
