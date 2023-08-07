package com.test.question.Q104;

public class MainWithTeacher {
	public static void main(String[] args) {
		
		MyArrayListWithTeacher list = new MyArrayListWithTeacher();
		System.out.println(list);
		
		//추가
		list.add("홍길동");
		System.out.println(list);
		list.add("아무개");
		System.out.println(list);
		list.add("하하하");
		System.out.println(list);
		list.add("하하2");
		list.add("하하3");

		//읽기
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
//		System.out.println(list.get(5));	//없는 방번호

		//개수
		System.out.println(list.size());
		
		//탐색 + 읽기
		for (int i=0; i<list.size(); i++) {
		      System.out.println(list.get(i));
		}
		
		//수정
		list.set(0, "우하하");
		list.set(1, "아하하");
//		System.out.println(list.get(0));
		System.out.println(list);

		//삭제
		list.remove(1);
		System.out.println(list);
		
		list.add("이순신");
		System.out.println(list);
//		for (int i=0; i<list.size(); i++) {
//		      System.out.println(list.get(i));
//		}

		//삽입
		list.add(1, "홍길동");
		System.out.println(list);
		//검색
		if (list.indexOf("홍길동") > -1) {
		      System.out.println("홍길동 있음");
		} else {
		      System.out.println("홍길동 없음");
		}
		
		System.out.println(list.lastIndexOf("홍길동"));
		
		System.out.println(list.indexOf("홍길동", 3));
		
		System.out.println(list.contains("홍길동"));
		
		System.out.println(list);
		
		//초기화
		list.clear();
//		System.out.println(list.size());
		
		System.out.println(list);
	}
}
