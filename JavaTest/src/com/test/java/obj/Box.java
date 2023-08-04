package com.test.java.obj;

public class Box {

	
	//public : 해달 클래스 외부에 이 멤버를 공개하겠다.
	public String color;
	
	//private : 해당 클래스 외부에 이 멤버를 비공개하겠다. > 존재자체를 모른다.
	//사용하는 이유
	// - 위험해서
	// - 공개할 필요가 없어서
	private int size;
	
	
	public void aaa() {
		
		//같은 클래스 내부에서 멤버끼리는 접근 지정자가 동작하지 않는다.
		
		System.out.println("aaa");
		
		color = "노랑";
	}
	
	public void bbb() {
		System.out.println("bbb");
		
		size = 200;
				
	}
	
	
}
