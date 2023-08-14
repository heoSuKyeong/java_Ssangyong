package com.test.java.data;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		/*		
		성적 관리 프로그램
		
		파일
		- Main : 전체 컨트롤
		- View : 출력 담당
		- Data : 데이터 담당 / student.txt 담당 및 입출력
		- Student : 학생 1명의 정보를 담을 상자 역할
		- service : 각 업무 담당
		
		데이터 파일
		- student.txt
				
		*/		
		
		Data.load();
		//System.out.println(Data.list);
		
		Scanner scan = new Scanner(System.in);
		
		boolean loop = true;
		
		while(loop) {
			
			View.mainMenu();
			
			String sel = scan.nextLine();
			
			//분기 처리
			if (sel.equals("1")) {
				//하위 클래스로 업무 분담
				Service.add();
				
			} else if(sel.equals("2")) {
				
				Service.list();
				
			} else if(sel.equals("3")) {
				
				Service.delete();
				
			} else {
				loop=false;
			}
			
			
		}
		System.out.println("종료되었습니다.");
		
		Data.save();
		
		
	}
}
