package com.test.java.obj.inheritance;

public class Ex47_Overriding {
	public static void main(String[] args) {
		
		/*
		메소드 오버로딩
		- 인자 리스트의 변화를 주어 동일한 메소드 이름을 n개 생성하는 것.
		
		메소드 오버라이딩
		- 클래스 상속 시에 발생
		- 메소드 재정의 > 상속받은 메소드를 덮어쓰는 기술
		
		*/
		
		OverrideParent hong = new OverrideParent();
		
		hong.name = "홍길동";
		hong.hello();
		
		OverrideChild jhong = new OverrideChild();
		
		jhong.name = "홍철수";
		jhong.hello();
//		jhong.hi();
		
		
	}
}


//상황) 동네사람들에게 인사
class OverrideParent {
	
	public String name;
	
	public void hello() {
		System.out.printf("안녕하세요. 좋은 아침입니다. 저는 %s입니다.\n", this.name);
	}
	
}

class OverrideChild extends OverrideParent {
	
	//홍길동의 자식 홍철수
	//아빠의 인사방식 불만, 나만의 인사방식을 갖고싶다.
	//부모 클래스가 물려준 hello()를 사용하기 싫다.
	//***클래스 상속은 부모가 물려준 멤버를 자식이 거부할 방법이 없다.
	
//	public void hi() {
//		System.out.printf("하이~ %s라고해", this.name);
//	}
	
	//무조건 자식(더 작은 범위)이 우선이다. 자식의 hello()가 호출
	public void hello() {
		System.out.printf("하이~ %s라고해", this.name);
	}
	
	
	
}