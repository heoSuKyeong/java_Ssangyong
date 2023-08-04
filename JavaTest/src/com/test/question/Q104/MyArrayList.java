package com.test.question.Q104;

public class MyArrayList {
	
	//ArrayList<String> 으로 생각하고 만들기
	
	private String[] list;
	private int index;	//*****가장 중요한 역할
	
	public MyArrayList() {

		this.index=0;
		
	}
	
	public boolean add(String value) {
		
		try {
			if (this.index == 0) { // this.list ==null
				this.list = new String[4];

			}
			
//			배열의 방이 남아 있는지 확인, 없으면 두배로 늘리기
			if(this.index == this.list.length) {
				String[] temp = new String[this.list.length];
				temp = this.list;
				this.list = new String[this.list.length * 2];
				for (int i=0; i<this.index; i++) {
					this.list[i] = temp[i];
				}
				
			}
			
			
			this.list[this.index] = value;
			this.index++;
			
			return true;
			
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public String get(int index) {
		return this.list[index];
	}
	
	public int size() {
//		return this.list.length; > length 와 size 다름
		return this.index;
	}
	
	public String set(int index, String value) {
		this.list[index] = value;
		return this.list[index];
	}
	
	public String remove(int index) {
		String temp = this.list[index];
		//left shift
		for (int i=index; i<this.index; i++) {	//입력 인덱스부터 마지막 인덱스까지
			list[i] = list[i+1];			//왼쪽으로 이동
		}
//		list[this.index-1]="";	//마지막 방 삭제
		this.index--;
		return temp;
	}
	
	public boolean add(int index, String value) {
		
		try {
			//right shift
			for (int i=this.index; i>index; i--) {
				list[i] = list[i-1];
			}
			list[index] = value;
			this.index++;
			return true;
			
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public int indexOf(String value) {
		for (int i=0; i<this.index; i++) {
			if (value.equals(this.list[i])) {
				return i;
			}
		}
		return -1;	//찾지 못하면 -1 반환
	}
	
	public int lastIndexOf(String value) {
		for (int i=this.index-1; i>=0; i--) {
			if (value.equals(this.list[i])) {
				return i;
			}
		}
		return -1;
	}
	
	public void clear() {
		for (int i=0; i<this.index; i++) {
			this.list[i] = "";
		}
		this.index=0;
	}
	
	public void trimToSize() {
//		this.index;
	}
	
	public String info() {
		String temp = "";
		
		for(int i=0; i<this.index; i++) {
			temp += list[i] + " ";
		}
		return temp+this.index;
	}
	
}
