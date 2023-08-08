package com.test.question.directoryAccess;

import java.io.File;

public class Q113 {
	
//	음악 파일이 100개 있다. 파일명 앞에 일련 번호를 붙이시오.
//
//	조건..
//	'001'부터 3자리 형식으로 붙이시오.
	
	public static void main(String[] args) {
		
		File dir = new File("C:\\class\\code\\java\\JavaTest\\src\\com\\test\\question\\directoryAccess\\파일_디렉토리_문제\\음악 파일\\Music");
		
		File[] list = dir.listFiles();
		
		int num = 1;
		
		for (File f : list) {
			if (f.isFile()) {
				
				String path = String.format("[%03d]%s", num, f.getName());
				
				File file = new File(dir.getAbsolutePath() + "\\" + path);
				
				f.renameTo(file);
				
				num++;
				
				System.out.println(f.getName());
			}
		}
		
	}
}
