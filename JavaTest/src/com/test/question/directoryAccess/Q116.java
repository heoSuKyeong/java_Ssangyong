package com.test.question.directoryAccess;

import java.io.File;

public class Q116 {
	
//	MusicA 폴더와 MusicB 폴더를 서로 비교해서 양쪽 폴더에 모두 존재하는 파일만을 출력하시오.
//
//	조건..
//	중복 파일을 찾아내시오.
	
	public static void main(String[] args) {
		
		String path = "C:\\class\\code\\java\\JavaTest\\src\\com\\test\\question\\directoryAccess\\파일_디렉토리_문제\\동일 파일\\MusicA";
		File dirA = new File(path);

		path = "C:\\class\\code\\java\\JavaTest\\src\\com\\test\\question\\directoryAccess\\파일_디렉토리_문제\\동일 파일\\MusicB";
		File dirB = new File(path);
		
		File[] listA = dirA.listFiles();
		File[] listB = dirB.listFiles();
		
		for (File file : listA) {
			for (File f : listB) {
				if (f.getName().equals(file.getName())) {
					System.out.println(f.getName());
				}
			}
		}
		
	}
}
