package com.test.question;

import java.util.Scanner;

public class Q083 {

//	파일명 10개를 입력받아 각 확장자별로 총 개수를 출력하시오.
//
//	조건..
//	확장자는 다음으로 제한한다.
//	mp3
//	jpg
//	java
//	hwp
//	doc
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String extension[] = {"mp3", "jpg", "java", "hwp", "doc"};
		
		String filename[] = new String[10];
		
		int count[] = new int[extension.length];
		
		//입력받기
		for (int i=0; i<filename.length; i++) {
			System.out.print("파일명: ");
			filename[i] = scan.nextLine();
			
		}
		
		//확장자 별 개수세기
		for (int i=0; i<filename.length; i++) {
			int index = filename[i].lastIndexOf(".");		// "." 마지막 인덱스를 찾아서
			String extension1 = filename[i].substring(index+1);	//확장자를 분리
			for (int j=0; j<extension.length; j++) {		//분리한 확장자가 확장자 배열에 있는지 확인
				if (extension1.equals(extension[j])) {		//있다면, count +1
					count[j] += 1;
				}
			}
		}
		
		//출력하기
		for (int i=0; i<extension.length; i++) {
			System.out.printf("%s: %d개\n", extension[i], count[i]);
		}
		
		
	}
	
	
}
