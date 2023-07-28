package com.test.java;

public class Ex19_Method {
	
	/*
	main 메소드
	- 특수 메소드 
	- 이름이 예약어
	- 프로그램이 시작되면, 자바가 자동으로 호출하는 메소드
	- 프로그램의 시작점(Entry Point)
	- 프로그램의 종착점(End Point) : 메소드 작동 후 다시 main 메소드로 돌아옴
	
	
	
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 메소드(Method) - 함수(function), 프로시저(Procedure), 서브 루트(Sub Routine) - (같은 목적을
		 * 가진)코드의 집합 - 행동의 단위 - 코드 재사용의 단위
		 * 
		 * 변수 사용 절차 1. 변수 선언 2. 변수 사용
		 * 
		 * 메소드 사용 절차 1. 메소드 선언 2. 메소드 사용(호출)
		 * 
		 * 
		 */

		// 요구사항) "안녕하세요." 출력 x 5회
		// 수정사항) "반갑습니다." 출력 x 5회
		System.out.println("반갑습니다."); // 5번 작성
		System.out.println();

		// 메소드 사용 목적
		// 1. 코드의 분리 : 목적 맞는 코드를 각각 따로 관리
		// 2. 코드의 재사용 : 한번만 정의 후 호출 > 유지보수가 쉬워짐

		// 메소드 호출(실행)
		hello();
		hello();
		hello();
		hello();
		hello();
		
		// 요구사항) 숫자를 한글로 1~10까지 출력
		printNumber();

	}

//	메소드 선언
//	1. class 내부에서 선언
//	2. 메소드간의 순서 무관

	/*
	 * 메소드 선언 구문
	 * 
	 * public static void hello() {
	 * 
	 * }
	 * 
	 * - public static void hello() : 선언부(header) >> 메소드 특징 
	 * - {} : 구현부(body) >> 메소드 내용물
	 * 
	 * - public : 접근 지정자(제한자) Access Modifier 
	 * - static : 정적 키워드 
	 * - void : 반환 자료형 
	 * - hello : 메소드명 
	 * - () : 인자 리스트
	 * 
	 */

	// 특정한 목적을 가지는 코드의 집합
	public static void hello() {

		// 해당 메소드가 하려는 업무 구현
		System.out.println("안녕하세요.");

	}

	public static void printNumber() {
		
		System.out.println("하나");
		System.out.println("둘");
		System.out.println("셋");
		System.out.println("넷");
		System.out.println("다섯");
		System.out.println("여섯");
		System.out.println("일곱");
		System.out.println("여덟");
		System.out.println("아홉");
		System.out.println("열");
	}

}
