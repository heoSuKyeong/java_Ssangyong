package com.test.java.io;

import java.io.File;
import java.util.Calendar;

public class Ex64_File {
	
	//누적 변수
	private static int count = 0;	//파일 누적 개수
	private static int dcount = 0;	//폴더 누적 개수
	private static long length = 0;	//폴더 크기
	
	public static void main(String[] args) {
		
		/*
		1. 파일/디렉토리 조작
		- 윈도우 탐색기로 하는 모든 행동
		- 파일을 대상으로 하는 행동들: 정보확인, 새로만들기, 이름바꾸기, 이동하기, 삭제하기 등
		- 폴더를 대상으로 하는 행동들: 파일과 비슷
		
		2. 파일 입출력
		- 파일 하나를 대상으로 읽기 or 쓰기
		- 메모장 기능
		
		*/
//		m1();	//파일 접근
//		m2();	//폴더 접근
//		m3();	//파일 생성	: createNewFile
//		m4();	//파일명 바꾸기 : renameTo
//		m5();	//파일 이동하기 : renameTo
//		m6();	//파일 삭제 : delete
		
//		m7();	//폴더 생성 : mkdir
//		m8();	//여러 폴더 생성 : mkdirs
//		m9();	//날짜별 폴더 생성
//		m10();	//폴더명 바꾸기
//		m11();	//폴더 이동하기
//		m12();	//폴더 삭제
//		m13();	//폴더 내용보기(자식 폴더, 파일) : list, listFiles
//		m14();	//*자식 폴더의 파일 개수 세기
		m15();	//***** 재귀함수로 자식 폴더의 파일 개수 세기
		
		
	}

	private static void m15() {
		
		//자식 폴더의 파일 개수 세기
		File dir = new File("C:\\class\\dev\\eclipse");
		
		if (dir.exists()) {
			
			countFile(dir);
			System.out.printf("총 파일 개수: %,d개\n", count);
			System.out.printf("총 폴더 개수: %,d개\n", dcount);
			System.out.printf("총 폴더 크기: %,d바이트\n", length);
		}
	}

	private static void countFile(File dir) {
		//1. 목록 가져오기
		File[] list = dir.listFiles();
		
		//2. 파일 개수 세기
		for (File subfile : list) {
			if(subfile.isFile()) {
				count++;
				length += subfile.length();	//파일의 크기를 누적
			}
		}
		
		//3. 자식 폴더를 대상으로 1~2번을 반복
		for (File subdir : list) {
			if (subdir.isDirectory()) {
				dcount++;
				//1~2번 실행> 3번 실행 > 손자 폴더로 넘어가기
				countFile(subdir);	//자식 폴더를 대상으로 반복
			}
		}
	}

	private static void m14() {

		//자식 폴더의 파일 개수 세기
		File dir = new File("C:\\class\\dev\\eclipse");
		
		int count =0;	//누적 파일 개수
		
		if (dir.exists()) {
			
			File[] list = dir.listFiles();
			
			for (File subfile : list) {
				if (subfile.isFile()) {
					count++;
				}
			}
			
			for (File subdir : list) {
				if (subdir.isDirectory()) {
					
					//자식폴더 > 내용
					File[] sublist = subdir.listFiles();
					
					for (File subsubfile : sublist) {
						if (subsubfile.isFile()) {
							count++;
						}
					}
					
					for (File subsubdir : sublist) {
						if (subsubdir.isDirectory()) {
							
							//손자폴더 > 내용
							File[] subsublist = subsubdir.listFiles();
							
							for (File subsubsubfile : subsublist) {
								if (subsubsubfile.isFile()) {
									count++;
								}
							}
						}
					}
					
				}
			}
			
		}
		
		
		System.out.printf("총 파일 개수: %d개", count);
	}

	private static void m13() {
		//폴더 내용보기(자식 폴더, 파일)
		
		String path = "C:\\class\\dev\\eclipse";
		
		File dir = new File(path);
		/*
		if (dir.exists()) {
			//2가지 방법
			//1. dir.list();
			//2. dir.listFiles();
			
			String[] list = dir.list();
			
			for (String f : list) {
				//파일명, 폴더명 > 구분이 명확하지 않다..
//				System.out.println(f);
				
				File file = new File(path + "\\" + f);
				System.out.println(f + " > " + (file.isFile() ? "파일":"폴더"));
			}
		}
		System.out.println();
		
		File[] list = dir.listFiles();
		
		for (File f : list) {
			System.out.printf("%s - %s\n", f.getName(),  (f.isFile() ? "파일":"폴더"));
		}
		*/
		
		//탐색기 느낌 > 폴더 출력 후 파일 출력
		File[] list = dir.listFiles();
		
		for (File d : list) {
			if(d.isDirectory()) {
				System.out.printf("[%s]\n", d.getName());
			}
		}
		
		for (File f : list) {
			if(f.isFile()) {
				System.out.println(f.getName());
			}
		}
		
	}

	private static void m12() {
		
		//폴더 삭제
		//- 빈 폴더일 때만 가능하다.
		//- 내용물(파일, 자식폴더)이 있으면 삭제가 불가능하다.
		File dir = new File("C:\\class\\code\\java\\move\\TODO");
		
		if(dir.exists()) {
			System.out.println(dir.delete());
		}
		
	}

	private static void m11() {
		
		//폴더 이동하기
		File dir = new File("C:\\class\\code\\java\\file\\TODO");
		File newDir = new File("C:\\class\\code\\java\\move\\TODO");
		
		if(dir.exists()) {
			System.out.println(dir.renameTo(newDir));
		} 
		
	}

	private static void m10() {

		//폴더명 바꾸기
		File dir = new File("C:\\class\\code\\java\\file\\날짜");
		File newDir = new File("C:\\class\\code\\java\\file\\TODO");
		
		if(dir.exists()) {
			System.out.println(dir.renameTo(newDir));
		} 
		
	}

	private static void m9() {
		
		//요구사항) 날짜별 폴더 생성 > 2023-01-01 ~ 2023-12-31
		
		Calendar c = Calendar.getInstance();
		
		c.set(2023, 0, 1);
		
//		System.out.println(c.getActualMaximum(Calendar.MONTH));	//11, 캘린더가 속한 범위 내 달의 최대 수
//		System.out.println(c.getActualMaximum(Calendar.DATE));	//31, 캘린더가 속한 범위 내 해당 날짜의 최대 일수
//		System.out.println(c.getActualMaximum(Calendar.DAY_OF_YEAR));	//365, 캘린더가 속한 범위 내 해당 날짜의 최대 일수
		
		int max = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		for (int i=0; i<max; i++) {
			//"2023-01-01"
			String name = String.format("%tF", c);
			System.out.println(name);
			
			File dir = new File("C:\\class\\code\\java\\file\\날짜\\" + name);
			
			dir.mkdirs();
			
			c.add(Calendar.DATE, 1);
		}
	}

	private static void m8() {

		//요구사항) 회원 > 회원명으로 개인 폴더 생성
		
		String[] member = {"홍길동", "아무개", "이순신", "권율", "유관순"};
		
		for (int i=0; i<member.length; i++) {
			
			String path = String.format("C:\\class\\code\\java\\file\\회원\\[개인폴더]%s님", member[i]);
			
			File dir = new File(path);
			
			System.out.println(dir.mkdirs());
		}
		
	}

	private static void m7() {

		//폴더 만들기
//		File dir = new File("C:\\class\\code\\java\\aa");
		File dir = new File("C:\\class\\code\\java\\bb\\cc");
		
		if(!dir.exists()) {
//			System.out.println(dir.mkdir());	//하나의 폴더만 생성
			System.out.println(dir.mkdirs());	//여러 폴더 생성 가능, 연관된 폴더 모두 생성
		}
	}

	private static void m6() {

		File file = new File("C:\\class\\code\\java\\move\\data.txt");
		
		if (file.exists()) {
			
			//파일 이동 > 휴지통(o)
			//파일 삭제 > 휴지통(x)
			System.out.println(file.delete());	//주의!! 복구 안됨!!
		}
	}

	private static void m5() {

		//파일 이동하기
		//- C:\\class\\code\\java\\file\\data.txt
		//- C:\\class\\code\\java\\move\\data.txt
		
		File file = new File("C:\\class\\code\\java\\file\\data.txt");
		File newFile = new File("C:\\class\\code\\java\\move\\data.txt");
		
		if (file.exists()) {
			System.out.println(file.renameTo(newFile));
		}
	}

	private static void m4() {
		
		//파일명 바꾸기
		File file = new File("C:\\class\\code\\java\\file\\데이터1.txt");
		File newFile = new File("C:\\class\\code\\java\\file\\data.txt");
		
		if (file.exists()) {
			//고쳐질 경로와 파일 이름을 매개변수로 받는다.
			System.out.println(file.renameTo(newFile));
			
		}
	}

	private static void m3() {
		
		//파일 생성하기 > 파일 이름까지 설정
		File file = new File("C:\\class\\code\\java\\file\\hello.txt");
		
		if (!file.exists()) {
			try {
				System.out.println(file.createNewFile());	//파일 생성
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} else {
			System.out.println("이미 동일한 파일이 존재합니다.");
		}
	}

	private static void m2() {
		
		//폴더 정보 접근
		//폴더(Folder) == 디렉토리(Directory)
		
		//- C:\class\code\java\file
		
		//폴더 참조 객체
		//- 폴더도 파일이다.
		
		//파일 참조 객체와 사용법이 같음
		File dir = new File("C:\\class\\code\\java\\file");
		
		if (dir.exists()) {
			System.out.println("폴더가 있습니다.");
			
			System.out.println(dir.getName());		//file
			System.out.println(dir.isFile());		//false
			System.out.println(dir.isDirectory());		//true
			System.out.println(dir.length());		//0 > 폴더 자체의 크기는 없다.
			System.out.println(dir.getAbsolutePath());	//C:\class\code\java\file
			
			System.out.println(dir.lastModified());		//1691379562704	> 마지막으로 수정한 날짜
			System.out.println(dir.isHidden());	
			
			System.out.println(dir.getParent());	//C:\class\code\java
			
		} else {
			System.out.println("폴더가 없습니다.");
		}
	}

	private static void m1() {
		
		//파일의 정보를 확인하는 작업
		//- C:\class\code\java\file > 폴더 생성
		//- C:\class\code\java\file\data.txt 파일 생성
		
		//자바 프로그램에서 외부의 파일을 접근
		//1. 외부 파일을 참조하는 참조 객체(대리자) 생성
		//2. 참조 객체 조작으로 외부 파일에 적용이 된다.
		
		//파일 참조 클래스 > 객체 생성
		File file = new File("C:\\class\\code\\java\\file\\data.txt");
		
//		System.out.println(file.exists());	//true, 파일이 있는지 사전체크 필수
		
		if (file.exists()) {
			System.out.println("파일이 있습니다.");
			//업무
			System.out.println(file.getName());		//data.txt
			System.out.println(file.isFile());		//true
			System.out.println(file.isDirectory());		//false
			System.out.println(file.length());		//36 > 파일크기(바이트)
			System.out.println(file.getAbsolutePath());		//C:\class\code\java\file\data.txt > 전체 경로
			
			System.out.println(file.lastModified());		//1691379562704	> 마지막으로 수정한 날짜
			System.out.println(file.isHidden());		//false
			
			//tick > 년원일시분초
			Calendar c1 = Calendar.getInstance();
			System.out.println(c1.getTimeInMillis());
			c1.setTimeInMillis(file.lastModified());
			
			System.out.printf("%tF %tT\n", c1, c1);
			
			
		} else {
			System.out.println("파일이 없습니다.");
		}
	}
	
	
}
