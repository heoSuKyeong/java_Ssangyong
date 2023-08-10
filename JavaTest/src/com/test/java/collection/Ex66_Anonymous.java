package com.test.java.collection;

public class Ex66_Anonymous {
	public static void main(String[] args) {
	
		/*
		익명 객체, Anonymous Object
		- 익명 클래스, Anonymous Class
		- 이름 없는 클래스
		- 단타성이 있을 때
		
		*/
		
		//요구사항) 인터페이스를 구현한 클래스 선언하여 객체 생성하여라.
		
		//1. 본입 타입으로 참조 변수 만들기
		BBB b1 = new BBB();
		b1.aaa();
		System.out.println();
		
		//2. 부모 타입(인터페이스)으로 참조 변수 만들기
		AAA b2 = new BBB();
		b2.aaa();
		System.out.println();
		
		//3.
		//AAA b3 = new AAA();	//인터페이스는 오브젝트로 만들 수 없다.
		//b3.aaa();
		
		//The type new AAA(){} must implement the inherited abstract method AAA.aaa()
		//클래스이름 생략되어 사용 > 익명 클래스
		//자동으로 AAA의 자식 클래스가 된다.
		AAA b3 = new AAA() {
			@Override
			public void aaa() {
				System.out.println("aaa");
			}
		};
		b3.aaa();
		
		
		//b2 vs b3
		//b2
		//- AAA 인터페이스 선언
		//- BBB 클래스 구현
		
		//b3
		//- AAA 인터페이스 선언
		//- 실명 클래스를 구현하지 않고, 익명 클래스를 구현
		
		//익명 클래스를 구현하는 이유
		//- 클래스 재사용성 때문에
		//- 익명 클래스 : 재사용 의사 없음
		//- 실명 클래스 : 재사용 의사 있음
		
		//클래스 사용 목적
		//- 객체 생성
		
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		//익명클래스 > 붕어빵을 딱 1개만 만들기위한 틀
		//클래스가 필요하긴하지만 한번만 사용하고 말것
		
		//현재 목적에 맞는 인터페이스를 타겟잡기 > AAA
		//업캐스팅의 특징으로 부모 객체 
		AAA t4 = new AAA() {
			//자식 클래스 선언
			@Override
			public void aaa() {
				
			}
		};
		
		
	}
}

class Test{
	public int a;
	public void ccc() {
		
	}
}


interface AAA {
	
	void aaa();
	
}

//class BBB implements AAA > 머리통 생략 가능
class BBB implements AAA {
	@Override
	public void aaa() {
		System.out.println("aaa");
	}
}
