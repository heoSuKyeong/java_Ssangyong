package com.test.java.obj.inheritance;

public class Ex45_Inheritance {
	
	public static void main(String[] args) {
		
		/*
		상속, Inheritance
		- 부모가 가지는 재산을 자식에게 물려주는 행동
		- 부모 클래스가 가지는 재산(변수, 메소드)을 자식 클래스에게 물려주는 행동
		- 자식 클래스가 코드를 구현하지 않아도, 부모 클래스로부터 구현된 코드를 물려받는 행동
		- 코드 재사용 > 비용 절감
		
		상속관계에 있는 클래스 호칭
		1. 부모 <- 자식
		2. 슈퍼 <- 서브
		3. 기본 <- 확장
		4. 기본 <- 파생
		
		*/
		
		Parent p = new Parent();
		
		p.a = 10;
		p.b = 20;
		
		
		Child c = new Child();
		
		c.a = 20;	//부모클래스에서 물러준 멤버;
		c.b = 30;
		c.aaa();
		c.ccc();
		
	}
	
}

class Parent {
	public int a;
	public int b;
	
	public void aaa() {
		System.out.println("aaa");
	}
	
	
}

class Child extends Parent {
	public int c;
	public int d;
	
	public void ccc() {
		System.out.println("ccc");
	}
	
}

//회원 관리 클래스
//1. 일반 회원 : 이름, 아이디, 암호, 이메일
//2. 관리자 회원 : 이름, 아이디, 암호, 등급

//부모클래스
class Member {
	public String name;
	public String id;
	public String pw;
	
}

//일반회원
class User extends Member{
	
	public String email;
	
	
}

//관리자 회원
class Adminstrator extends Member{

	public String lv;
	
	
}


class AAA {
	public int a = 10;
}

class BBB extends AAA {
	
}

class CCC extends BBB {
	public int c = 30;
}





