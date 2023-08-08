package com.test.question.directoryAccess;

import java.io.File;

public class Q117 {
	
//	요구사항
//	내용물이 있는 'delete' 폴더를 삭제하시오.
//
//	조건..
//	재귀 메소드 사용
//	삭제된 파일과 자식 폴더 개수를 출력하시오.
	
	public static int fcount=0;
	public static int dcount=0;
	
	public static void main(String[] args) {
		
		String path = "C:\\class\\code\\java\\JavaTest\\src\\com\\test\\question\\directoryAccess\\파일_디렉토리_문제\\폴더 삭제\\delete";
		
		File dir = new File(path);
		
		delete(dir);
		
		System.out.println("폴더를 삭제했습니다.");
		System.out.printf("삭제된 폴더는 %d개이고, 파일은 %d개입니다.", dcount, fcount);
		
	}

	private static void delete(File dir) {
		
		File[] list = dir.listFiles();
		
		for (File file : list) {
			if (file.isFile()) {
				file.delete();
				fcount++;
			}
		}
		
		for (File d : list) {
			if (d.isDirectory()) {
				delete(d);
			}
		}
		dir.delete();
		dcount++;
	}
}
