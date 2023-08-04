package com.test.question.Q093;

public class Note {

	private String size;
	private String color;
	private int page;
	private String owner;
	private int price;
	private boolean isOk = true;

	// setter, getter 구현

	public String info() {
		
		String temp = "■■■■■■ 노트 정보 ■■■■■■";
		
		if (this.owner != null) {
			
			String thick = "";
			thick = getThick(this.page);
			
			getPrice(this.size, this.color, this.page);
			
			
			temp += String.format("\n소유자: %s\n", this.owner);
			temp += String.format("특성 %s %s %s노트\n", this.color,thick , this.size);
			temp += String.format("가격: %,d원\n", this.price);
			
			
		} else {
			temp += "\n주인 없는 노트\n";
			
		}
		temp += "■■■■■■■■■■■■■■■■■■■■■■";
		System.out.println();
		
		return temp;
		
	}

	private void getPrice(String size, String color, int page) {
		// TODO Auto-generated method stub
		
		//기본 노트 : A5 + 흰색 + 10페이지 = 가격(500원)
		this.price = 500;
		
		switch (size) {
		case "A3":
			this.price += 400;
			break;
		case "A4":
			this.price += 200;
			break;
		case "B3":
			this.price += 500;
			break;
		case "B4":
			this.price += 300;
			break;
		case "B5":
			this.price += 100;
			break;

		default:
			break;
		}
		
		switch (color) {
		case "검정색":
			this.price += 100;
			break;
		case "노란색":
			this.price += 200;
			break;
		case "파란색":
			this.price += 200;
			break;

		default:
			break;
		}
		
		// 페이지 당 x 10원 추가
		if (page > 10) {
			this.price += (page-10)*10;
		}
		
	}

	private String getThick(int page) {
		// TODO Auto-generated method stub
		
		String thick = "";
		
		if (page >= 10 && page <=50) {
			thick = "얇은";
		} else if (page >=51 && page <=100) {
			thick = "보통";
		} else if (page >=101 && page<=200) {
			thick = "두꺼운";
		} else {
			thick = "x";
		}
		
		return thick;
	}

	public void setSize(String size) {
		String[] paperSize = {"A3", "A4", "A5", "B3", "B4", "B5"};
		
		for (int i=0; i<paperSize.length; i++) {
			if (size.equals(paperSize[i])) {
				this.size = size;
			}
		}
		
		if (this.size==null) {
			System.out.println("종이 사이즈는 A3, A4, A5, B3, B4, B5만 가능합니다. 기본 사이즈 A5로 설정됩니다.");
			this.size = "A5";
			
		}
		
	}

	public void setColor(String color) {
		String[] colorList = {"검정색", "흰색", "노란색", "파란색"};
		
		for (int i=0; i<colorList.length; i++) {
			if (color.equals(colorList[i])) {
				this.color = color;
			}
		}
		
		if(this.color==null) {
			System.out.println("표지 색상은 검정색, 흰색, 노란색, 파란색만 가능합니다. 기본 색상 흰색으로 설정됩니다.");
			this.color = "흰색";
			
		}
		
	}

	public void setPage(int page) {
		if (page < 10 || page > 200) {
			System.out.println("10~200 페이지 이내로 설정해주세요.");
			this.page = 10;
		} else {
			
			this.page = page;
		}
	}

	public void setOwner(String owner) {
		if (owner.length() >=2 && owner.length() <=5) {
			this.owner = owner;
			
		} else {
			this.isOk = false;
		}
	}

}
