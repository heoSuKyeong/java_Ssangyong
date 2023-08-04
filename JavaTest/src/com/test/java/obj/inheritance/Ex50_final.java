package com.test.java.obj.inheritance;

import java.util.Calendar;

public class Ex50_final {
	public static void main(String[] args) {
		/*
		final 키워드
		- 한번 결정하면 바꿀 수 없다.
		- 수정 가능한 경우의 수를 줄여 안정성을 높인다.
		
		1. 변수 적용(지역 변수, 멤버 변수)
			- 초기화 이후 값을 변경할 수 없다.
			- ==상수
		
		2. 메소드 적용
			- 상속에서만 할 수 있음.
			- 오버라이드 금지를 뜻함.
			- 부모메소드를 수정하지 못하게 한다.
			
		3. 클래스 적용
			- 상속에서만 할 수 있음
			- 부모 클래스를 수정하기 못하게 한다. > 상속을 불가능
		*/
		
		//지역 변수
		
		int a =10;
		a =20;
		
		//final 변수 = 상수
		final int b = 10;	// 선언과 초기화 함께 적는 걸 권장
//		b = 20;	//The final local variable b cannot be assigned. It must be blank and not using a compound assignment
		
		//비권장사항 > 변수처럼 보인다.
		final int c;
		c=10;	//초기화 가능
//		c=20;	//초기화 이후 수정 불가능
		
		
		Test t = new Test();
		t.a=20;
//		t.b=30;	//The final field Test.b cannot be assigned
		
		
		test(100);	//매개변수도 가능
	
		
		System.out.println(Calendar.YEAR);	//캘린더 상수
//		Calendar.YEAR=2;
		
		int gender;
		//숫자는 의미를 가지지 않음
		gender = 1;
		gender = 2;
		
		//의미는 가지나, 지역변수로밖에 활용을 못한다.
		final int MALE = 1;
		final int FEMALE = 2;
		
		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMALE);
		
	}
	
	//매개변수도 가능
	public static void test(final int a) {
		System.out.println(a);
//		a=200;
	}
	
}

class Test {
	public int a =10;
	public final int b = 20; //멤버 변수
	
}

//남자(1), 여자(2) > 열거값
class Gender {
	
	public final static int MALE = 1;
	public final static int FEMALE = 2;
	
}


class FinalParent {
	
	//부모 클래스 설계
	//- test() > 나중에 상속받은 자식 클래스가 이 test() 메소드를 재정의하면 안됨
	final public void test() {
		System.out.println("부모 메소드");
	}
	
}

class FinalChild extends FinalParent {
//	public void test() {
	
//	}
	
}


//부모 클래스 설계 중 일 때 상속 불가능하게 설정
final class FinalMember {
	
	
}

//class FinalUser extends FinalMember {
//	
//	
//}



