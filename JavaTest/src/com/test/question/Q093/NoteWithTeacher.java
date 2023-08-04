package com.test.question.Q093;

public class NoteWithTeacher {

	private String size;
	private String color;
	private int page;
	private String owner;
	private int price = 500;	//기본가격
	
	private String thickness;
	
	
	

	// setter, getter 구현

	public void setSize(String size) {
		
		//A3, A4, A5, B3, B4, B5

		if (size.equals("A3") 
				|| size.equals("A4") 
				|| size.equals("A5") 
				|| size.equals("B3") 
				|| size.equals("B4") 
				|| size.equals("B5")) {
			this.size = size;
			
			if (size.equals("A3")) {
				price += 400;
			} else if (size.equals("A4")) {
				price += 200;
			} else if (size.equals("A5")) {
				price += 200;
			} else if (size.equals("B3")) {
				price += 500;
			} else if (size.equals("B4")) {
				price += 300;
			} else if (size.equals("B5")) {
				price += 100;
			}
		}
	}


	public void setColor(String color) {
		
		//검정색, 흰색, 노란색, 파란색
		if (color.equals("검정색") 
				|| color.equals("흰색") 
				|| color.equals("노란색") 
				|| color.equals("파란색")) {
			this.color = color;
			
			if (color.equals("검정색")) {
				this.price += 100;
			} else if (color.equals("노란색") || color.equals("파란색")) {
				this.price += 200;
			}
			
		} 
		
		
	}

	public void setPage(int page) {
		
		//10 ~ 200페이지 이내
		
		//조건에 맞는걸 검사
//		if (page >= 10 && page <= 200) {
//			this.page = page;
//		}
		
		//조건에 맞지 않는걸 검사 > 더 많이 사용된다.
		if (page < 10 || page >200) {
			return;
		}
		this.page = page;
		
		
		//10~50(얇다), 51 ~ 100(보통), 101 ~ 200(두껍다)
		if (page > 10 && page <= 50) {
			this.thickness = "얇은";
		} else if (page >= 51 && page <= 100) {
			this.thickness = "보통";
		} else {
			this.thickness = "뚜거운";
		}
		
		this.price += (page-10) * 10;
		
	}


	public void setOwner(String owner) {
		
		//유효성 검사
		//- 검사할 기준이 1개일 때 : 어느 것을 찾아도 상관없다.
		//- 검사할 기준이 n개일 때 : 잘못된 것을 찾는 것이 빠르다.
		
		//한글 2~5자이내. 필수값
		
		/*
		//올바른 
		if (owner.length() >= 2 && owner.length()<=5) {		//글자수
			//한글 검사
			boolean result = false;
			for (int i=0; i<owner.length(); i++) {
				char c = owner.charAt(i);
				if (c >= '가' && c <= '힣') {
					result = true;
				} else {
					result = false;
					break;
				}
			}
			if (result) this.owner = owner;
		}*/
		
		//잘못된 것을 찾기 > 조건이 독립적으로 관리된다.
		if(owner.length() <2 || owner.length() > 5) {
			return;
		}
		
		for (int i=0; i<owner.length(); i++) {
			char c = owner.charAt(i);
			
			if (c<'가' || c>'힣') {
				return;
			}
		}
		this.owner = owner;
		
	}

	
	public String info() {
		
		String temp = "";
		
		//문자열(null)
		//if(owner != null) > 연산자 사용(주소값비교)
		
		//문자열("")
		//if(owner.equals("")) > 메소드 사용(값비교)
		
		if (this.owner != null) {
			temp += "■■■■■■ 노트 정보 ■■■■■■\n";
			temp += "소유자 : " + this.owner + "\n";
			temp += String.format("특성 : %s %s %s노트\n", this.color, this.thickness, this.size);
			temp += String.format("가격 : %,d원\n", this.price);
			temp += "■■■■■■■■■■■■■■■■■■■■■■\n";
			
		} else {
			temp += "■■■■■■ 노트 정보 ■■■■■■\n";
			temp += "주인 없는 노트";
			temp += "■■■■■■■■■■■■■■■■■■■■■■\n";
			
		}
		return temp;
	}

}
