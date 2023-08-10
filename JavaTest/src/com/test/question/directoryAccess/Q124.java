package com.test.question.directoryAccess;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q124 {
	
	//이름을 입력받아 회원 주문 정보를 검색 후 출력하시오.
	
	public static void main(String[] args) {
		
		try {
			
			String path = "C:\\class\\code\\java\\file\\파일_입출력_문제";
			
			BufferedReader memberReader = new BufferedReader(new FileReader(path + "\\검색_회원.dat"));
			BufferedReader orderReader = new BufferedReader(new FileReader(path + "\\검색_주문.dat"));
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("이름: ");
			String searchName = scan.nextLine();
			
			boolean frag = false;	//회원 내역
			
			//1. 회원 파일에서 , 기준으로 분리
			String line = null;
			while((line=memberReader.readLine())!=null) {
				String temp[] = line.split(",");
				
				String memberNum = temp[0];
				String name = temp[1];
				String address = temp[2];
				
				//2. 사용자가 입력한 값이 회원 파일에 있는지 검사
				//3. 있다면, 주문 파일에서 "," 기준으로 분리
				if (name.equals(searchName)) {
					frag = true;	//회원 내역에 있음.
					System.out.println("==== 구매내역 ====");
					System.out.println("[번호]\t[이름]\t[상품명]\t[개수]\t[배송지]");
					
					String line2 = null;
					while((line2=orderReader.readLine())!=null) {
						String temp2[] = line2.split(",");
						
						String product = temp2[1];
						String sales = temp2[2];
						String num = temp2[3];
						
						//4. 분리한 맨 마지막 회원 번호로 상품명, 개수 가져오기
						if (num.equals(memberNum)) {
							System.out.printf("%s\t%s\t%s\t%s\t%s\n", memberNum, name, product, sales, address);
						}
					}
				}
			
			}
			
			memberReader.close();
			orderReader.close();
			
			System.out.println();
			if (!frag) {
				System.out.println("회원 정보가 없습니다.");
			} else {
				System.out.println("검색 완료");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
