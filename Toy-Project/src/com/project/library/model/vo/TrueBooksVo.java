package com.project.library.model.vo;

public class TrueBooksVo {

	//ISBN, 도서명, 저자, 출판사, 위치
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private String location;
	
	public TrueBooksVo(String isbn, String title, String author, String publisher, String location) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.location = location;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "TrueBooksVo [isbn=" + isbn + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", location=" + location + "]";
	}
	
}