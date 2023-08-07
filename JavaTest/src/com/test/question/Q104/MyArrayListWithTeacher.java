package com.test.question.Q104;

import java.util.Arrays;

public class MyArrayListWithTeacher {
	
	private String[] list;
	
	//1. 현재 요소를 대입할 방번호
	//2. 현재까지 대입된 요소의 개수
	
	private int index;
	
	public MyArrayListWithTeacher() {
		this.index=0;
		this.list = new String[4];
	}
	
	//개발할 때 유용하게 사용되는 것 : toString()
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(String.format("length: %d\n", this.list.length));
		sb.append(String.format("index: %d\n", this.index));
		sb.append(Arrays.toString(this.list)+"\n");
		
		return sb.toString();
	
	}
	
	public void add(String value) {
		
		//검사
		if (checkLength()) {
			doubleList();
		}
		
		this.list[this.index] = value;
		this.index++;
		
	}

	private void doubleList() {

		String[] temp = new String[this.list.length * 2];
		
		//깊은 복사
		for (int i=0; i<this.list.length; i++) {	//짧은 배열 길이로 루프를 돌고있음
			temp[i] = this.list[i];
		}
		
		this.list = temp;	//배열교체 : 기존 4칸짜리 배열의 위치를 버리고 새로운 8칸짜리 배열 위치 대입
		
		
	}

	private boolean checkLength() {
		
		if (this.list.length == this.index) {
			//방이 꽉 찼습니다.
			return true;
		}
		//방이 여유가 있습니다.
		return false;
	}
	
	public String get(int index) {
		
		if (index < 0 || index >= this.index) {
			//없는 방번호를 요청했다면 IndexOufOfBoundException 발생
			throw new IndexOutOfBoundsException();
		}
		
		return this.list[index];
	}
	
	public int size() {
		
		return this.index;
	}
	
	public void set(int index, String value) {
		
		if (index < 0 || index >= this.index) {
			//없는 방번호를 요청했다면 IndexOufOfBoundException 발생
			throw new IndexOutOfBoundsException();
		}
		
		this.list[index] = value;
	}

	public void remove(int index) {
		//요소 삭제 > 우측의 모든 요소들이 왼쪽으로 1칸 이동 (Left Shift)
		for (int i=index; i<this.list.length-1; i++) {
			this.list[i] = this.list[i+1];
		}
		this.index--;
	}

	public void add(int index, String value) {
		
		if (index < 0 || index >= this.index) {
			throw new IndexOutOfBoundsException();
		}
		
		if (checkLength()) {
			doubleList();
		}
		
		//요소 삽입 > 우측의 모든 요소들이 오른쪽으로 1칸 이동 (Right Shift)
		for (int i=this.list.length-2; i>=index; i--) {
			this.list[i+1] = this.list[i];
		}
		this.list[index] = value;
		this.index++;
	}

	public int indexOf(String value) {
		
		for (int i=0; i<this.index; i++) {
			if (this.list[i].equals(value)) {
				return i;
			}
		}
		
		return -1;
	}
	public int indexOf(String value, int beginIndex) {
		
		for (int i=beginIndex; i<this.index; i++) {
			if (this.list[i].equals(value)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public int lastIndexOf(String value) {
		for (int i=this.index-1; i>=0; i--) {
			if (this.list[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}
	public int lastIndexOf(String value, int beginIndex) {
		for (int i=beginIndex; i>=0; i--) {
			if (this.list[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}

	public boolean contains(String value) {
		for (int i=0; i<this.index; i++) {
			if (this.list[i].equals(value)) {
				return true;
			}
		}
		return false;
	}

	public void clear() {
		
		//방법1.
//		for (int i=0; i<this.index; i++) {
//			this.list[i] = null;
//		}
//		this.index=0;
//		
		//방법2.
//		this.list = new String[4];
//		this.index=0;
		
		//방법3.
		this.index=0;
	}

	
	
	
}
