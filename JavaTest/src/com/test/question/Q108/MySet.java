package com.test.question.Q108;

import java.util.Arrays;

public class MySet {
	private String[] list;
	private int index;
	public static int num;
	
	static {
		num =0;
	}
	
	public MySet() {
		this.list = new String[4];
		this.index=0;
	}

	public boolean add(String value) {
		
		try {
			if(checkLength()) {
				doubleList();
			}
			
			//중복된 값이라면 에러 발생
			if(isDuplication(value)) {
				throw new Exception();
			}
			
			this.list[this.index] = value;
			
			this.index++;
			
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}

	private boolean isDuplication(String value) {
		
		for(int i=0; i<this.index; i++) {
			if (this.list[i].equals(value)) {
				return true;
			}
		}
		
		return false;
	}

	private boolean checkLength() {

		if(this.list.length == this.index) {
			return true;
		}
		
		return false;
	}

	private void doubleList() {
		
		String[] temp = new String[this.list.length * 2];
		
		for (int i=0; i<this.list.length; i++) {
			temp[i] = this.list[i];
		}
		
		this.list = temp;
		
	}
	
	public int size() {
		return this.index;
	}
	
	public boolean remove(String value) {
		
		//배열에 해당 데이터가 있는지 확인
		for(int i=0; i<this.index; i++) {
			if (this.list[i].equals(value)) {
				//있다면 > left shift
				this.list[i] = this.list[i+1];
				this.index--;
				return true;
			}
		}
		return false;
		
	}
	
	public void clear() {
		this.index=0;
	}
	
	public boolean hasNext() {
		
		if (MySet.num<this.index) {
			return true;
		}
		return false;
	}
	
	public String next() {
		
		return this.list[MySet.num++];
		
	}

	@Override
	public String toString() {
		return String.format("%s num = %d", Arrays.toString(list), MySet.num);
		
	}
	
	
	
}
