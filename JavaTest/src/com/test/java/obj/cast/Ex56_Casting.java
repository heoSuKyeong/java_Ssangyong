package com.test.java.obj.cast;

public class Ex56_Casting {
	public static void main(String[] args) {
		
		//인터페이스와 업캐스팅
		//instanceof
		
		//프린터 기기
		//- LG500
		//- Hp600
		
		//interface 구현 전
//		LG500 lg = new LG500();
//		HP600 hp = new HP600();
//		
//		lg.on();
//		hp.powerOn();
		
		//interface 구현
		LG500 lg = new LG500();
		HP600 hp = new HP600();
		
		lg.powerOn();
		hp.powerOn();
		
		lg.print();
		hp.print();
		
		lg.powerOff();
		hp.powerOff();
		
		Printer p1;
		LG500 lg2 = new LG500();
		
		//부모 = 자식
		//업캐스팅
		p1 = lg2;
		
		Printer p2 = new HP600();
		
		Object o1 = new HP600();	//Object는 최상위 클래스
		
		
		//상황) 프린터 판매하는 대리점 운영
		//- 재고
		//		- LG500 X 5대
		//		- HP600 X 3대
		//- 데일리 업무
		//		- 프린터가 제대로 동작하는지 기능 확인
		
//		m1();
		
		//추가상황) LG500 x 500대, HP600 x 300대
//		m2();	//배열 사용
		
		//추가상황) BenQ700, Epson 브랜드 추가
		m3();	//인터페이스와 업캐스팅
		
		
	}

	private static void m3() {
		
		//하나의 배열로 여러가지 인터페이스를 통합할 수 있다.
		Printer[] ps = new Printer[8];
		
		//*** 서로 다른 클래스의 객체를 하나의 배열에 넣는다.
		//업캐스팅의 특징으로 가능하다.
		ps[0] = new LG500();
		ps[1] = new HP600();
		
		for (int i=0; i<ps.length; i++) {
			
			if(i<5) {
				ps[i] = new LG500();
			} else {
				ps[i] = new HP600();
			}
		}
		
		//데일리업무
		for (int i=0; i<ps.length; i++) {
			ps[i].print();
			
			//추가업무
			//- LG500 > selfTest()
			//- HP600 > clean()
			
			//a객체 instanceof b클래스 >(이항연산자) a객체가 b클래스 이냐
//			System.out.println(ps[i] instanceof LG500);
			
			//다운캐스팅
			if (ps[i] instanceof LG500) {
				((LG500)ps[i]).selfTest();	//캐스팅과 . 이 같이 있으면 .를 먼저 수행하기에 캐스팅 부분에 ()를 씌어준다.
				
			} else if (ps[i] instanceof HP600) {
				((HP600)ps[i]).clean();
			}
			
			
		}
		
		
	}

	private static void m2() {
		
		LG500[] lg = new LG500[5];
		
		for (int i=0; i<lg.length; i++) {
			lg[i] = new LG500();
		}
		
		HP600[] hp = new HP600[3];

		for (int i=0; i<hp.length; i++) {
			hp[i] = new HP600();
		}
		
		//데일리 업무
		for (int i=0; i<lg.length; i++) {
			lg[i].print();
		}
		
		for (int i=0; i<hp.length; i++) {
			hp[i].print();
		}
		
	}

	private static void m1() {

		//가장 단순한 방법, 비효율적
		LG500 lg1 = new LG500();
		LG500 lg2 = new LG500();
		LG500 lg3 = new LG500();
		LG500 lg4 = new LG500();
		LG500 lg5 = new LG500();
		
		HP600 hp1 = new HP600();
		HP600 hp2 = new HP600();
		HP600 hp3 = new HP600();
		
		//데일리 업무
		lg1.print();
		lg2.print();
		lg3.print();
		lg4.print();
		lg5.print();
		
		hp1.print();
		hp2.print();
		hp3.print();
		
	}
}

interface Printer {
	
	void print();
	void powerOn();
	void powerOff();
	
	
}

class LG500 implements Printer {
	
	private String type;
	private int price;

	public void print() {
		System.out.printf("%s 방식으로 출력합니다.\n", this.type);
	}
	
//	public void on() {
//		System.out.println("전원을 켭니다.");
//	}
//	
//	public void off() {
//		System.out.println("전원을 끕니다.");
//	}
	
	public void selfTest() {
		System.out.println("자가 점검을 합니다.");
	}

	@Override
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
}


class HP600 implements Printer {
	
	private String color;
	private int price;
	
//	public void printing() {
//		System.out.println("출력합니다.");
//		
//	}
	
	public void powerOn() {
		System.out.println("전원 켜짐");
	}
	
	public void powerOff() {
		System.out.println("전원 꺼짐");
	}
	
	public void clean() {
		System.out.println("헤더를 청소합니다.");
	}

	@Override
	public void print() {
		System.out.println("출력합니다.");
	}
	
	
}