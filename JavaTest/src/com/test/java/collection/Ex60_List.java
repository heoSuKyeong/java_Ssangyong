package com.test.java.collection;

import java.util.ArrayList;

public class Ex60_List {
	public static void main(String[] args) {
		
		/*
		컬렉션, Collection
		- JCF, Java Collection Framework
		- (향상된)배열 형식
		- 기존의 순수 배열을 
			- 사용법 개량
			- 용도에 따른 입출력 방식/효율성 개량
		- 클래스 + 내부 순수 배열을 가지고 있다.
		- 길이가 가변이다. > 방의 개수를 마음대로 늘리고 줄이는게 가능하다.
		- 자료 구조
		
		
		컬렉션 종류
		1. List 계열 (List 인터페이스 == 부모클래스)
			- ArrayList(*****)
			- LinkedList
			- Queue
			- Stack
			- Vector(legacy)
			*(legacy): 오래되고 대신 할 구조들이 생겼음, 언젠가 사라질 예정
		
		2. Set 계열 (Set 인터페이스)
			- HashSet(***)
			- TreeSet
		
		3. Map 계열 (Map 인터페이스)
			- HashMap(****)
			- TreeMap
			- Properties(legacy)
			- HashTable(legacy)
		
		
		Collection(Interface)
		- List(I)
		- Set(I)
		
		Map(I)
		
		
		ArrayList 클래스
		- ArrayList(C) -> List(I) -> Collection(I)
		- 순수 배열과 구조가 가장 유사하다.
		- 첨자(index)를 사용해서 요소(element)에 접근
		
		*/
		
//		m1();	//배열과 ArrayList 비교
//		m2();	//ArrayList 사용법 & foreach
//		m3();	//차원 ArrayList
//		m4();	//성적표 만들기
//		m5();	//ArrayList(컬렉션) 특징
//		m6();	//초기 용량 설정 & trimToSize
		m7();
		
	}

	private static void m7() {
	    ArrayList<String> list = new ArrayList<String>();
	    
	    //1. 요소 추가하기
	    list.add("바나나");
		list.add("딸기");
	    
	    list.add(1, "망고");
	    
	    //2. 요소 접근(읽기)
	    System.out.println(list.get(0));
	    
	    //3. 요소의 개수
	    System.out.println(list.size());	//3
	    
	    //4. 요소 수정
	    String temp = list.set(0, "딸바");
	    System.out.println(temp);
	    
	    //5. 요소 삭제
	    list.remove(2);
	    
	    //6. 기타
	    System.out.println(list.indexOf("포도"));
	    System.out.println(list.indexOf("망고"));
		System.out.println(list.lastIndexOf("딸바"));
	    System.out.println(list.contains("망고"));
	    System.out.println(list.isEmpty());
	    
	    
	    System.out.println(list.toString());
	    System.out.println(list); 
	}

	private static void m6() {

		//컬렉션 초기 용량 > 내부 배열의 초기 길이
		ArrayList<Integer> list = new ArrayList<Integer>(10);	//initial capacity. : 초기 용량 > 쓰레기 방지
		
		for (int i=0; i<10; i++) {
			list.add(i);
		}
		
		System.out.println(list);
		
		list.add(10);	//더이상 추가 계획 없음(확신)
		
		list.trimToSize();	//데이터가 들어있는만큼의 길이로 재조정 >> 완전 확신이 있을 때만 사용
		
	}

	private static void m5() {

		//ArrayList(컬렉션) 특징
		//1. 내부에 배열을 가지고 있다.
		//2. ArrayList 클래스 대부분의 기능이 내부 배열을 조작하는 기능으로 구성되었다.
		//3. 길이가 가변  > 데이터를 계속 넣으면 계속 공간이 늘어난다? 
			//- 기존 ArrayList 안에 4칸 배열이 생성되고 그 이상의 데이터가 들어오면 기존 길이의 2개 길이 배열을 생성한 후 기본 배열에 덮어씌운다.
		
		/*
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i=0; i<100000000; i++) {
			list.add(i);
		}
		
		System.out.println(list.size());
		*/
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		System.out.println(list.size());
		
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list.size());
		
		list.add(50);
		System.out.println(list.size());
		
		
	}

	private static void m4() {
		
		//성적표
		//학생(이름, 국어, 영어, 수학, 총점, 평균)
		
		//배열 vs ArrayList ?
		//- 길이로 판단 > 학생이 몇명? 
		//- 고정 / 가변
		
		//Student[] list;
		ArrayList<Student> list = new ArrayList<Student>();
		
		for (int i=0; i<10; i++) {
			int kor =  (int)(Math.random()*41)+60; 	//60~100점
			int eng =  (int)(Math.random()*41)+60; 	//60~100점
			int math =  (int)(Math.random()*41)+60; 	//60~100점
			
			Student s = new Student("학생" + i, kor, eng, math);
			
			list.add(s);	//배열에 학생이 추가
			
		}
		
		System.out.println("===================================================");
		System.out.println("                     성적표");
		System.out.println("===================================================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]");
		
		for (Student s : list) {
			
			int total = s.getKor() + s.getMath() + s.getEng();
			double avg = total / 3.0;
			
			System.out.printf("%s\t%5d\t%5d\t%5d\t%5d\t%5.1f\n"
					, s.getName()
					, s.getKor()
					, s.getEng()
					, s.getMath()
					, total
					, avg);
		}
		
	}

	private static void m3() {
		
		//차원
		int[] ns1 = new int[3];
		int[][] ns2 = new int[3][3];
		int[][][] ns3 = new int[3][3][3];
		
		ArrayList<Integer> ms1 = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> ms2 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<ArrayList<Integer>>> ms3 = new ArrayList<ArrayList<ArrayList<Integer>>>();
		
		
	}

	private static void m2() {
		
		//CRUD : 데이터를 다룰 때 기본적으로 하는 것
		//- Create(쓰기)
		//- Read(읽기)
		//- Update(수정)
		//- Delete(삭제)
		
		//ArrayList 사용법
		ArrayList<String> list = new ArrayList<String>();
		
		//1. 요소 추가하기
		//- boolean add(T value)
		//- 배열의 맨 마지막에 추가하기 > append
		list.add("바나나");
		list.add("딸기");
		list.add("사과");
		list.add("귤");
		list.add("파인애플");
		
		//2. 요소의 개수
		//- int size()
		System.out.println(list.size());	//5
		
		//3. 요소 접근(읽기)
		//- T get(int index)
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
//		System.out.println(list.get(5));	//java.lang.IndexOutOfBoundsException
		
		//4. 요소 수정
		//- list[0] = 10; 대입 or 수정
		//- String set(int index, T newValue)
		String temp = list.set(0, "딸바");	//수정되기 전 원본 저장
		System.out.println(list.get(0));
		System.out.println(temp);
		System.out.println();
		
		//5. 요소 삭제
		//- 순수 배열의 요소(방) 삭제? > 불가능
		//- 컬렉션은 요소 삭제 가능하다
		//- T remove(int index) >  방번호를 찾아서 삭제
		//- boolean remove(T value) > 값을 찾아서 삭제
		//- *** 시프트가 발생한다 > 삭제된 방 이후의 모든 요소는 방번호 1 감소한다.
		
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println();
		
		list.remove(2);	
//		list.remove(temp);	//**포도가 2개 이상이면 첫번째 만나는 포도만 삭제
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println();
		
		
		//6. 탐색
		for (int i=0; i<list.size(); i++) {
			System.out.printf("list.get(%d) = %s\n", i, list.get(i));
		}
		System.out.println();
		
		
		//향상된 for문(foreach문)
		//for (변수 : /컬렉션) / (변수 in 배열/컬렉션)
		
		for (String i : list) {
			System.out.println(i);
		}
		System.out.println();
		
		
		//7. 덤프
		//- Arrays.toString(배열)
		System.out.println(list.toString());
		System.out.println(list);
		System.out.println();
		
		//8. 요소 추가
		//- 배열의 원하는 위치에 요소를 추가 > Insert
		//- void add(index index, T value)
		//- *** 시프트 발생한다. > 삽입된 방 이후의 모든 요소의 방번호가 1씩 증가한다.
		
		list.add(2, "망고");
		System.out.println(list);
		System.out.println();
		
		//9. 기타 등등
		System.out.println(list.indexOf("포도"));
		System.out.println(list.indexOf("귤"));
		System.out.println(list.lastIndexOf("귤"));
		System.out.println(list.contains("귤"));
		
		System.out.println(list.isEmpty());
		
		list.clear();	//모든 요소 삭제, 초기화
		
		System.out.println(list.isEmpty());
		System.out.println(list);
		
	}

	private static void m1() {
		
		//순수 배열 선언
		//- 타입 명시(int)
		//- 길이 명시(3)
		int[] num1 = new int[3];
		
		//요소 접근 > Indexer
		num1[0] = 10;
		num1[1] = 20;
		num1[2] = 30;
		
		System.out.println(num1[0]);
		System.out.println(num1[1]);
		System.out.println(num1[2]);
		
		System.out.println(num1.length);
		System.out.println();
		
		
		//컬렉션
		//- 타입 명수(Integer) > 제네릭으로 명시
		//- 길이 명시 하지않음 > 가변
		ArrayList<Integer> num2 = new ArrayList<Integer>();
		
		//요소 접근 > 인덱스 사용하지않음 > add() == append > 차례대로 마지막 방에 넣어라
		num2.add(10);	//0번째 방에 넣어라
		num2.add(20);
		num2.add(30);
		num2.add(40);
		
		System.out.println(num2.get(0));	//num1[0]
		System.out.println(num2.get(1));
		System.out.println(num2.get(2));
		System.out.println(num2.get(3));
		
		System.out.println(num2.size());
		
		
	}
	
	
	
	
}
