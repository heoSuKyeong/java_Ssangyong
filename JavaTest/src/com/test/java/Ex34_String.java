package com.test.java;

import java.util.Arrays;
import java.util.Scanner;

public class Ex34_String {

	public static void main(String[] args) {
		
		//문자열, String
		
//		m1();	//String 기본
//		m2();	//문자열 추출(charAt)
//		m3();	//문자열 추출하여 유효성 검사
//		m4();	//문자열 추출하여 유효성 검사2
//		m5();	//공백 제거(trim)
//		m6();	//복습 및 문자열 검색(indexOf)
//		m7();	//indexOf 통해 유효성검사
//		m8();	//대소문자 변경(toUpperCase, toLowerCase)
//		m9();	//패턴 검색(startsWith, endsWith)
//		m10();	//문자열 추출(substring)
//		m11();	//문자열 검색(contains)
//		m12();	//문자열 치환(replace)
		m13();	//문자열 분리(split)
		
	}

	private static void m13() {
		// TODO Auto-generated method stub
		
		//문자열 분리
		//- String[] split(String delimiter)
		//- 구분자를 기준으로 쪼개는 메소드
		
		String name = "홍길동,아무개,,강호동,박명수";
		String[] names = name.split(",");		//구분자는 사라진다.
		
		System.out.println(Arrays.toString(names));
		
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
	}

	private static void m12() {
		// TODO Auto-generated method stub
		
		//문자열 치환(바꾸기)
		//- String replace(String old, String new)
		//- 문자열의 일부(old)를 다른 문자열(new)로 바꾸는 메소드)
		
		String txt = "안녕하세요. 홍길동입니다. 반갑습니다요. 홍길동입니다.";
		
		//replace 없이 바꾸기
		int index = txt.indexOf("홍길동");
		String temp1 = txt.substring(0, index);		//"안녕하세요. "
		String temp2 = txt.substring(index+3);		//"입니다."
		System.out.println(txt);
		System.out.println(temp1 + "아무개" + temp2);
		
		//replace 사용
		System.out.println(txt.replace("홍길동", "아무개"));

		//공백 제거
		txt = "    하나   둘 셋 ";
		System.out.println(txt.trim());
		System.out.println(txt.replace(" ", ""));
		
	}

	private static void m11() {
		// TODO Auto-generated method stub
		
		//문자열 검색
		//- indexOf(), lastIndexOf()
		//- startWith(), endWith()
		
		//- boolean contains(String)
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		System.out.println(txt.contains("홍길동"));
		System.out.println(txt.contains("아무개"));
		
	}

	private static void m10() {
		// TODO Auto-generated method stub
		
		//문자열 (여러개)추출
		//- String substring(int beginIndex, intIndex)
		//- String substring(int beginIndex)
		//- beginIndex: 포함(inclusive)
		//- endIndex: 미포함(exclusive)
		
		//***자바에서 범위를 나타낼 때 : 시작(포함) ~ 끝(미포함)
		
		String txt = "가나다라마바사아자차카타파하";
		
		System.out.println(txt.substring(3, 7));
		System.out.println(txt.substring(3));
		System.out.println(txt.charAt(5));			//'바'	> 문자코드값 변환 가능	
		System.out.println(txt.substring(5,6));		//"바"
		System.out.println();
		
		//주민등로번호
		String jumin = "970728-1234567";
		
		//성별?
		System.out.println(jumin.charAt(7) == '1' ? "남자" : "여자");
		System.out.println(jumin.substring(7,8).equals("1") ? "남자": "여자");
		
		//몇년생?
		System.out.println(jumin.substring(0,2)+"년생");
		
		
		// 파일 경로
		String path = "C:\\class\\java\\JavaTest\\Ex34_Stiring.java";
		
		
		//1. 파일명 추출 > Ex34_Stiring.java
		int index = path.lastIndexOf("\\");		// 마지막 "\\"위치 뒤
		String filename = path.substring(index+1);
		System.out.println(filename);
		
		//2. 확장자 없는 파일명 추출 > Ex34_Stiring
		int dot = filename.lastIndexOf(".");
		String nameWithoutExtension = filename.substring(0,dot);
		System.out.println(nameWithoutExtension);
		
		//3. 확장자 추출 > .java
		String extension = filename.substring(dot+1);
		System.out.println(extension);
		
	}

	private static void m9() {
		// TODO Auto-generated method stub
		
		//패턴 검색
		//- boolean starsWith(String)
		//- boolean endsWith(String)
		
		String txt = "자바 프로그래밍";
		
		System.out.println(txt.startsWith("자바"));
		System.out.println(txt.startsWith("프로그래밍"));
		System.out.println(txt.endsWith("자바"));
		System.out.println(txt.endsWith("프로그래밍"));
		
		String name = "홍길동";
		
		//세개 다 같은 결과 반환
		System.out.println(name.startsWith("홍"));
		System.out.println(name.charAt(0) == '홍');
		System.out.println(name.indexOf('홍')==0);
		
		System.out.println(name.endsWith("동"));
		System.out.println();
		
		
		//파일 경로
		String path = "C:\\class\\java\\JavaTest\\Ex34_Stiring.java";
		
		//해당 파일이 '자바 소스 파일'입니까 > 확장자 검사
		if (path.endsWith(".java")) {
			System.out.println("자바 소스 파일");
		} else {
			System.out.println("다른 파일");
		}
		
	}

	private static void m8() {
		// TODO Auto-generated method stub
		
		//대소문자 변경
		//-String toUpperCase()
		//-String toLowerCase()
		
		String content = "오늘 수업은 Java입니다.";
		String word = "java";	//검색어
		
		System.out.println(content);
		System.out.println(content.toUpperCase());
		System.out.println(content.toLowerCase());
		
		//대소문자 구분(Case sensitive)
		//정확도가 높으나, 검색율이 낮음
		if (content.indexOf(word) > -1) {
			System.out.println("결과 o");
		} else {
			System.out.println("결과 x");
			
		}
		
		//대소문자 구분X(Case insensitive)
		//정확도가 낮으나, 검색율이 높음
		if (content.toUpperCase().indexOf(word) > -1 || content.toLowerCase().indexOf(word) > -1) {
			System.out.println("결과 o");
		} else {
			System.out.println("결과 x");
		}
		
	}

	private static void m7() {
		// TODO Auto-generated method stub
		
		//주민등록번호 > '-' 반드시 기입(유효성검사)
		String jumin = "970728-1234567";
		
		//위치로 글자를 찾음
		if (jumin.charAt(6) == '-') {
			System.out.println("통과");
		} else {
			System.out.println("실패");
		}
		
		//글자로 위치를 찾음
		if (jumin.indexOf("-") == 6) {
			System.out.println("통과");
		} else {
			System.out.println("실패");
		}
		System.out.println();
		
		//게시판 글쓰기 : 관리자 기능 중 금지어 설정
		
		String word = "바보";
		String content = "안녕하세요. 반갑습니다. 자바를 공부하고 있습니다.";
		
		if(content.indexOf(word) > 0) {
			System.out.println("금지어가 들어가있습니다.");
		} else {
			System.out.println("반갑습니다.");
		}
		System.out.println();
		
		String[] words = {"바보", "멍청이", "메롱", "ㅂㅏㅂㅗ"};
		for (int i=0; i<words.length; i++) {
			if(content.indexOf(words[i]) > 0) {
				System.out.println("금지어가 들어가있습니다.");
				break;
			} 
			
		}
		
		
	}

	private static void m6() {
		// TODO Auto-generated method stub
		
		//복습
		
		//문자열 조작
		//1. int length()
		//2. char cahrAt(int)
		//3. String trim()
		
		
		//문자열 검색
		//- int indexOf(char)
		//- int indexOf(String)
		//- int indexOf(char, int)
		//- int indexOf(String, int)
		
		//- int lastIndexOf(char)
		//- int lastIndexOf(String)
		//- int lastIndexOf(char, int)
		//- int lastIndexOf(String, int)
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		int index = -1;
		
		index = txt.indexOf('하');
		System.out.println(index);
		index = txt.indexOf('홍');
		System.out.println(index);

		index = txt.indexOf('김');		//없으면 -1 반환
		System.out.println(index);
		
		
		index = txt.indexOf("홍길동");	//홍의 위치값 반환
		System.out.println(index);
		System.out.println();
		
		txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다. 안녕히가세요. 홍길동입니다.";
		
//		index = txt.indexOf("홍길동");	//0번째부터 홍길동을 찾음 > 첫번째 홍길동 인덱스 반환 = 7
//		System.out.println(index);
//		
//		index = txt.indexOf("홍길동",10);	//10번째부터 홍길동을 찾음 > 두번째 홍길동 인덱스 반환 = 22
//		System.out.println(index);
		
		//위 두개의 코드를 아래처럼 작성 가능
		index = -1;
//		for (int i=0; i<3; i++) {
		while(true) {
			index = txt.indexOf("홍길동", index);
			
			if (index < 0) {	//"홍길동"을 찾지 못했으면
				break;
			}
			
			System.out.println(index);
			
			index += 3;
		}
		System.out.println();
		
		//lastIndexOf
		
		txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다";
		
		System.out.println(txt.indexOf("홍길동"));		//7
		System.out.println(txt.lastIndexOf("홍길동"));	//22
		System.out.println(txt.lastIndexOf("홍길동",21));	//7
		
		
		
	}

	private static void m5() {
		// TODO Auto-generated method stub
		
		//공백 제거
		//- String trim()
		//- 문자열 내의 공백문자(Whitespace > 스페이스, 탭, 개행)를 제거
		//**** 문자열의 시작과 끝에 존재하는 공백만 지운다.
		
		
		String txt = "    하나    둘 셋  ";
		
		System.out.printf("[%s]\n", txt);
		System.out.printf("[%s]\n", txt.trim());
		
		
	}

	private static void m4() {
		// TODO Auto-generated method stub
		
		//요구사항) 주민등록번호 : 970727-1234567
		
		String jumin = "970727-1234567";
		
		if (jumin.charAt(6) == '-') {
			System.out.println("정확");
			if (jumin.charAt(7) == '1' || jumin.charAt(7) == '3') {
				System.out.println("남자");
			} else {
				System.out.println("여자");
				
			}
		} else {
			System.out.println("'-'를 입력해주세요");
		}
		
	}

	private static void m3() {
		// TODO Auto-generated method stub
		
		// 요구사항) 회원 가입 시, 아이디 입력 : 영어 소문자만 입력
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디: ");
		String id  = scan.nextLine();
		
		for (int i=0; i<id.length(); i++) {
			char c = id.charAt(i);
			if (c < 'a' || c > 'z') {
				System.out.println("영어 소문자만 입력해주세요.");
				break;
			}
		}
		System.out.println("종료");
		
		
		
	}

	private static void m2() {
		// TODO Auto-generated method stub
		
		//문자열 추출
		//- char charAt(int index)
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		char c = txt.charAt(3);	//세
		System.out.println(c);
		
		c = txt.charAt(13);		//.
		System.out.println(c);
		
		
	}

	private static void m1() {
		// TODO Auto-generated method stub
		
		//문자열(String), 문자(char)
		//문자열 == 문자의 집합
		//String == char[]
		
		//문자열 조작 기능 == 배열 조작 기능 유사
		
		//문자열 길이
		//-int length()
		//-문자열의 글자수
		
		//홍길동입니다.
		char[] clist = {'홍','길','동','입','니','다','.'};
		System.out.println(clist.length);
		
		String str = "홍길동입니다.";
		System.out.println(str.length());
		
		System.out.println("홍길동".length());
		
		System.out.println("A1가$".length());		//자바는 유니코드 기준으로 한글자당 길이는 1로 취급
		
		
		//요구사항) 회원가입 중 이름을 2자~5자 이내로 작성하시오.(유효성검사)
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = scan.nextLine();
		
		if (name.length() >= 2 && name.length() <= 5) {
			System.out.println("올바른 이름~");
			
		} else {
			System.out.println("이름을 2자~5자 이내로 작성하시오.");
		}
		
		
		
	}
	
	
}
