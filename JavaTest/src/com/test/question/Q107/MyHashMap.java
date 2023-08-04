package com.test.question.Q107;

public class MyHashMap {
	private String[] mapKey;
	private String[] mapValue;
	private int index;
	
	public MyHashMap() {
		this.index=0;
	}
	
	public String put(String key, String value) {
		
		try {
			if (this.index == 0) {
				this.mapKey = new String[4];
				this.mapValue = new String[4];
			}
			if (this.index == this.mapKey.length) {

				String[] tempKey = new String[this.index];
				String[] tempValue = new String[this.index];

				tempKey = this.mapKey;
				tempValue = this.mapValue;

				this.mapKey = new String[this.index * 2];
				this.mapValue = new String[this.index * 2];

				for (int i = 0; i < this.index; i++) {
					this.mapKey[i] = tempKey[i];
					this.mapValue[i] = tempValue[i];
				}
			}
			this.mapKey[this.index] = key;
			this.mapValue[this.index] = value;
			
			this.index++;
			return null;
			
		} catch (Exception e) {
			return null;
		}
		
	}
	
	public String get(String key) {
		
		int i=-1;
		for (i=0; i<this.index; i++) {
			if (this.mapKey[i].equals(key)) {
				break;
			}
		}
		if (i>-1) {
			return this.mapValue[i];
		} else {
			return null;
		}
		
	}
	
	public int size() {
		return this.index;
	
	public String put(String key, String value) {
		
		int i=-1;
		for (i=0; i<this.index; i++) {
			if (this.mapKey[i].equals(key)) {
				break;
			}
		}
		String result = this.mapValue[i];
		this.mapValue[i] = value;
		
		return result;
		
	}
	
	
}
