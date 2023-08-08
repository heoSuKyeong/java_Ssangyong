package com.test.question.directoryAccess;

import java.io.File;

public class Q119 {
	
//	아래의 조건에 따라 파일을 폴더별로 분류/이동하시오.
//
//	조건..
//	1차: 직원 이름으로 폴더 생성
//	2차: 년도별로 폴더 생성
//	3차: 각 파일을 직원 > 년도 폴더에 이동
	
	public static void main(String[] args) {
		
		String path = "C:\\class\\code\\java\\JavaTest\\src\\com\\test\\question\\directoryAccess\\파일_디렉토리_문제\\직원";
		
		File dir = new File(path);
		
		File[] list = dir.listFiles();
		
		for (File f : list) {
			
			//파일명 분류하기
			String[] temp = f.getName().split("_");
			String name = temp[0];
			String year = temp[1];
			
			//이름과 년도별 폴더명으로 경로 지정
			path = dir.getAbsolutePath() + "\\" + name + "\\" + year;
			
			File newFile = new File(path);
			newFile.mkdirs();	//폴더 만들기
			
			//파일 이동을 위한 폴더명+파일명
			path = path + "\\" + f.getName();
			
			File file = new File(path);
			f.renameTo(file);	//파일 이동
			
		}
		
		System.out.println("분류가 완료되었습니다.");
		
	}
}
