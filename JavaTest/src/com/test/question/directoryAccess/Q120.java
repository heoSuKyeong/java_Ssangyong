package com.test.question.directoryAccess;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Q120 {
	
//	특정 이름을 찾아 다른 이름으로 변환 후 파일을 다른 이름으로 저장하시오.
//
//	조건..
//	'유재석' → '메뚜기'
//	저장할 파일명: 이름수정_변환.dat
	
	public static void main(String[] args) {
		
		try {
			
			String path = "C:\\class\\code\\java\\file\\파일_입출력_문제";
			
			BufferedReader breader = new BufferedReader(new FileReader(path + "\\이름수정.dat"));
			BufferedWriter bwriter = new BufferedWriter(new FileWriter(path + "\\이름수정_변환.dat"));
			
			String line = null;
			while ((line=breader.readLine())!=null) {
				line = line.replace("유재석", "메뚜기");
				
				bwriter.write(line);
				bwriter.write("\r\n");
				
			}
			
			breader.close();
			bwriter.close();
			
			System.out.println("변환 후 다른 이름으로 저장하였습니다.");
			
			
		} catch (Exception e) {
			System.out.println("at Q120.main");
			e.printStackTrace();
		}
		
	}
}
