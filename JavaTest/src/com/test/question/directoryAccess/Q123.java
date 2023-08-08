package com.test.question.directoryAccess;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q123 {
	
//	이름을 입력받아 회원 정보를 검색 후 출력하시오.
//	
//	입력..
//	이름: 홍길동 
//
//	출력..
//	[홍길동] 
//	번호: 33 
//	주소: 서울시 강남구 역삼동 
//	전화: 010-2345-6789 
	
	public static void main(String[] args) {
		
		try {
			
			String path = "C:\\class\\code\\java\\file\\파일_입출력_문제";
			BufferedReader breader = new BufferedReader(new FileReader(path + "\\단일검색.dat"));
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("이름: ");
			String findName = scan.nextLine();
			
			boolean find = false;
			
			String line = null;
			while((line = breader.readLine())!= null) {
				
				String[] temp = line.split(",");
				
				String num = temp[0];
				String name = temp[1];
				String address = temp[2];
				String phone = temp[3];
				
				if (name.equals(findName)) {
					System.out.printf("[%s]\n", findName);
					System.out.printf("번호: %s\n", num);
					System.out.printf("주소: %s\n", address);
					System.out.printf("전화: %s\n", phone);
					find = true;
					break;
				}
			}
			if (!find) {
				System.out.printf("%s님은 없습니다.", findName);
			}
			breader.close();
			
		} catch (Exception e) {
			System.out.println("at Q123.main");
			e.printStackTrace();
		}
		
		
	}
}
