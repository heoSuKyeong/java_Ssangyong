package com.test.question.Q100;

public class Ruler {
	private int length; 
	private String shape;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		
		int[] lengthAry = {30,50,100};
		
		for (int i=0; i<lengthAry.length; i++) {
			if (length==lengthAry[i]) {
				this.length = length;
				
			}
		}
		
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		
		String[] shapeAry = {"줄자", "운형자", "삼각자"};
		
		for (int i=0; i<shapeAry.length; i++) {
			if (shape.equals(shapeAry[i])) {
				this.shape = shape;
				Packer.rulerCount++;
			}
		}
		
	}

	public String info() {
		return String.format("%dcm %s입니다.", this.length, this.shape);
	}
	
	
}
