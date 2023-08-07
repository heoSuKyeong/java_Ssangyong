package com.test.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex63_HashSet {
	public static void main(String[] args) {
		
		/*
		1. List
		- 순서가 있는 데이터 집합
		- 첨자(방번호)
		- 데이터 중복을 허용
		
		2. Set
		- 순서가 없는 데이터 집합
		- 요소를 구분하는 식별자가 없다.
		- (*****)데이터 중복을 허용하지 않음
		
		
		3. Map
		- 순서가 없는 데이터 집합
		- 키 + 값
		- 데이터 중복을 허용
		
		*/
		
//		m1();	//추가, 삭제
//		m2();	//로또 예제, 탐색(interator)
		m3();
		
	}

	private static void m3() {

		HashSet<String> name = new HashSet<String>();
		
		name.add("홍길동");
		name.add("홍길동");
		System.out.println(name);
		System.out.println();
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		
		System.out.println(s1.equals(s2));	//주소값 비교
		
		System.out.println(s1.hashCode());	//54150062
		System.out.println(s2.hashCode());	//54150062
		System.out.println();
		
		
		//p1과 p2를 같은 사람이라고 인식할 수 있도록 수정해보기 > 가끔씩 구현
		HashSet<Person> set = new HashSet<Person>();
		
		set.add(new Person("홍길동", 20));
		set.add(new Person("아무개", 25));
		set.add(new Person("이순신", 23));
		
		set.add(new Person("홍길동", 20));	//set은 중복값을 배제하지만 이건은 동명이인으로 본다.
		
		System.out.println(set);
		System.out.println();
		
		
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("홍길동", 20);	//다른 메모리 영역에 저장됨
		
		System.out.println(p1.equals(p2));		//주소값 비교, false
		
		//hashCode() 오버라이딩 전
//		System.out.println("p1: " + p1.hashCode());		//1617791695 > 메모리 주소 값
//		System.out.println("p2: " + p2.hashCode());		//125993742
		
		//hashCode() 오버라이딩 후
		System.out.println("p1: " + p1.hashCode());		//498603628
		System.out.println("p2: " + p2.hashCode());		//498603628
		
		
	}

	private static void m2() {

		//중복값 제거 > 로또 번호 > 중복되지 않는 난수 생성
		
		//case1. ArrayList
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
		for (int i=0; i<6; i++) {
			int n = (int)(Math.random()*45) +1;
			
			//중복 검사 후 배열에 넣기
			boolean frag = false;
			
			for (int j=0; j<i; j++) {
				if (lotto.get(j)==n) {
					frag = true;
					break;
				}
			}
			
			if (!frag) {
				lotto.add(n);
			} else {
				i--;
			}
		}
		System.out.println(lotto);
		
		
		//case2. HashSet
		HashSet<Integer> lotto2 = new HashSet<Integer>();
		
		while(lotto2.size() < 6) {
			int n = (int)(Math.random()*45)+1;
			
			lotto2.add(n);
		}
		System.out.println(lotto2);
		
		
		//set의 탐색 (>향상된 for문)
		for (int num : lotto2) {	//내부에 Interator 구현
			System.out.println(num);
		}
		System.out.println();
		
		//***List, Set 계열 모두 Iterator 지원
		//Iterator : 어떤 집합을 탐색하는 도구
		Iterator<Integer> iter = lotto2.iterator();
		/*
		System.out.println(iter.hasNext());		// 요소 존재 유무 > boolean형 반환
		System.out.println(iter.next());		//요소 가져오기
		
		System.out.println(iter.hasNext());	
		System.out.println(iter.next());
		System.out.println(iter.hasNext());	
		System.out.println(iter.next());
		System.out.println(iter.hasNext());	
		System.out.println(iter.next());
		System.out.println(iter.hasNext());	
		System.out.println(iter.next());	
		System.out.println(iter.hasNext());	
		System.out.println(iter.next());		
		
		System.out.println(iter.hasNext());		
		//java.util.NoSuchElementException
//		System.out.println(iter.next());		//다음 값이 없어 에러가 난다.
		 */
		
		while(iter.hasNext()) {
//			int n = iter.next();	//n에서 숫자를 담아 다음 숫자로 넘어감
			System.out.println(iter.next());
		}
		
	}

	private static void m1() {

		ArrayList<String> list = new ArrayList<String>();
		HashSet<String> set = new HashSet<String>();
		
		//추가
		list.add("강아지");
		list.add("고양이");
		list.add("거북이");
		
		set.add("강아지");
		set.add("고양이");
		set.add("거북이");
		
		System.out.println(list.size());
		System.out.println(set.size());
		
		System.out.println(list);
		System.out.println(set);
		
		
		list.add("고양이");
		set.add("고양이");	//중복데이터 추가 되지않음.
		
		System.out.println(list);
		System.out.println(set);
		System.out.println(set.add("고양이"));	//false
		
		
		//삭제
		list.remove(1);
		list.remove("거북이");
		System.out.println(list);
		
		set.remove("거북이");	//인덱스가 없기에 값으로밖에 접근 못한다.
		System.out.println(set);
		
		System.out.println(set.contains("강아지"));
	}
}


class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {

		this.name = name;
		this.age = age;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}
	
	//값이 동일하면 객체가 동일하게 처리하는 방법
	//1. hashCode() 오버라이드
	//2. equals() 오버라이드
	
	@Override
	public int hashCode() {
		
		//원래는 자신의 메모리 주소 값 반환
		
		//하나의 문자열로 합치고 hashCode 구하기
		//p1 : "홍길동", 20 > "홍길동20"  	> 100번지
		//p2 : "아무개", 25 > "아무개25"	> 200번지
		//p3 : "홍길동", 20 > "홍길동"		> 100번지
		
		return (this.name + this.age).hashCode();
		
	}
	
	@Override
	public boolean equals(Object obj) {

		return this.hashCode() == obj.hashCode();
	
	}
	
	
}
