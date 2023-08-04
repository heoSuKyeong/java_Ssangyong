package com.test.java.obj;

public class Ex40_Class {
	
	public static void main(String[] args) {
		
		//Person 클래스
		
		Person hong = new Person();
		
		hong.setName("홍길동");
		hong.setAge(20);
		hong.setGender("남자");
		
		Person father = new Person();
		
		father.setName("홍아빠");
		father.setAge(50);
		father.setGender("남자");
		
		Person mother = new Person();
		
		mother.setName("최엄마");
		mother.setAge(48);
		mother.setGender("여자");
		
		
		hong.setFather(father);
		hong.setMother(mother);
		
		System.out.println(hong.info());
		
		//java.lang.NullPointerException
		//*******에러 랭킹 1위(빈도수)
		// - 변수가 메소드의 주소값을 가지고 있지않음 혹은 변수가 null인 상황
				
//		System.out.println(father.info());
		
		
	}
	
	
}
