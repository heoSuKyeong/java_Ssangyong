package com.test.java.collection;

public class Student {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	//계산된 값 : 기존의 데이터를 계산한 값 > 보통 저장을 잘 안한다.
//	private int total;
//	private double avg;
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	
	
}


