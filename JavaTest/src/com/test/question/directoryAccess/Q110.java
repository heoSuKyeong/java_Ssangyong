package com.test.question.directoryAccess;

import java.io.File;
import java.util.Scanner;

public class Q110 {
	public static void main(String[] args) {
		
		String path = "";
		String fileName = "";
		String extension = "";
		double fileSize = 0;
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("파일 경로: ");
//		path = scan.nextLine();
		path = "C:\\class\\code\\java\\file\\hello.txt";
		
		File file = new File(path);
		
		fileName = file.getName();
		extension = fileName.substring(fileName.lastIndexOf(".")+1);
		fileSize = file.length();

		System.out.println("파일명: " + fileName);
		System.out.println("종류: " + extension + " 파일");
		System.out.printf("파일 크기: %s\n", getSize(fileSize));
	}

	private static String getSize(double fileSize) {
		
		
		if (fileSize < 1024) {
			return fileSize + "B";
		} else if (fileSize < 1024 * 1024) {
			return String.format("%.1f", (fileSize / 1024.0)) +"KB";
		} else if (fileSize < 1024*1024*1024) {
			return String.format("%.1f", (fileSize / 1024.0 / 1024)) +"MB";
		} else if (fileSize > 1024*1024*1024*1024) {
			return String.format("%.1f",  (fileSize / 1024.0 / 1024 / 1024)) +"GB";
		} else {
			return String.format("%.1f",  (fileSize / 1024.0 / 1024 / 1024 / 1024)) +"TB";
		}
		
	}
}
