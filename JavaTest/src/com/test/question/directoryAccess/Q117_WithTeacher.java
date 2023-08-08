package com.test.question.directoryAccess;

import java.io.File;

public class Q117_WithTeacher {
	public static int dcount =0;
	public static int fcount =0;
	
	//요구사항
	//내용물이 있는 'delete' 폴더를 삭제하시오.
	
	
	public static void main(String[] args) {
		
		File dir = new File("C:\\class\\code\\java\\JavaTest\\src\\com\\test\\question\\directoryAccess\\파일_디렉토리_문제\\폴더 삭제\\delete");
		
		//탐색
		delete(dir);
		
		System.out.println("폴더를 삭제했습니다."); 
		System.out.printf("삭제된 폴더는 %d개이고, 파일은 %d개입니다.", fcount, dcount);
	}

	private static void delete(File dir) {

		File[] list = dir.listFiles();
		
		for (File f : list) {
			if (f.isFile()) {
				f.delete();
				fcount++;
			}
		}
		
		for (File d : list) {
			if (d.isDirectory()) {
				delete(d);
				dcount++;
			}
		}
		dir.delete();
		
	}
}
