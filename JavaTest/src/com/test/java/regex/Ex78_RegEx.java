package com.test.java.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex78_RegEx {
	public static void main(String[] args) {
		
		
		//정규표현식 + 자바
		//- 검색(+치환) : replaceAll(), replaceFirst()
		//- 분리 : split()
		//- 유효성 검사 : Pattern, Matcher 클래스
		
		//1. 정규 표현식 객체
		//2. 다른 객체의 기능 중 일부 정규 표현식 지원
		
		
//		m1();	//전화번호, 이메일
//		m2();	//csv
//		m3();	//정규 표현식 객체 - find, group
//		m4();
		m5();	//유효성 검사
		
		
	}

	private static void m5() {
		
		//유효성 검사
		
		//회원가입 > 유효성 검사
		//1. 이름 > 필수, 한글, 2~5자 이내
		//2. 이메일 > 필수, 이메일 형식
		//3. 나이 > 필수, 숫자, 18~100세
		//4. 아이디 > 필수, 영어+숫자+_ 조합 가능, 숫자로 시작 불가능, 4~12자 이내
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[회원가입]");
		
		String name = getData(scan, "이름");
		String email = getData(scan, "이메일");
		String age = getData(scan, "나이");
		String id = getData(scan, "아이디");
		
		
		//일괄 유효성 검사
		if (isValid(name, email, age, id)) {
			System.out.println("가입 완료");
		} else {
			System.out.println("가입 실패");
		}
		
	}

	private static boolean isValid(String name, String email, String age, String id) {
		
		//유효성 검사 > 잘못된 부분을 찾아라
		
		String regex = "";	//정규식
		Pattern p1 = null;	//정규식 객체
		Matcher m1 = null;	//결과 객체
		
		//1. 이름 > 필수, 한글, 2~5자 이내
		//^ : 시작조건 / $ : 끝나는 조건
		regex = "^[가-힣]{2,5}$";
		p1 = Pattern.compile(regex);
		m1 = p1.matcher(name);		//사용자가 입력한 이름에서 패턴 검색
		if (!m1.find()) {
			System.out.println("이름 > 필수, 한글, 2~5자 이내");
			
			return false;
		}
		
		//2. 이메일 > 필수, 이메일 형식
		regex = "^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$";
		p1 = Pattern.compile(regex);
		m1 = p1.matcher(email);		//사용자가 입력한 이름에서 패턴 검색
		
		if (!m1.find() || (Integer.parseInt(age) < 18 || Integer.parseInt(age) > 100)) {
			System.out.println("이메일 > 필수, 이메일 형식");
			
			return false;
		}
		
		//3. 나이 > 필수, 숫자, 18~100세
		//범위는 정규표현식에서 검사 불가능하다.
		regex = "^[0-9]{2,3}$";
		p1 = Pattern.compile(regex);
		m1 = p1.matcher(age);		//사용자가 입력한 이름에서 패턴 검색
		
		if (!m1.find()) {
			System.out.println("나이 > 필수, 숫자, 18~100세");
			
			return false;
		}
		
		
		//4. 아이디 > 필수, 영어+숫자+_ 조합 가능, 숫자로 시작 불가능, 4~12자 이내
		regex = "^[A-za-z_][A-za-z0-9_]{4,11}$";
		regex = "^[A-za-z_]\\w{4,12}$";
		
		p1 = Pattern.compile(regex);
		m1 = p1.matcher(id);		//사용자가 입력한 이름에서 패턴 검색
		
		if (!m1.find()) {
			System.out.println("아이디 > 필수, 영어+숫자+_ 조합 가능, 숫자로 시작 불가능, 4~12자 이내");
			
			return false;
		}
		
		
		
		
		return true;
	}

	private static String getData(Scanner scan, String label) {
		System.out.print(label + ": ");
		return scan.nextLine();
		
	}

	private static void m4() {
		
		String txt = "안녕하세요. 홍길동입니다. 네? 당신 이름도 길동이라구요?, 아~ 김길동이요. 저쪽에 최길동도 있습니다. 그리고 남궁길동도 있습니다.";
		
		//요구사항) 모든 길동 찾기
//		String regex = "[홍김최(남궁)]?길동";
		String regex = "(홍|김|최|남궁)?길동";
		
		Pattern p1 = Pattern.compile(regex);
		
		Matcher m1 = p1.matcher(txt);
		
		while (m1.find()) {
			
			System.out.println("찾은 이름: " + m1.group());
			System.out.println("성씨: " + m1.group(1));
		}
		
	}

	private static void m3() {
		
		//정규 표현식 객체
		String txt = "안녕하세요. 홍길동입니다. \n제 연락처는 011-1234-5678입니다.\n 추가 연착처는 010-9876-5432입니다.";
		
		//정규 표현식 객체 생성하기
		//p1 = 정규 표현식 객체
		//String regex = "[0-9]{3}-[0-9]{3,4}-[0-9]{4};
		String regex = "(\\d{3})-(\\d{3,4})-(\\d{4})";
		
		Pattern p1 = Pattern.compile(regex);
		
		//txt에서 p1의 패턴을 검색한다.
		Matcher m1 = p1.matcher(txt);
		
//		System.out.println(m1.find());	//검색 결과 유무 반환
		
		/*
		if (m1.find()) {
			System.out.println("txt에서 전화번호 발견");
		} else {
			System.out.println("txt에서 전화번호 미발견");
		}
		*/
		/*
		//출력횟수에 영향이 있다.
		System.out.println(m1.find());	//true > 첫번째 : 010-1234-5678
		System.out.println(m1.find());	//true > 두번째 : 010-9876-5432
		System.out.println(m1.find());	//false
		System.out.println(m1.find());	//false
		*/
		/*
		//전화번호 총 몇번 발견?
		int count =0;
		
		while(m1.find()) {
			count++;
		}
		System.out.printf("전화번호가 총 %d회 발견되었습니다.\n", count);
		*/
		
//		String regex = "(\\d{3})-(\\d{3,4})-(\\d{4})";
		//group(0) : (\\d{3})-(\\d{3,4})-(\\d{4})
		//group(1) : (\\d{3})
		//group(2) : (\\d{3,4})
		//group(3) : (\\d{4})
		while(m1.find()) {
			System.out.println("[전화번호 발견]");
			
			System.out.println("전화번호: " + m1.group(0));
			System.out.println("통신사: " + m1.group(1));
			System.out.println("앞자리: " + m1.group(2));
			System.out.println("뒷자리: " + m1.group(3));
			
			System.out.println();
		}
		
	}

	private static void m2() {

		String name = "홍길동;아무개,,,,,하하하,테스트,이순신";
		
		String[] list = name.split("[,;\s]{1,}");
		
		for (String item : list) {
			System.out.println(item);
		}
		
	}

	private static void m1() {

		//게시판 > 개인정보 기재 불가(전화번호를 마스킹 처리)
		String txt = "안녕하세요. 홍길동입니다. \n제 연락처는 010-1234-5678입니다.\n 제 메일은 hong@gmail.com입니다.\n 추가 연착처는 010-9876-5432입니다.";
		
		//replaceAll(String regex, String replacement)
		System.out.println(txt.replaceAll("010-[0-9]{3,4}-[0-9]{4}", "XXX-XXXX-XXXX"));
		System.out.println();
		System.out.println(txt.replaceFirst("010-[0-9]{3,4}-[0-9]{4}", "XXX-XXXX-XXXX"));
		System.out.println();
		
		
		System.out.println(txt.replaceFirst("\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}","OOOO@OOOO"));
		System.out.println();
		
		txt = txt.replaceAll("010-[0-9]{3,4}-[0-9]{4}", "XXX-XXXX-XXXX");
		txt = txt.replaceFirst("\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}","OOOO@OOOO");
		System.out.println(txt);
	}
}
