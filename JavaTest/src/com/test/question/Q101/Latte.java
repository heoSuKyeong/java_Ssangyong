package com.test.question.Q101;

public class Latte {
	private int bean;
	private int milk;
	
	public void drink() {
		System.out.printf("원두 %dg, 우유 %dml으로 만들어진 라테를 마십니다.\n", this.bean, this.milk);
	}

	public int getBean() {
		return bean;
	}

	public void setBean(int bean) {
		Coffee.bean += bean;
		this.bean = bean;
	}

	public int getMilk() {
		return milk;
	}

	public void setMilk(int milk) {
		Coffee.milk += milk;
		this.milk = milk;
	}
	
	
	
}
