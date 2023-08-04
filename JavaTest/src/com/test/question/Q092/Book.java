package com.test.question.Q092;

public class Book {

	private String title;
	private int price;
	private String author;
	private String publisher;
	private String pubYear = "2019";
	private String isbn;
	private int page;

	// getter, setter

	public String info() {
		String temp = "";
		temp += String.format("제목: %s\n", this.title);
		temp += String.format("가격: %,d원\n", this.price);
		temp += String.format("저자: %s\n", this.author);
		temp += String.format("출판사: %s\n", this.publisher);
		temp += String.format("발행년도: %s년\n", this.pubYear);
		temp += String.format("ISBN: %s\n", this.isbn);
		temp += String.format("페이지: %,d장\n", this.page);
		
		return temp;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		boolean isState = true;
		
		if (title.length() > 50) {
			System.out.println("책 제목은 50글자까지 저장가능합니다.");
			this.title = title.substring(0, 50);
		}
		for (int i=0; i<title.length(); i++) {
			char c = title.charAt(i);
			if ((c >= '!' && c<='/') 
				|| (c>=':' && c<='@') 
				|| (c>='[' && c<='`')
				|| (c>='{' && c<='~')) {
				System.out.println("책 제목은 한글, 영어, 숫자, 공백만 입력할 수 있습니다.");
				isState = false;
			}
		}
		if(isState) this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (price < 0 || price > 1000000) {
			System.out.println("0원~1,000,000원 사이의 값을 입력해주세요.");
			this.price = 1000000;
		} else {
			this.price = price;

		}
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		if (page < 0) {
			System.out.println("1장 이상의 page를 입력해주세요.");
			this.page = page;
		} else {
			this.page = page;

		}
	}

	public String getPubYear() {
		return pubYear;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
