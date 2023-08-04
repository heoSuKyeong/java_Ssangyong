package com.test.java.obj;

public class Ex37_Class {

	
	public static void main(String[] args) {
		
		User u1 = new User();
		
		u1.name = "홍길동";
		u1.age = 20;
		u1.hello();
		
		
		User u2 = new User();
		
		u2.name = "아무개";
		u2.age = 22;
		u2.hello();
		
		
		//행동 클래스 : 객체를 여러개 생산하지 않는다.
		MyMath m1 = new MyMath();
		
		m1.add(10, 20);
		m1.substract(500, 100);
		
	}
	
}

//클래스(객체) = 데이터 + 행동 으로 이루어짐
//클래스(객체) = 멤버 변수 + 메소드

class MyMath {
	
	//멤버 변수(x)
	//멤버 메소드(o)
	
	//객체간의 행동이 구분 불가능한, 개성이 없는 메소드
	public void add(int a, int b) {
		System.out.println(a + b);
		
	}
	
	public void substract(int a, int b) {
		System.out.println(a - b);
		
	}
	
}

class User {
	
	//클래스 멤버
	//1. 변수
	//2. 메소드
	
	public String name;
	public int age;
	
	//클래스 멤버 메소드
	// - 호출되는 객체에 따라 다른 결과가 발생해야 한다.
	// - ****** 멤버 변수를 활용해서 행동을 해야 한다.
	public void hello() {
		System.out.println("안녕하세요. 저는 " + name + "입니다.");
		
	}
	
}
