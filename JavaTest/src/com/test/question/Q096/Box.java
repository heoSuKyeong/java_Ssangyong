package com.test.question.Q096;

public class Box {
	private Macaron[] list = new Macaron[10];
	String color[] = {"red", "blue", "yellow", "white", "pink", "purple", "green", "black"};
	int result[] = new int[list.length];
	
	public void cook() {
		int num=0;
		for (int i=0; i<this.list.length; i++) {
			
			//생산 색상
			String mColor = color[(int)(Math.random()*this.color.length)];
			
			//생산 크기(5cm ~ 15cm)
			int mSize = (int)(Math.random()*10)+5;
			
			//생산 샌드 두께(1mm ~ 20mm)
			int mThink = (int)(Math.random()*20)+1;
			
			Macaron macaron = new Macaron();
			macaron.setColor(mColor);
			macaron.setSize(mSize);
			macaron.setThickness(mThink);
			this.list[i] = macaron;
			num++;
		}
		
		System.out.println("마카롱을 "+ num +"개 만들었습니다.");
		
	}

	public void check() {
		int passCnt=0;
		
		
		for (int i=0; i<this.list.length; i++) {
			boolean isPass = true;
			
			//조건 1 : 판매 유효 크기(8cm ~ 14cm)
			if (this.list[i].getSize() < 8 || this.list[i].getSize() > 14) {
				isPass = false;
				continue;
			}
			//조건 3 : 판매 유효 두께(3mm ~ 18mm)
			if (this.list[i].getThickness() < 3 || this.list[i].getThickness() > 18) {
				isPass = false;
				continue;
			}
			//조건 2 : 판매 유효 색상(black을 제외한 모든 색상)
			if (this.list[i].getColor().equals("black")) {
				isPass = false;
			}
			
			if (isPass) {
				passCnt++;
				result[i] = 1;
			}
		}
		
		System.out.println("QC 합격 개수: " + passCnt + "개");
		System.out.println("QC 불합격 개수: " + (this.list.length-passCnt) + "개");
		
		
	}

	public void list() {
		
		for (int i=0; i<this.list.length; i++) {
			
			String pass = "";
			pass = (result[i] == 1) ? "합격" : "불합격";
			
			System.out.printf("%d번 마카롱 : %dcm(%s, %dmm) : %s\n"
					, i+1
					, this.list[i].getSize()
					, this.list[i].getColor()
					, this.list[i].getThickness()
					, pass);
		}
		
		
	}


}
