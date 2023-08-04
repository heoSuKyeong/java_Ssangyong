package com.test.java.obj;

import java.util.Calendar;

public class Ex39_Access {
	
	public static void main(String[] args) {
		
		/*
		
		접근 지정자(제어자), Access Modifier
		- 클래스 멤버(멤버 변수, 멤버 메소드)에 붙여서 사용한다. 
		- 클래스 자체에 붙여서 사용한다.
		- 지역 변수에는 사용이 불가능하다.
		- 클래스(객체)의 영역을 기준으로, 외부에 해당 멤버를 어떻게 노출할지 통제하는 역할 > 보안 수준을 제어한다.
		
		1. public 
		2. private
		3. protected
		4. default 
		
		*/
		
		Box box = new Box();
		
		box.color = "갈색";		//public
//		box.size = 100;			//private
		
//		box.aaa();
//		box.bbb();
		
		
		//Book 객체
		Book book = new Book();
		
		//Book 클래스 변수를 private으로 설정하여 직접 접근 불가능//
//		book.title = "자바의 정석";
//		book.author = "홍길동";
//		book.publisher = "도우출판";
//		book.price = 3000;
//		book.page = 1000;
		
//		int temp = 30000;
//		
//		if (temp >= 00 && temp <=100000) {	//유효성검사
//			book.price = temp;
//		} 
		
//		System.out.println(book.price);
		
		book.aaa("자바의 정석");
		book.bbb(1110000);		// Setter : 쓰기작업
		System.out.println("책 가격: " + book.ccc());		//Getter : 읽기작업
		
		System.out.println();
		
		book.setTitle("자바의 정석");
		System.out.println("책 가격: " + book.getTitle());
		
		
		
		Mouse m1 = new Mouse();
		
		m1.setModel("M910");
		System.out.println(m1.getModel());
		
		//쓰기전용
		
		
		//읽기전용
		System.out.println(m1.getColor());
		
		// Getter / Setter 역할
		//1. private 멤버는 인터페이스 역할을 한다.
		//2. 읽기 전용 멤버, 쓰기 전용 멤버
		
//		Calendar date = Calendar.getInstance();
//		date.add(Calendar.YEAR, -3);
//		
//		m1.setDate(date);
//		
//		System.out.printf("마우스 제조년원일: %tF\n", m1.getDate());
//		System.out.println(m1.getState());
		
		m1.setDate(2020, 7, 31);
		System.out.println(m1.getDate());
		
		System.out.println();
		
		//개발자가 객채의 상태를 확인하고 싶을 때 사용하는 메소드 > dump
		System.out.println(m1.info());
	}
	
}


