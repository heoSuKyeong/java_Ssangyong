package com.test.question.directoryAccess;

import java.io.File;
import java.util.Scanner;
public class Q111 {
	
//	지정한 폴더의 특정 파일(확장자)만을 출력하시오.
//
//	조건..
//	확장자 대소문자 구분없이 검색 가능
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("폴더: ");
//		String path = scan.nextLine();
//		System.out.print("확장자: ");
//		String extension = scan.nextLine().toLowerCase();
//		
		String path = "C:\\class\\code\\java\\JavaTest\\src\\com\\test\\question\\directoryAccess\\파일_디렉토리_문제\\확장자별 카운트";
		String extension = "jpg";
		
		File dir = new File(path);
		
		File[] list = dir.listFiles();
		if (dir.exists()) {
			
			for (File f : list) {
				if (f.isFile()) {
					String a = f.getName().substring(f.getName().lastIndexOf(".")+1).toLowerCase();
					if (a.equals(extension)) {
						System.out.println(f.getName());
					}
				}
			}
			
		}
		
	}
}
