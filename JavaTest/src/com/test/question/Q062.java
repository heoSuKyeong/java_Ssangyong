package com.test.question;

import java.util.Scanner;

public class Q062 {
//	
//	이름을 오름차순 정렬하시오.
	
//	입력..
//	학생 수: 6 
//	학생명: 홍길동 
//	학생명: 아무개 
//	학생명: 하하하 
//	학생명: 호호호 
//	학생명: 후후후 
//	학생명: 헤헤헤 
//
//	출력..
//	입력한 학생은 총 6명입니다.
//	1. 아무개
//	2. 하하하
//	3. 헤헤헤
//	4. 호호호
//	5. 홍길동
//	6. 후후후
	
	public static void main(String[] args) {
		
		//스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		//변수생성
		int num =0;	//학생 수
		
		//입력받기
		System.out.print("학생 수: ");
		num = scan.nextInt();
		scan.nextLine();
		
		String name[] = new String[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("학생명: ");
			name[i] = scan.nextLine();
		}
		
		System.out.printf("입력한 학생은 총 %d명입니다.\n", num);
		for(int i=0; i<num; i++) {
			System.out.printf("%d. %s\n", i+1, name[i]);
		}
	}
	
	
}
