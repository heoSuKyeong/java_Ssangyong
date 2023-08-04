package com.test.question.Q100;

public class Pencil {
	
	//흑연 등급(4B, 3B, 2B, B, HB, H, 2H, 3H, 4H)
	private String hardness;
	
	public String getHardness() {
		return hardness;
	}

	public void setHardness(String hardness) {
		this.hardness = hardness;
		
		
	}


	public String info() {
		return String.format("%s 진하기 연필입니다", this.hardness);
	}

	
	
	
	
}
