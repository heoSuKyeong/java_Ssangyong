package com.test.question.Q100;

public class Eraser {
	private String size;
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		
		String[] sizeAry = {"Large", "Medium", "Small"};
		
		for (int i=0; i<sizeAry.length; i++) {
			if (size.equals(sizeAry[i])) {
				this.size = size;
				Packer.eraserCount++;
			}
		}
	}

	public String info() {
		return String.format("%s 사이즈 지우개입니다.", this.size);
	}
	
	
}
