package com.test.java.obj;

public class Ex38_Class {
	
	public static void main(String[] args) {
		
		//학생 클래스 : 이름, 나이, 국어, 영어, 수학
		
		/*
			반드시 지킬 규칙
			- 파일의 이름과 클래스의 이름이 반드시 동일해야 한다.
			- 지키지않으면 컴파일 에러가 난다.
			
			클래스 선언시 권장 사항
			- 클래스 1개당 물리적인 파일 1개를 만든다.
			- 하나의 *.java안에 여러개의 클래스를 선언하지 말 것!
			
			한 파일내에서 2개의 클래스를 만들 때
			- 파일 내의 모든 클래스 중 public 키워드를 가지는 클래스는 반드시 딱 1개여야 한다.
			- public 클래스가 대표 클래스 역할을 한다. > 대표 클래스 이름이 파일명이 된다.
			- 클래스의 영역은 패키지이며, 클래스는 같은 패키지내에 동일한 이름을 2개 이상 가질 수 없다.
			- ***클래스의 영역은 물리적인 파일이 아니다.(Ex37_Class 파일과 Ex38_Class 파일 따로 보이지만, 두 파일 내의 클래스들은 같은 영역에 있음)
		
		*/
		
	}
	
	
}

//class Student {
//	
//	public String name;
//	public int age;
//	public int kor;
//	public int eng;
//	public int math;
//	
//}
