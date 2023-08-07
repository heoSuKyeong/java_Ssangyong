package com.test.question.directoryAccess;

import java.io.File;
import java.util.Scanner;

public class Q110 {
	public static void main(String[] args) {
		
		String path = "";
		String fileName = "";
		String extension = "";
		int fileSize = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("파일 경로: ");
		path = scan.nextLine();
		
		File file = new File(path);
		
		fileName = file.getName();
		extension = fileName.split(".")[1];
		
		
		
	}
}
