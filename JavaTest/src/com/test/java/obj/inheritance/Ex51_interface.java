package com.test.java.obj.inheritance;

public class Ex51_interface {
	public static void main(String[] args) {
		
		/*
		인터페이스, Interface
		- 클래스의 일종
		- 자료형
		- 객체를 생성할 수 없다. 	//Mouse m1 = new Mouse();
		- 참조 변수는 생성할 수 있다. 	//Mouse m1 = null;
		- 클래스의 부모 역할
		
		-**** 인터페이스는 상속받는 여러 클래스들을 행동(사용법, 메소드)들을 통일 시키는 역할 > 행동 규약 정의
		
		*/
		
		//Cannot instantiate the type Mouse
//		Mouse m1 = new Mouse();
//		m1.click();
		
		M705 m1 = new M705();
		m1.click();
		
		G304 m2 = new G304();
//		m2.push();		//***문제점 > 사용자 경험을 살리지 못했다.
		m2.click();
		
	}
}


//인터페이스 선언
interface Mouse {
	
	//인터페이스의 멤버 구현
	//- 멤버 변수
	//- 멤버 메소드
	//- 인터페이스는 추상 멤버(추상 메소드)만을 가질 수 있다.
	
	//*****인터페이스는 구현된 멤버를 가질 수 없다.
	//public int a;
	//public void aaa() {	}
	
	//*****인터페이스는 구현부를 가진 메소드를 소유할 수 없다.
//	public void aaa() {
//		//구현부
//	}
	
	//추상메소드, Abstract Method
	//- 구현부 없이 선언부만 가지는 메소드
//	public void aaa();
	
	public void click();
	
	
}

//The type M705 must implement the inherited abstract method Mouse.click()
//*** 인터페이스를 상속받는 클래스는 반드시 인터페이스의 추상 메소드를 구현해야 한다.
class M705 implements Mouse {

	//추상메소드를 구현했다. > 일종의 오버라이드
	public void click() {
		System.out.println("클릭");
	}
	
}

class G304 implements Mouse {
	
	//m705의 click()와 동일한 기능 > 제품이 달라서 사용법이 다르다.
//	public void push() {
//		System.out.println("클릭!");
//	}
	@Override
	public void click() {
		System.out.println("클릭!");
	}
	
}