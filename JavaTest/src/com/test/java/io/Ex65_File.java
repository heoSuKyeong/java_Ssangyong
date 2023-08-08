package com.test.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex65_File {
	
	public static final String FILE = "C:\\class\\code\\java\\file\\list.txt";
	
	
	public static void main(String[] args) {
		
		/*
			파일 입출력
			- 응용프로그램 <- (데이터) -> 저장장치(*.txt)
		
			저장장치
			- 데이터 1,0으로 저장(실제 1,0은 아니지만 1,0에 준하는 표현으로 저장함)
			- 데이터의 자료형 존재X > 모두 다 문자
			
			인코딩, Encoding
			- 문자 코드(자바 데이터)를 부호화(1,0) 시키는 작업
			- 자바 프로그램("홍길동") > 텍스트 파일(100100100110110)
			
			디코딩, Decoding
			- 부호화된 데이터를 문자 코드로 변환하는 작업
			- 텍스트 파일(100100100110110) > 자바 프로그램("홍길동")
			
			인코딩/디코딩 규칙
			1. ISO-8859-1
			2. EUC-KR
			3. ANSI
			4. MS949(CP949)
			5. UTF-8
			6. UTF-16
			7. ASCII
			
			**************반드시 기억하기**************
			
			ANSI(ISO-8859-1, EUC-KR, MS949)
			1. 영어(숫자, 특수문자, 서유럽 등): 1byte
			2. 한글(한자, 일본어 등): 2byte
			
			UTF-8(Unicode)	> 국제 표준*****
			1. 영어: 1byte
			2. 한글: 3byte
			
			UTF-16(Unicode)
			1. 영어: 2byte
			2. 한글: 2byte
			
			10만 글자 파일
			- [ANSI]영어.txt : 100,000 byte
			- [ANSI]한글.txt : 200,000 byte
			
			- [UTF-8]영어.txt : 100,000 byte
			- [UTF-8]한글.txt : 300,000 byte
			
			- [UTF-16]영어.txt : 200,000 byte
			- [UTF-16]한글.txt : 200,000 byte
			
		*/
		
//		m1();	//쓰기 스트림 객체 : FileOutputStream
//		m2();	//읽기 스트림 객체 : FileInputStream	>	한글 깨짐
//		m3();	//FileWriter
//		m4();	//FileReader	>	한글이 깨지지않음
//		m5();	//BufferedWriter
//		m6();	//BufferedReader
//		m7();	//메모장 쓰기
		m8();	//자바파일 읽기
		
	}

	private static void m8() {

		try {
			
			//C:\class\code\java\JavaTest\src\com\test\java
			
			BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\code\\java\\JavaTest\\src\\com\\test\\java\\Ex01.java"));
			
			String line = null;
			int n=1;
			
			while((line= reader.readLine())!=null) {
				System.out.printf("%3d: %s\n", n, line);
				n++;
			}
			
			
			reader.close();
			System.out.println("종료");
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m8");
			e.printStackTrace();
		}
		
	}

	private static void m7() {

		//메모장 쓰기
		try {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("저장할 파일명: ");
			String fileName = scan.nextLine();
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\class\\code\\java\\file\\" + fileName + ".txt"));
			
//			boolean loop = true;
			
			while (true) {

				System.out.print("입력: ");
				String line = scan.nextLine();
				
				if (line.equals("exit")) {
					break;
				}
				
				writer.write(line);	//한줄을 입력받아서 한줄 쓰기(writer)
				writer.write("\r\n");
				
				
			}
			
			writer.close();
			System.out.println("파일 저장 완료");
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m7");
			e.printStackTrace();
		}
		
		
	}

	private static void m6() {

		try {
			
			//BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
			//System.in : 키보드로 입력받은 것을 읽음
			
			BufferedReader breader2 = new BufferedReader(new FileReader("C:\\class\\code\\java\\file\\memo.txt"));
			
			//String line = breader2.readLine();
			//System.out.println(line);
			
			String line = null;
			while ((line=breader2.readLine())!=null) {
				System.out.println(line);
				
			}
			
			breader2.close();
			System.out.println("종료");
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m6");
			e.printStackTrace();
		}
		
		
	}

	private static void m5() {
		//쓰기
		//- FileOutputStream > FileWriter > BufferedWriter	(FileWriter와 BufferedWriter 거의 비슷하다)
		
		//읽기
		//- FileInputStream > FileReader > BufferedReader
		
		try {
			
			BufferedWriter bwriter = new BufferedWriter(new FileWriter("C:\\class\\code\\java\\file\\memo.txt"));
			
			bwriter.write("하나");
			bwriter.write('A');
			bwriter.write("\r\n");	//엔터
			bwriter.write("둘");
			bwriter.newLine();	//엔터
			bwriter.write("셋");
			
			
			bwriter.close();
			System.out.println("종료");
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m5");
			e.printStackTrace();
		}
		
		
	}

	private static void m4() {

		//읽기
		//- FileInputStream > FileReader
		
		try {
			
			//한글을 잘 불러오지만, 한글자씩만 읽을 수 있다.
			FileReader reader = new FileReader("C:\\class\\code\\java\\file\\member.txt");
			
//			int code = reader.read();
//			System.out.println((char)code);
			
			int code =-1;
			while((code=reader.read())!=-1) {
				System.out.print((char)code);
			}
			System.out.println();
			
			
			reader.close();
			System.out.println("종료");
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m4");
			e.printStackTrace();
		}
		
		
		
	}

	private static void m3() {

		//쓰기
		//- FileOutputStream > FileWriter
		
		try {
			
			FileWriter writer = new FileWriter("C:\\class\\code\\java\\file\\member.txt");
			
			//writer.write(65);
			//writer.write("ABC");
			writer.write("한글");	//문자열을 한번에 저장 가능
			
			writer.close();
			System.out.println("종료");
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m3");
			e.printStackTrace();
		}
		
	}

	private static void m2() {

		try {
			
			//파일 읽기
			//- FileOutputStream
			//- FileInputStream
			
			//읽기 스트림 객체
			FileInputStream stream = new FileInputStream(Ex65_File.FILE);
			
			int code = -1;	//파일내에 읽을 글자가 없으면 -1 반환
			
			//**********************루프 자체를 외우기
			while((code = stream.read()) != -1) {
				System.out.print((char)code);
				
			}
			System.out.println();
			
			stream.close();
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m2");
			e.printStackTrace();
		}
		
	}

	private static void m1() {

		//파일 쓰기
		//- 스트림 객체 : 통로 역할
		
		//쓰기 스트림 객체
		//1. 생성모드, Create mode > 덮어쓰기 (***더 많이 사용)
		//- 기본값(생략, false)		
		//- FileOutputStream stream = new FileOutputStream(file, false);
		//a. 파일이 존재하지 않으면 자동으로 생성한다.
		//b. 파일이 존재하면 덮어쓰기를 한다.
		
		//2. 추가모드, Append mode > 이어쓰기
		//- FileOutputStream stream = new FileOutputStream(file, true);
		//a. 파일이 존재하지 않으면 자동으로 생성한다.
		//b. 파일이 존재하면 이어쓰기를 한다.
		
		//파일 입출력은 try-catch 이용해야함.
		try {
			
			//주로 static fianl 상수로 지정하여 사용
			File file = new File("C:\\class\\code\\java\\file\\list.txt");
			
			
			//스트림 객체 생성 == '스트림 열기' 라고 표현
			FileOutputStream stream = new FileOutputStream(file);
			
			//실시간으로 작성되는 것이 아니라 임시메모리공간에 저장되었다가 close를 만나면 파일이 생성된다.
//			stream.write(65);	//A
//			stream.write(66);
//			stream.write(67);
			
//			stream.write('홍');		//한글 깨진다.
//			stream.write('길');
//			stream.write('동');
			
			String txt = "hello~!";
			
			for (int i=0; i<txt.length(); i++) {
				char c = txt.charAt(i);
				stream.write(c);;
			}
			
			//스트림 닫기
			//- 저장이 안된다.
			//- 잠긴 파일이 된다.
			stream.close();
			
			System.out.println("종료");
			
			
		} catch (Exception e) {
			System.out.println("at Ex65_File.m1");
			e.printStackTrace();
		}
		
	}
}
