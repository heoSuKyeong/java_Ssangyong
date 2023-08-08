package com.test.question.directoryAccess;

import java.io.File;

public class Q115 {

//	요구사항
//	파일의 크기가 0byte인 파일만 삭제하시오.
	
	public static void main(String[] args) {
		
		File dir = new File("C:\\class\\code\\java\\JavaTest\\src\\com\\test\\question\\directoryAccess\\파일_디렉토리_문제\\파일 제거");
		
		File[] list = dir.listFiles();
		
		int fcount=0;
		
		for (File f : list) {
			if (f.length() <=0) {
				f.delete();
				fcount++;
			}
		}
		
		System.out.printf("총 %d개의 파일을 삭제했습니다.", fcount);
	}
	
}
