package com.test.question.Q099;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		this.hour=0;
		this.minute=0;
		this.second=0;
	}
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		
		if (minute >= 60) {
			this.hour += minute / 60;
			this.minute += minute % 60;
		} else {
			this.minute = minute;
		}
		
		if (second >= 60) {
			this.hour += second / 3600;
			this.minute += (second /60) % 60;
			this.second += second % 60;
		} else {
			this.second = second;
		}
		
	}
	
	public Time(int minute, int second) {
		this(0, minute, second);
	}
	
	public Time(int second) {
		this(0,0,second);
	}
	
	public String info() {
		return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
		
	}
	
}
