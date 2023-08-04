package com.test.question.Q097;

import java.util.Calendar;

public class Item {

	private String name;
	private Calendar expiration;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Calendar getExpiration() {
		return expiration;
	}
	public void setExpiration(String date) {
		Calendar c1 = Calendar.getInstance();
		
		c1.set(Integer.parseInt(date.substring(0,4)), 
				Integer.parseInt(date.substring(5,7))-1,
				Integer.parseInt(date.substring(8,10)));
		
		this.expiration = c1;
	}
	
	

}
