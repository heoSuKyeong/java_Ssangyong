package com.test.question.Q094;

import java.util.Calendar;

public class Bugles {

	private int price;
	private int weight;
	private Calendar creationTime;	//생산일자
	private int expiration;		//먹을 수 있는 날짜
//	private int expirationDate =0;	//용량 별 유통기한
	
	public int getPrice() {
		
		if (this.weight==850) {
			this.price = 1950;
			this.expiration = 7;
		} else if (this.weight==500) {
			this.price = 1200;
			this.expiration = 10;
		} else {
			this.price = 850;
			this.expiration = 15;
		}
		
		return price;
	}

	public int getExpiration() {
		
		//먹을수 있는 날짜 = 유통기한 - 현재 - 제조시간
		Calendar today = Calendar.getInstance();
//		this.expiration = this.expiration - (int)((today.getTimeInMillis() - this.creationTime.getTimeInMillis()) / 1000 / 60 / 60 /24);
//		
//		return this.expiration;
		
		return this.expiration - (int)((today.getTimeInMillis() - this.creationTime.getTimeInMillis()) / 1000 / 60 / 60 /24);
		
	}

	public void setSize(int weight) {
		int[] weightAry = {300, 500, 850};
		
		for (int i=0; i<weightAry.length; i++) {
			if (weight==weightAry[i]) {
				this.weight = weight;
			}
		}
		if (this.weight <= 0) {
			this.weight = 300;
			System.out.println("용량이 기준과 맞지 않습니다. 최소 용량 300g으로 설정됩니다.");
			
		}
	}

	public void setCreationTime(String date) {
		Calendar c1 = Calendar.getInstance();
		
		c1.set(Integer.parseInt(date.substring(0,4)), 
				Integer.parseInt(date.substring(5,7))-1,
				Integer.parseInt(date.substring(8,10)));
		
		this.creationTime = c1;
	}


	// getter, setter 구현

	public void eat() {
		
	}

}
