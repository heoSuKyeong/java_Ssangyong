package com.test.java.obj.cast;

public class Ex55_Casting {
	
	public static void main(String[] args) {
		/*
		
		형변환, Type Casting
		
		1. 값형 형변환
			- 값형끼리 형변환(boolean 제외)
			- 숫자형끼리 형변환
			
		2. 참조형 형변환
			- 참조형끼리 형변환
			- 클래스끼리 형변환
		
		
		참조형 형변환
		- 상속 관계의 클래스간 형변환만 지원한다.
		- 직계(직선관계)끼리만 가능(방계(형제)는 불가능)
		- A클래스 > B클래스 변환
		
		
		1. 업캐스팅, Up Casting
			- 암시적 형변환
			- 100% 안전하다.
			- 자식 클래스 타입을 부모 클래스 타입으로 변환
		
		2. 다운캐스팅, Down Casting
			- 명시적 형변환
			- 불안정하다. > 원래는 100% 불가능하다.
			- 부모 클래스 타입을 자식 클래스 타입으로 변환
			
		*/
		
		Parent p1;
		Child c1;
		
		c1 = new Child();
		
		//복사
		//Parent = Child
		//암시적 형변환
		//업캐스팅(***)
		
		p1 = c1;
		p1 = (Parent)c1;
		
		
		//복사 후 검증 방법 
		//- 복사된 참조변수의 모든 멤버에 접근 가능한지 테스트 해본다.
		p1.a = 10;
//		p1.b = 20;
		System.out.println(p1.a);
//		System.out.println(p1.b);
		
//		p1.c = 30;
		
		Parent p2;
		Child c2;
		
		//Parent cannot be cast to class com.test.java.obj.cast.Child
		//캐스팅 불가하다.
		p2 = new Parent();
		
		//Child = Parent
		//명시적 형변환
		//다운캐스팅
//		c2 = (Child)p2;
		
//		c2.a = 10;
//		c2.c = 30;
//		c2.d = 40;
//		System.out.println(c2.a);
//		System.out.println(c2.c);
//		System.out.println(c2.d);
		
		Parent p3;
		Child c3;
		
		c3 = new Child();
		
		//업캐스팅
		p3 = c3;
		
		Child c4;
		
		//다운캐스팅 > 100% 불가능하지만 아래처럼 사용가능
		//업 캐스팅 후 다운 캐스팅
		c4 = (Child)p3;
		
		c4.a = 10;
		c4.c = 30;
		
		System.out.println(c4.a);
		System.out.println(c4.c);
		
		
	}

}


class Parent {
	
	public int a;
	public int b;
	
	
}


class Child extends Parent{
	
	public int c;
	public int d;
	
	
}