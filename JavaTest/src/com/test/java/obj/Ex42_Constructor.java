package com.test.java.obj;

public class Ex42_Constructor {

	public static void main(String[] args) {
		
		/*
		생성자, Constructor
		- (특수한 목적을 갖는) 메소드
		- 멤버를 초기화하는 역할
		
		*/
		
		//자료명 변수명 = new 생성자();
		
		//1. new : 객체 생성 연산자로써 객체를 생성한다.
		//2. Cup()
		
		//new가 실행되면 생성자 코드를 통해 바로 yellow, 300로 초기화됨
		Cup c1 = new Cup();
		
		//new가 실행되면 null, 0으로 초기화되었다가 아래 값으로 대입됨
		//c1.setColor("yellow");
		//c1.setSize(300);
		
		//모든 참조형(배열 포함)은 객체 생성 직후 자동으로 멤버가 초기화가 된다.
		System.out.println(c1.info());	//색상: null, 크기: 0
		
		
		Cup c2 = new Cup();
		c2.setColor("green");
		c2.setSize(500);
		System.out.println(c2.info());
		
		Cup c3 = new Cup("pink");
		System.out.println(c3.info());
		
		Cup c4 = new Cup(350);
		System.out.println(c4.info());
		
		Cup c5 = new Cup("orange", 3000);
		System.out.println(c5.info());
		
		//The method Cup() is undefined for the type Ex42_Constructor > Cup을 일반 메소드 취급
		//**생성자는 반드시 new와 함께 사용해야한다. > 생성자는 평생 딱 한번만 호출이 가능하다.
		//Cup();
		
	}
	
}
