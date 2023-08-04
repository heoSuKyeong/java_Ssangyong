package com.test.java.obj;

public class Ex36_Class {
	
	
	public static void main(String[] args) {
		
		/*
			
			언어의 성향
			1. 절차지향 프로그래밍
			2. 함수지향 프로그래밍
			3. 객체지향 프로그래밍

			
			자바
			- 객체 지향 프로그래밍 언어, Object Oriented Programming(OOP)
			- 객체를 선호하는 프로그래밍 방식의 언어
			
			1. 객체, Object
				- 사전적인 정의로 실제 존재하는 것을 말한다.
				- 객체지향 이론에서는 사물과 같은 유형적인 것뿐만 아니라, 개념이나 논리와 같은 무형적인 것들도 객체로 간주한다.
				- 맥도날드 > 모든 주문 > 직원
				
			2. 클래스, Class
				- 객체를 분류(생성)하는 단위
				
				ex) 붕어빵, 붕어빵틀 / 핸드폰
					a. 붕어빵틀을 만든다.		>클래스
					b. a를 이용해서 붕어빵을 만든다.	>실체화된 제품 : 객체
					c. 붕어빵을 먹는다.
			
			3. 인스턴스, Instance
				- 객체==인스턴스 
				- 객체!=인스턴스 > 보는 시각이 다름
				- 수많은 객체 중 메모리에 실체화된 객체
				
			
			4. 캡슐화, 정보은닉
				- 객체의 내부를 외부로부터 보호하기 위한 장치
			
			5. 인터페이스, Interface
				- 캡슐화 내부와 외부에서 소통 하는 것
				
				ex) 게임 인터페이스
				
			객체 = 데이터 + 행동의 집합
			
			6. 프로퍼티, Property
				- 객체가 가지는 정보(데이터)
			
			7. 행동
				- 객체가 가지는 행동
			
			8. 상속
				- 부모가 가지는 재산을 자식이 물려받는 행동
				
		
		
		*/
		
		//요구사항) 지도에 우리집의 좌표를 저장한다.
		
		// Case1.
		// - 가장 간단한 방법
		// - 식별자 문제
		//		a. 같은 성질의 식별자가 서로 다른 이름을 사용
		//		b. 한쌍의 집합을 물리적 관리 불가능하다 > 치명적인 문제
		// - 구조(x), 규칙(애매) > 조작 불편
		
		//우리집 좌표
		int x = 100, y = 200;
		
		System.out.printf("우리집은 [%d, %d]에 위치합니다.\n", x, y);
		System.out.println();
		
		// + 마트 좌표 저장
		int x2 = 300, y2 = 400;
		
		
		//Case2.
		// - 배열 사용
		// - 데이터 저장 구조 생성하므로 그룹 관리하기 수월하다.
		// - 배열 단점 : 요소간의 성질을 구분하기 힘들다. / a1[0] > 0번째 > x좌표
		// - 첨자는 의미를 가지지 못한다. > 몇 번째 방에 어떤 데이터를 넣었는지 관리하기 힘들다.
		
		//우리집
		int[] a1 = {100, 200};
		System.out.printf("우리집은 [%d, %d]에 위치합니다.\n", a1[0], a1[1]);
		
		//마트
		int[] a2 = {300, 400};
		System.out.printf("우리집은 [%d, %d]에 위치합니다.\n", a2[0], a2[1]);
		System.out.println();
		
		
		//Case3.
		// - 클래스 사용 > (*****)데이터의 집합으로써의 역할
		// - 데이터 저장 구조 생성되어 관리하기 수월하다.
		// - 같은 클래스의 객체이면 멤버 이름이 동일하게 사용가능하다.  데이터 의미 명확
		// - 멤버 변수의 이름이 존재한다. > 배열과 달리 멤버의 의미가 명확해진다.
		// - 클래스 선언 고가의 비용 발생
		
		//클래스명 변수명 = new 생성자();
		Point p1 = new Point();		//new Point() == 객체생성
		
		p1.x = 100;
		p1.y = 200;
		
		System.out.printf("우리집은 [%d, %d]에 위치합니다.\n", p1.x, p1.y);
		System.out.println();
		
		//마트
		Point p2 = new Point();
		p2.x = 300;
		p2.y = 400;
		
		System.out.printf("마트는 [%d, %d]에 위치합니다.\n", p2.x, p2.y);
		System.out.println();
		
		
		
		// 요구사항) 이름, 너비, 높이를 저장한다.
		Size s1 = new Size();
		
		s1.name = "모니터";
		s1.width = 100;
		s1.height = 500;
		
		System.out.println(s1.name + " " + s1.width + " " + s1.height);
		
		
		// 요구사항) 학생 성적 처리> 학생 1명의 이름, 국어, 영어, 수학 성적의 집합
		Score hong = new Score();
		hong.name = "홍길동";
		hong.kor = 100;
		hong.math = 90;
		hong.eng = 100;
		
		
		
		//이클립스 > 확장 프로그램(Plugin-in)
		//1. 직접 설치
		//2. 마켓 플레이스

		//Objectaid > UML 확장 프로그램
		// - Class Diagram
		
		//UML, Unified Modeling Language
		// - 프로그램의 설계도를 만드는 언어
		// - 수많은 종류의 설계도
		//		a. Class Diagram
		//		b. Package Diagram
		//		c. Object Diagram
		//		d. Component Diagram
		//		e. Sequence Diagram
		//		f. UseCase Diagram
		//		g. Activity Diagram
		//		h. State Diagram
		
		
		
		
	}
	
} //class


//클래스 선언한다.
// - 클래스명은 파스칼 표기법으로 작성한다.
class Score {
	
	public String name;
	public int kor;
	public int math;
	public int eng;
}


class Size {
	
	public String name;
	public int width;
	public int height;
	
}


class Point {
	
	//클래스 내부
	// - 클래스 멤버 선언하기 > 변수 or 메소드를 만든다.
	
	//(클래스 멤버)변수 
	public int x;
	public int y;
	
	
	
	
}
