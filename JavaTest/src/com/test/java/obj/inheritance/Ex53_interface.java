package com.test.java.obj.inheritance;

public class Ex53_interface {
	public static void main(String[] args) {
		
		MxKeys mkey = new MxKeys();
		
		mkey.keyDown('i');
		mkey.powerOff();
		System.out.println("배터리 : " + mkey.checkBattery());
		
	}
}


//***Keyboard 는 객체를 생성할 수 없다. > 실체화할 수 없다.
interface Keyboard {
	
	//키보드로서 갖춰야할 행동들 정의(구현부 없이 선언부만 작성) > 호출할 때의 사용법
	//꼭 public 으로 사용해야 함. 따라서, public 생략 가능
	public void keyDown(char c);
	public void powerOn();
	void powerOff();
	int checkBattery();
	//static void aaa();
	
}


class MxKeys implements Keyboard {

	@Override
	public void keyDown(char c) {
		System.out.println(c + " 눌렀음");
	}

	@Override
	public void powerOn() {
		System.out.println("전원 켜짐");
	}

	@Override
	public void powerOff() {
		System.out.println("전원 꺼짐");
		
	}

	@Override
	public int checkBattery() {
		return 80;
	}
	
	
}