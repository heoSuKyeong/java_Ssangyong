package com.test.question.directoryAccess;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Q121 {

//	요구사항
//	숫자를 한글로 바꾼 뒤 파일을 다른 이름으로 저장하시오.
//
//	조건..
//	0 → 영, 1 → 일 ... 9 → 구
//	저장할 파일명: 숫자_변환.dat
	
	public static void main(String[] args) {
		
		try {
			String path = "C:\\class\\code\\java\\file\\파일_입출력_문제";
			BufferedReader breader = new BufferedReader(new FileReader(path + "\\숫자.dat"));
			BufferedWriter bwriter = new BufferedWriter(new FileWriter(path + "\\숫자_변환.dat"));
			
			String line = null;
			while((line = breader.readLine())!= null) {
				
				for(int i=0; i<line.length(); i++) {
					char c = line.charAt(i);
					if (c >= '0' && c <= '9') {
						char num = changeNum(c);
						bwriter.write(num);
					} else {
						bwriter.write((char)c);
					}
				}
				bwriter.write("\r\n");
				
			}
			
			breader.close();
			bwriter.close();
			
			System.out.println("변환 후 다른 이름으로 저장하였습니다.");
			
			
		} catch (Exception e) {
			System.out.println("at Q121.main");
			e.printStackTrace();
		}
		
	}

	private static char changeNum(char c) {
		
		switch (c) {
		case '0':
			return '영';
		case '1':
			return '일';
		case '2':
			return '이';
		case '3':
			return '삼';
		case '4':
			return '사';
		case '5':
			return '오';
		case '6':
			return '육';
		case '7':
			return '칠';
		case '8':
			return '팔';
		default:
			return '구';
		}
		
	}
	
}
