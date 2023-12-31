package com.test.question.Q105;

public class MyQueue {
	
	private String[] que;
	private int index;
	
	public MyQueue() {
		this.index=0;
		this.que = new String[4];
	}
	
	public boolean add(String value) {
		
		try {
			//생성자로 뺐음
//			if (this.index == 0) { // this.list ==null
//				this.que = new String[4];
//			}
			
//			배열의 방이 남아 있는지 확인, 없으면 두배로 늘리기
//			if(this.index == this.que.length) {
//				String[] temp = new String[this.que.length];
//				temp = this.que;
//				this.que = new String[this.que.length * 2];
//				for (int i=0; i<this.index; i++) {
//					this.que[i] = temp[i];
//				}
//				
//			}
			
			if(ckeckLength()) {
				doubleList();
			}
			
			this.que[this.index] = value;
			this.index++;
			
			return true;
			
		} catch (Exception e) {
			return false;
		}
		
	}
	
	private boolean ckeckLength() {
		
		if (this.index == this.que.length) {
			return true;
		}
		return false;
	}

	private void doubleList() {
		
		String temp[] = new String[this.que.length * 2];
		
		for (int i=0; i<this.que.length; i++) {
			temp[i] = que[i];
		}
		
		this.que = temp;
		
	}

	public String poll() {
		
		if (this.index<=0) {
			return "비었음";
		}
		
		String result = this.que[0];
		for (int i=0; i<index; i++) {
			this.que[i] = this.que[i+1];
		}
		
		this.index--;
		return result;
		
	}
	
	public int size() {
		return this.index;
	}
	
	public String peek() {
		if (this.index<=0) {
			return "비었음";
		}
		
		return this.que[0];
	}
	
	public void clear() {
		for (int i=0; i<this.index; i++) {
			this.que[i] = "";
		}
		this.index=0;
	}
	
	public void trimToSize() {
		
//		String[] temp = new String[this.que.length];
//		temp = this.que;
//		
//		this.que = new String[this.index];
//		
//		for (int i=0; i<this.index; i++) {
//			this.que[i] = temp[i];
//		}
		
		String[] temp = new String[this.index];
		
		for (int i=0; i<this.index; i++) {
			temp[i] = this.que[i];
		}
		
		this.que = temp;
		
	}
	
	
}
