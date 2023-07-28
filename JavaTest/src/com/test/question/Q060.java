package com.test.question;

public class Q060 {

//	아래와 같이 출력하시오.
//
//	조건..
//	마지막 숫자가 100이 넘기 전까지 출력하시오.
//	출력..
//	1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 + 55 + 89 +  = 232
	
	//피보나치 수열(Fibonacci numbers) : 첫째 및 둘째 항이 1이며 그 뒤의 모든 항은 바로 앞 두 항의 합인 수열
	
	public static void main(String[] args) {
		
		int present=1	//현재의 값
				, previous=0	//이전의 값
				, temp=0	//임시공간
				, sum=0;	//피보나치 수열의 합
		
		while(true) {
			if(present>=100) {
				System.out.printf(" = %d", sum);
				break;
			}
			System.out.printf("%d + ", present);
			
			sum += present;
			
			temp = present;					//임시 공간에 현재의 수 저장
			
			
			present = present + previous;	//새로운 현재는 현재 + 이전의 값
			previous = temp;				//이전의 값은 새로운 현재가 아닌 임시 공간에 저장해둔 현재의 값 대입
			
		}
		
	}
}
