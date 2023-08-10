package com.test.java.obj.inheritance;

public class Ex68_super {
	
	public static void main(String[] args) {
		
		//this vs super
		//- 객체 지정 연산자
		//- this : 자기 자신
		//- super : 부모
		
//		CupParent p1 = new CupParent();
//		p1.check();
		
		CupChild c1 = new CupChild(10,20);
		c1.check();
	}
}


class CupParent {
	
	private int a=10;
	public int b=20;
	
	public void check() {
		System.out.println(this.a);
		System.out.println(this.b);
		
	}
}

class CupChild extends CupParent {
	
	private int c = 30;
	public int d = 40;
	
	public void check() {
		System.out.println(this.c);
		System.out.println(this.d);
		
		//System.out.println(this.a);	//private > 자식에게도 비공개
		//System.out.println(this.b);
		
		super.check();
	}

	public CupChild(int c, int d) {
		super();	//부모 생성자 호출(자동으로 호출되기에 코드 생략 가능)
		this.c = c;
		this.d = d;
	}
}


