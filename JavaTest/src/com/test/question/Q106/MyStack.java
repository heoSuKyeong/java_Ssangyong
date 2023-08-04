package com.test.question.Q106;

public class MyStack {
	private String[] stack;
	private int index;
	
	public MyStack() {
		this.index=0;
	}
	
	public boolean push(String value) {
		try {
			if (this.index == 0) { 
				this.stack = new String[4];
			}
			
//			배열의 방이 남아 있는지 확인, 없으면 두배로 늘리기
			if(this.index == this.stack.length) {
				String[] temp = new String[this.stack.length];
				temp = this.stack;
				this.stack = new String[this.stack.length * 2];
				for (int i=0; i<this.index; i++) {
					this.stack[i] = temp[i];
				}
				
			}
			
			this.stack[this.index] = value;
			this.index++;
			
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	public String pop() {
		
		String result = this.stack[this.index];
		
		this.stack[this.index] = "";
		this.index--;
		
		return result;
		
	}
	
	public int size() {
		return this.index;
	}
	
	public String peek() {
		return this.stack[this.index];
	}
	
	public void clear() {
		for (int i=0; i<this.index; i++) {
			this.stack[i] = "";
		}
		this.index=0;
	}
	
	public void trimTiSize() {
		
		String[] temp = new String[this.stack.length];
		temp = this.stack;
		
		this.stack = new String[this.index];
		
		for (int i=0; i<this.index; i++) {
			this.stack[i] = temp[i];
		}
	}
	
}
