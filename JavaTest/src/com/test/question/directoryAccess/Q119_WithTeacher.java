package com.test.question.directoryAccess;

import java.io.File;

public class Q119_WithTeacher {
	
//	요구사항
//	아래의 조건에 따라 파일을 폴더별로 분류/이동하시오.
//	
//	조건..
//	1차: 직원 이름으로 폴더 생성
//	2차: 년도별로 폴더 생성
//	3차: 각 파일을 직원 > 년도 폴더에 이동
	
	public static void main(String[] args) {
		
		File dir = new File("C:\\class\\code\\java\\JavaTest\\src\\com\\test\\question\\directoryAccess\\파일_디렉토리_문제\\직원");
		
		File[] list = dir.listFiles();
		
		for (File f : list) {
			
			//아무게_2014__17.txt
			//아무게_2016_11.txt
			
			String[] temp = f.getName().split("_");
			
			String name = temp[0];
			String year = temp[1];
			
			//폴더 생성
			File nameDir = new File(dir.getAbsolutePath()+"\\"+name);
			nameDir.mkdir();
			
			File yearDir = new File(dir.getAbsolutePath()+"\\"+name+"\\"+year);
			yearDir.mkdir();
			
			//파일 이동
			File dest = new File(dir.getAbsolutePath()+"\\"+name+"\\"+year+"\\"+f.getName());
			
			f.renameTo(dest);
			
		}
		System.out.println("분류가 완료되었습니다.");
		
		
	}
}
