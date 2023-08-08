package com.test.question.directoryAccess;

import java.io.File;
import java.util.HashMap;

public class Q114 {
	
//	요구사항
//	이미지 파일이 있다. 확장자별로 파일이 몇개 있는지 세시오.
//
//	조건..
//	새로운 확장자 파일이 추가되도 동작이 가능하게 구현하시오.
//	'mouse.bmp' 추가를 하면.. 소스 수정 없이도 *.bmp : 1개 출력이 되게 하시오.
	
	public static void main(String[] args) {
		
		File dir = new File("C:\\class\\code\\java\\JavaTest\\src\\com\\test\\question\\directoryAccess\\파일_디렉토리_문제\\확장자별 카운트");
		
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		
		//폴더 속 파일들을 저장
		File[] list = dir.listFiles();
		
		for (File f : list) {
			//"." 기준으로 분리
			String[] temp = f.getName().split("\\.");
			String extension = temp[temp.length-1];
			
			//확장자가 HashMap에 있다면, 값 +1
			if (count.get(extension)!=null) {
				count.put(extension, count.get(extension)+1);
			} else {
				count.put(extension, 1);
			}
		}
		
		System.out.println(count);
		
	}
}
