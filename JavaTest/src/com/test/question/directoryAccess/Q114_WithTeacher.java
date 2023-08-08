package com.test.question.directoryAccess;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;

public class Q114_WithTeacher {
	
	//요구사항
	//이미지 파일이 있다. 확장자별로 파일이 몇개 있는지 세시오.
	
	public static void main(String[] args) {
		
		//목록
		File dir = new File("C:\\class\\code\\java\\JavaTest\\src\\com\\test\\question\\directoryAccess\\파일_디렉토리_문제\\확장자별 카운트");
		
		File[] list = dir.listFiles();
		
		//key > 확장자
		//value > 카운트
		HashMap<String,Integer> count = new HashMap<String,Integer>();
		
		for (File f : list) {
			//System.out.println(f.getName());
			String ext = getExtension(f.getName());
			
			if (!count.containsKey(ext)) {
				count.put(ext, 1);		//새로운 확장자 등록
			} else {
				count.put(ext, count.get(ext)+1);	//이미 등록된 확장자이면 value++
				
			}
			
		}
		
		System.out.println(count);
		
		
	}

	private static String getExtension(String name) {
		
		//test.png > 확장자만 분리하는 메소드
		
		String[] temp = name.split("\\.");	//이스케이프화 시켜야 한다.
		String ext = temp[temp.length-1].toLowerCase();

		//System.out.println(Arrays.toString(temp));
		//System.out.println(ext);
		
		return ext;
	}
}
