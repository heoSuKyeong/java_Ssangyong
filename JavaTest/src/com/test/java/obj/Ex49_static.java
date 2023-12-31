package com.test.java.obj;

public class Ex49_static {
	public static void main(String[] args) {
		
		//요구사항)
		//1. 펜을 생산하시오.
		//2. 생산된 펜의 개수를 세시오.
		
		/*
		//Case 1.
		//- Pen 객체(클래스)와 count 간의 관계가 약하다.
		//- 오차 발생(count++ 누락) 가능성이 높다.
		int count =0;
		
		Pen p1 = new Pen("Monami", "black");
		count++;
		
		Pen p2 = new Pen("Monami", "black");
		count++;
		
		Pen p3 = new Pen("Monami", "black");
		count++;
		
		System.out.println("펜 개수: " + count);
		*/
		
		/*
		//Case 2.
		//- Pen과 count간의 결합을 강하게
		//- 객체 변수가 여러개 발생하고 그 중 1개만 사용한다면 왜 그 객체의 count를 사용하는지 당위성이 없다.
		Pen p1 = new Pen("Monami", "black");
		p1.count++;
		
		Pen p2 = new Pen("Monami", "black");
		p1.count++;
		
		Pen p3 = new Pen("Monami", "black");
		p1.count++;
		*/
		
		/*
		//Case 3.
		//- Pen과 count 간의 관계를 강하게
		//- count 변수 딱 1개 만들기
		//- 여전히 오차 발생 가능성이 높다.
		Pen p1 = new Pen("Monami", "black");
		Pen.count++;
		
		Pen p2 = new Pen("Monami", "black");
		Pen.count++;
		
		Pen p3 = new Pen("Monami", "black");
		Pen.count++;
		
		System.out.println("펜 개수: " + Pen.count);
		*/
		
		//Case 4.
		//- count기능을 생성자에서 구현
		Pen p1 = new Pen("Monami", "black");
		Pen p2 = new Pen("Monami", "black");
		Pen p3 = new Pen("Monami", "black");
		Pen p4 = new Pen("Monami", "black");
		
		System.out.println("펜 개수: " + Pen.count);
		
		
	}
}


class Pen {

	public static int count =0;
//	public int count =0;
	
	private String model;
	private String color;
	
	public Pen(String model, String color) {
		Pen.count++;
		this.model = model;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Pen [model=" + model + ", color=" + color + "]";
	}

}

