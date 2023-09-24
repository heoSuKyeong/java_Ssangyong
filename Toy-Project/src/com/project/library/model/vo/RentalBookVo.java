package com.project.library.model.vo;

public class RentalBookVo {

	private int rentalNo;
	private String userNo;
	private String isbn;
	private String rentalDate;
	private String returnDate;
	private String returnFlag;
	
	public RentalBookVo(int rentalNo, String userNo, String isbn, String rentalDate, String returnDate, String returnFlag) {
		super();
		this.rentalNo = rentalNo;
		this.userNo = userNo;
		this.isbn = isbn;
		this.rentalDate = rentalDate;
		this.returnDate = returnDate;
		this.returnFlag = returnFlag;
	}
	public int getRentalNo() {
		return rentalNo;
	}
	public void setRentalNo(int rentalNo) {
		this.rentalNo = rentalNo;
	}
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getRentalDate() {
		return rentalDate;
	}
	public void setRentalDate(String rentalDate) {
		this.rentalDate = rentalDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public String getReturnFlag() {
		return returnFlag;
	}
	public void setReturnFlag(String returnFlag) {
		this.returnFlag = returnFlag;
	}
	
	@Override
	public String toString() {
		return "RentalBookVo [rentalNo=" + rentalNo + ", userNo=" + userNo + ", isbn=" + isbn + ", rentalDate=" + rentalDate
				+ ", returnDate=" + returnDate + ", returnFlag=" + returnFlag + "]";
	}
	
	
}
