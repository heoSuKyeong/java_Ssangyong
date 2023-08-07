package com.test.question.Q107;

public class MyHashMap {
	private String[] mapKey;
	private String[] mapValue;
	private int index;
	
	public MyHashMap() {
		this.index=0;
		this.mapKey = new String[4];
		this.mapValue = new String[4];
	}
	
	public String put(String key, String value) {
		
		try {
			
			if (checkLength()) {
				doubleList();
			}
			
			//기존 배열에 값이 있는지 체크
			if (findValue(key) >= 0) {
				//기존에 있었으면 배열의 값 수정
				String result = this.mapValue[index];
				this.mapValue[index] = value;
				
				return result;
				
			}
			//기존에 없었으면 배열에 새로 추가
			this.mapKey[this.index] = key;
			this.mapValue[this.index] = value;
			
			this.index++;
			return null;
			
		} catch (Exception e) {
			return null;
		}

	}
	
	private int findValue(String key) {
		int index;
		for (index=0; index<this.index; index++) {
			if (this.mapKey[index].equals(key)) {
				return index;
				
			}
		}
		return -1;
	}
	
	
	private void doubleList() {
		
		String[] tempKey = new String[this.mapKey.length * 2];
		String[] tempValue = new String[this.mapKey.length * 2];
		
		for (int i=0; i<this.mapKey.length; i++) {
			tempKey[i] = this.mapKey[i];
			tempValue[i] = this.mapValue[i];
		}
		
		this.mapKey = tempKey;
		this.mapValue = tempValue;
		
	}

	private boolean checkLength() {
		
		if (this.index == this.mapKey.length) {
			return true;
		}
		
		return false;
	}

	
	public String get(String key) {
		
		int index = findValue(key);
		if (index>=0) {
			return this.mapValue[index];
		}
		
			return null;
				
	}
	
	public int size() {
		return this.index;
	}
	
	public String remove(String key) {
		
		for (int i=0; i<this.index-1; i++) {
			if (this.mapKey[i].equals(key)) {
				
				for (int j=i; j<this.index; j++) {
					this.mapKey[j] = this.mapKey[j+1];
					this.mapValue[j] = this.mapValue[j+1];
				}
				
			}
		}
		this.index--;
		
		return null;
	}

	public boolean containsKey(String key) {
		
		if(findValue(key)>=0) {
			return true;
		}
		
		return false;
	}

	public boolean containsValue(String string) {
		
		for (int i=0; i<this.index-1; i++) {
			if (this.mapValue[i].equals(string)) {
				return true;
			}
		}
		
		return false;
	}

	public void clear() {
		this.index=0;
	}
	
	
	
}
