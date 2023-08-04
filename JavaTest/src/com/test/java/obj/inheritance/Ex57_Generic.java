package com.test.java.obj.inheritance;

import java.util.Scanner;

public class Ex57_Generic {

	public static void main(String[] args) {
		
		//클래스
		//1. 클래스
		//2. 인터페이스
		//3. 추상 클래스
		//4. enum
		//5. 제네릭 클래스
		
		
		//요구사항) 클래스 설계
		//1. 멤버 변수 선언 > int
		//2. 멤버 변수를 중심으로 여러가지 행동을 하는 메소드 선언
		
		WrapperInt n1 = new WrapperInt(100);
		System.out.println(n1.toString());
		System.out.println(n1.getData() * 2);
		System.out.println();
		
		
		//추가사항) String 중심으로 하는 클래스 설계 + 나머지 업무는 동일
		WrapperString s1 = new WrapperString("홍길동");
		System.out.println(s1.toString());
		System.out.println(s1.getData().length());
		System.out.println();
		
		
		//추가사항) boolean 중심으로 하는 클래스 설계 + 나머지 업무는 동일
		WrapperBoolean b1 = new WrapperBoolean(true);
		System.out.println(b1.toString());
		System.out.println(b1.getData() ? "참" : "거짓");
		System.out.println();
		
		
		//위의 문제점 > 해결방안
		//1. Object 클래스 > 오래된 방식으로 현재까지 계속 쓰이고 있다.
		//2. 제네릭 클래스 > 최신 방식(2014)으로 object방식보다 조금 더 빈도 수가 높다. / Object의 단점을 보완함.
		

		//Object 변수 > 만능 주머니(모든 자료형을 담을 수 있는 변수)
		
		Object o1 = new Object();
		
		//업캐스팅(형변환)
		Object o2 = new Hong();		
		Object o3 = new Scanner(System.in);
		Object o4 = new WrapperInt(100);
		Object o5 = "홍길동";	//String도 클래스이므로 가능하다.
		//--------------------------------
		//(형변환)참조형 = 값형
		//***절대 값형과 참조형간 형변환 불가능
		//오토박싱(Boxing) 현상으로 형변환 가능해짐
		//- 자동으로 값형을 참조형으로 바꾼다음 형변환 진행
		Object o6 = 10;		// (오른쪽 구문) = new Integer(10);
		Object o7 = true;
		
//		System.out.println(o6 * 2);	//참조형으로 변환되었기에 연산이 안됨.
		System.out.println((int)o6 * 2);	//언박싱 : 박스 속 숫자를 돌려줌
		
//		Integer num = new Integer(10);
//		System.out.println(num+10);
		
		//Object 단점 : 내가 o3에 어떤 자료형을 넣었는지 매번 확인이 필요하다.
//		((Scanner)o3).nextLine();
		
		//컴파일 에러 : ClassCastException 발생
//		((Scanner)o4).nextLine();
		
		System.out.println();
		
		WrapperObject ob1 = new WrapperObject(10);
		System.out.println(ob1.toString());
		System.out.println((int)ob1.getData()*10);
		System.out.println();
		
		WrapperObject ob2 = new WrapperObject("홍길동");
		System.out.println(ob2.toString());
		System.out.println(((String)ob2.getData()).length());
		System.out.println();
		
		WrapperObject ob3 = new WrapperObject(false);
		System.out.println(ob3.toString());
		System.out.println((boolean)ob3.getData() ? "참" : "거짓");
		System.out.println();
		
		//제네릭 클래스
		Wrapper<Integer> n3 = new Wrapper<Integer>(300);
		System.out.println(n3.toString());
		System.out.println(n3.getData()*2);
		System.out.println();
		
		Wrapper<String> s3 = new Wrapper<String>("이순신");
		System.out.println(s3.toString());
		System.out.println(s3.getData().length());
		
		Wrapper<Boolean> b3 = new Wrapper<Boolean>(true);
		System.out.println(b3.toString());
		System.out.println(b3.getData() ? "참" : "거짓");
		
	}
	
}


class WrapperInt {
	
	private int data;	//1. 클래스 중심
	
	//2. data 중심
	public WrapperInt(int data) {
		this.setData(data);
		
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
}

class WrapperString {
		
		private String data;	//1. 클래스 중심
		
		//2. data 중심
		public WrapperString(String data) {
			this.setData(data);
			
		}
		
		public String getData() {
			return data;
		}
		
		public void setData(String data) {
			this.data = data;
		}
		
		@Override
		public String toString() {
			return "[data=" + data + "]";
		}
		
}

class WrapperBoolean {
	
	private boolean data;	//1. 클래스 중심
	
	//2. data 중심
	public WrapperBoolean(boolean data) {
		this.setData(data);
		
	}
	
	public boolean getData() {
		return data;
	}
	
	public void setData(boolean data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
	
}

class WrapperObject{
	
	private Object data;	//모든 자료형을 받을 수 있다.
	
	public WrapperObject(Object data) {
		this.setData(data);
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
	
	
}


class Wrapper<T> {
	
	private T data;
	
	public Wrapper(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Wrapper [data=" + data + "]";
	}
	
	
	
}



