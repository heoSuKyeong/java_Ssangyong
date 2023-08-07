package com.test.question.Q106;

public class MyStack {
	private String[] stack;
	private int index;
	
	public MyStack() {
		this.index=0;
		this.stack = new String[4];
	}
	
	public boolean push(String value) {
		try {
			//생성자로 뺐음
//			if (this.index == 0) { 
//				this.stack = new String[4];
//			}
			
//			배열의 방이 남아 있는지 확인, 없으면 두배로 늘리기
//			if(this.index == this.stack.length) {
//				String[] temp = new String[this.stack.length];
//				temp = this.stack;
//				this.stack = new String[this.stack.length * 2];
//				for (int i=0; i<this.index; i++) {
//					this.stack[i] = temp[i];
//				}
//				
//			}
			
			if(checkLength()) {
				doubleList();
			}
			
			this.stack[this.index] = value;
			this.index++;
			
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	private boolean checkLength() {
		
		if (this.stack.length == this.index) {
			return true;
		}
		
		return false;
	}

	private void doubleList() {

		String[] temp = new String[this.stack.length * 2];
		
		for (int i=0; i<this.stack.length; i++) {
			temp[i] = this.stack[i];
		}
		this.stack = temp;
				
	}

	public String pop() {
		
		//인덱스 예외처리 해주기
		if (this.index <=0) {
			throw new IndexOutOfBoundsException();
		}
		
		String result = this.stack[this.index-1];
		this.index--;
		
		return result;
		
	}
	
	public int size() {
		return this.index;
	}
	
	public String peek() {
		
		if (this.index <=0) {
			throw new IndexOutOfBoundsException();
		}
		
		return this.stack[this.index-1];
	}
	
	public void clear() {
//		for (int i=0; i<this.index; i++) {
//			this.stack[i] = "";
//		}
		this.index=0;
	}
	
	public void trimToSize() {
		
		String[] temp = new String[this.index];
		
		for (int i=0; i<this.index; i++) {
			temp[i] = this.stack[i];
		}
		
		this.stack = temp;
	}
	
}
