package com.test.util;

public class MyFile {
	
	//파일 처리와 관련된 업무 구현
	//1. 경로에서 파일명 추출
	//2. 경로에서 확장자 추출
	
	public String getFileNameWithOutExtension(String path) {
		
		//getFileName("test.txt")	> 상대경로
		//getFileName("C:\\java\\ho.ng.mp4")		> 절대경로
		//다양한 경로를 입력받을 수 있음을 가정
		
		if (path.contains("\\")) {
			String[] temp = path.split("\\");
			path = temp[temp.length-1];
		}
		
		//확장자 제외 이름 구하기
		int index = path.lastIndexOf(".");
		
		return path.substring(0, index);
		
	}
	
	public String getExtension(String path) {
		
		//getFileName("test.txt")	> 상대경로
		//getFileName("C:\\java\\ho.ng.mp4")		> 절대경로
		//다양한 경로를 입력받을 수 있음을 가정
		
		if (path.contains("\\")) {
			String[] temp = path.split("\\");
			path = temp[temp.length-1];
		}
		
		//확장자구하기
		int index = path.lastIndexOf(".");
		
		return path.substring(index+1);
		
	}
	
	
	
}
