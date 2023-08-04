package com.test.question.Q100;

public class BallPointPen {
	private double thickness;
	private String color;

	public double getThickness() {
		return thickness;
	}

	public void setThickness(double d) {
		
		double[] thicknessAry = {0.3, 0.5, 0.7, 1, 1.5};
		
		for (int i=0; i<thicknessAry.length; i++) {
			if (d==thicknessAry[i]) {
				this.thickness = d;
				Packer.ballPoinPenCount++;
				
			}
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		//red, blue, green, black
		String[] colorAry = {"red", "blue", "green", "black"};
		
		for (int i=0; i<colorAry.length; i++) {
			if (color.equals(colorAry[i])) {
				this.color = color;
				
			}
		}
	}

	
	public String info() {
		return this.color + " 색상 " + this.thickness + "mm 볼펜입니다.";
	}
	
	
}
