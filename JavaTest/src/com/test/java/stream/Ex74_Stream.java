package com.test.java.stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.test.data.*;
import com.test.data.Item;
import com.test.data.User;
import com.test.java.collection.Student;
import com.test.util.MyFile;

public class Ex74_Stream {
	public static void main(String[] args) {
		
		/*
		자바 스트림
		1. 입출력 스트림
		- 파일 입출력, 콘솔 입출력, 네트워크 입출력...
		
		2. 스트림
		- Java 8(JDK 1.8)
		- 람다식 + 함수형 인터페이스
		- 목적 : 배열(컬렉션)의 탐색, 조작 지원
		- 파일 입출력 지원
		- 디렉토리 탐색 지원
		
		
		배열, 컬렉션 탐색
		1. for문(루프변수)
		2. 향상된 for문
		3. Iterator
		4. 스트림
		
		
		함수형 인터페이스 요약
		1. Consumer
		- (매개변수) -> {구현부}
		
		2. Supplier
		- () -> {return 값}
		
		3. Function
		- (매개변수) -> {return 값}
		
		4. Operator
		- (매개변수) -> {return 값}
		- 매개변수와 반환값의 자료형이 동일
		
		5. Predicate
		- (매개변수) -> {return 값}
		- 반환값이 무조건 boolean
		
		
		
		stream()
		
		.filter(Predicate)
		.map(Function)
		.sorted(compartor)
		.distinct()
		
		.count()/max()/min()/average()/sum()
		.allMacth()/anyMatch()/noneMacth()
		.forEach()
		
		*/
		
		String path = "test.java";
		
		//배포
		//- A개발자 자바 소스 > B개발자 전달
		//1. 소스 자체 전달 > MyFile.java
		//2. 컴파일한 실행 파일을 전달 > MyFile.class > 1개의 파일로 압축 > 압축한 zip아닌 jar 파일형식
		
		//import > 같은 프로젝트내에서만 가능하다.
		MyFile mf = new MyFile();
		
		//System.out.println(mf.getFileNameWithOutExtension(path));
		//System.out.println(mf.getExtension(path));
		
		
//		m1();	//data 속 데이터 확인해보기
//		m2();	//stream으로 데이터 출력하기
//		m3();	
//		m4();	//스트림을 얻어오는 방법
//		m5();	//스트림 파이프
//		m6();	//중복제거 - distinct()
//		m7();	//변환작업 - map()
//		m8();	//정렬 - sorted()
//		m9();	//매칭 - allMatch(), anyMatch(), noneMatch()
		m10();
		
		
	}

	private static void m10() {

		//집계, 통계, Reduce
		//- count(), max(), min(), sum(), average()
		//- 최종 파이프
		//- 요소들을 가공해서 통계값
		
		//count(), max(), min()
		System.out.println(Data.getIntList().stream().count());
		
		System.out.println(Data.getIntList().stream().max((a,b)-> a-b));		//Optional[99]
		
		System.out.println(Data.getIntList().stream().max((a,b)-> a-b).get());
		
		System.out.println(Data.getIntList().stream().min((a,b)-> a-b).get());

		
		//sum(), average() > 전용 메소드 통해 사용할 수 있다.
		int sum = Data.getIntList().stream()
						.mapToInt(n-> n)	//Stream<Integer>(x) IntStream(o)
						.sum();
		System.out.println(sum);
		
		double avg = Data.getIntList().stream()
							.mapToDouble(n->n)
							.average().getAsDouble();
		System.out.println(avg);
		
	}

	private static void m9() {

		//매칭
		//- allMatch(), anyMatch(), noneMatch()
		//- 최종 파이프
		//- 스트림 요소들이 제시한 조건을 만족 유무 판단
		// a. boolean allMatch(Predicate)	:	모든 요소가 조건을 100% 만족
		// b. boolean anyMatch(Predicate)	:	일부 요소가 조건을 만족
		// c. boolean noneMatch(Predicate)	:	모든 요소가 조건을 불만족
		
		//요구사항) 배열에서 짝수만 들어있는지 체크
		int[] nums = {2,2,34,4,50};
		
		boolean result = false;
		
		for (int n : nums) {
			if (n % 2 == 1) {
				result = true;
				break;
			}
		}
		if (result) {
			System.out.println("홀수 발견");
		} else {
			System.out.println("짝수 배열");
		}
		System.out.println();
		
		System.out.println(Arrays.stream(nums).allMatch(n-> n%2 == 0));
		if (Arrays.stream(nums).allMatch(n-> n%2 == 0)) {
			System.out.println("짝수 배열");
		} else {
			System.out.println("홀수 발견");
		}
		System.out.println();
		
		System.out.println(Arrays.stream(nums).anyMatch(n-> n%2 == 0));
		System.out.println(Arrays.stream(nums).noneMatch(n-> n%2 == 0));	//모두가 짝수가 아닌지 체크
		
	}

	private static void m8() {

		//정렬
		//- sorted()
		//- 중간 파이프
		//- 배열/컬렉션의 sort()와 사용법이 동일하다 > Comparator 구현
		
		//오름차순
		Data.getIntList(10)
			.stream()
			.sorted()
			.forEach(n-> System.out.println(n));
		System.out.println();
		
		//내림차순
		Data.getIntList(10)
		.stream()
		.sorted((a,b) -> b-a)
		.forEach(n-> System.out.println(n));
		System.out.println();
		
	}

	private static void m7() {

		//매핑*****
		//- map(), mapXXX()
		//- 중간 파이프
		//- 변환 작업을 수행한다.
		//- 원본데이터를 가공하여 새로운 데이터를 만들어낸다.
		
		List<String> list = Data.getStringList(10);
		System.out.println(list);
		System.out.println();
		
		list.stream()									//Stream<String> 리턴
			.filter(word -> word.length() <= 3)			//Stream<String> 리턴
			.forEach(word -> System.out.println(word));
		System.out.println();
		
		list.stream()									//Stream<String>
			.map(word -> word.length())					//Stream<Integer>
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		
		String[] names = {"홍길동", "아무개","이순신","권율","강감찬","연개소문","홍길동","이순신", "남궁장군","연개소문"};
		
		//names에서 이름만 추출
		Arrays.stream(names)
				.map(name -> name.substring(1))
				.forEach(name -> System.out.println(name));
		System.out.println();
		
		
		List<Student> slist = new ArrayList<Student>();
		
		slist.add(new Student("홍길동", 90, 80, 90));
		slist.add(new Student("아무개", 100, 50, 90));
		slist.add(new Student("이순신", 30, 10, 90));
		slist.add(new Student("강감찬", 60, 60, 70));
		slist.add(new Student("권율", 100, 90, 100));
		
		//지양 코드
		/*
		slist.stream()
				.map(s -> {
					if ((s.getKor() + s.getEng() + s.getMath()) >= 180) {
						return s.getName() + " 합격";
					} else {
						return s.getName() + " 불합격";
					}
				})	//Stream<Student> -> Stream<String>
				.forEach(result -> System.out.println(result));
		 */
		System.out.println();
		
		slist.stream()
				.map(s -> {
					Result r = new Result();
					r.setName(s.getName());
					if ((s.getKor() + s.getEng() + s.getMath())>=180) {
						
						r.setResult("합격");
						return r;
						
					} else {
						
						r.setResult("불합격");
						return r;
					}
				})
				.forEach(r -> System.out.println(r.getName() + ": " + r.getResult()));
		System.out.println();
		
		
	}

	private static void m6() {

		//중복 제거
		//- distinct()
		//- 중간 파이프
		//- 앞의 스트림에서 중복 요소를 제거하고 유일한 요소만 남은 새로운 스트림을 반환한다.
		
		List<Integer> list = Data.getIntList();
		
		System.out.println(list.size());	//100
		
		//요구사항) 위의 배열에서 중복값 제거
		
		//Case 1. - HashSet
		Set<Integer> set1 = new HashSet<Integer>();
		
		for (int n : list) {
			set1.add(n);	//중복값 제거
		}
		System.out.println(set1.size());	//61
		
		//Case2. - HashSet
		Set<Integer> set2 = new HashSet<Integer>(list);	//list와 set은 형제 관계이므로 생성자에 넣어 변환시킨다.
		
		System.out.println(set2.size());
		
		//Case3. - stream().distinct()
		list.stream().distinct().forEach(num -> System.out.print(num + " "));
		System.out.println();
		System.out.println(list.stream().distinct().count());
		System.out.println();

		
		String[] names = {"홍길동", "아무개","이순신","권율","강감찬","연개소문","홍길동","이순신", "남궁장군","연개소문"};
		Arrays.stream(names)
			.distinct()
			.filter(str -> str.length() == 3)
			.forEach(str -> System.out.println(str));
		System.out.println();
		
		
		//클래스, list 활용한 중복제거
		List<Cup> clist = new ArrayList<Cup>();
		
		clist.add(new Cup(Cup.BLACK, 200));
		clist.add(new Cup(Cup.BLUE, 300));
		clist.add(new Cup(Cup.RED, 400));
		clist.add(new Cup(Cup.WHITE, 500));	//1
		clist.add(new Cup(Cup.YELLO, 600)); //2
		clist.add(new Cup(Cup.BLACK, 700));
		clist.add(new Cup(Cup.BLUE, 800));
		clist.add(new Cup(Cup.RED, 900));
		clist.add(new Cup(Cup.WHITE, 500)); //1
		clist.add(new Cup(Cup.YELLO, 600)); //2
		
		//Set, distinct() > 중복 객체를 제거하려면?
		//1. hashCode() 재정의
		//2. equals() 재정의
		
		clist.stream()
			.distinct()
			.forEach(cup -> System.out.println(cup));
		System.out.println();
		System.out.println();
		
	}

	private static void m5() {
		
		/*
		스트림
		- 데이터 소스로부터 탐색/조작 가능한 도구
		- list.stream().forEach()
		
		파이프, pipe
		- 스트림 객체 메소드
		1. 중간 파이프
			- filter() : 필터링
			- 반환값 o + 스트림 반환
			- T/F로 판단하므로 Predicate가 제일 적합하다.
			
		2. 최종 파이프
			- forEach() : 요소처리
			- 반환값 x + void
			- 반환값 0 + 다른 자료형 반환
			- 활용도가 제일 높다.
			- 요소를 받아 제일 마지막 처리를 하므로 Consumer가 제일 적합하다.
		*/
		
		List<Integer> list = Data.getIntList(20);
		System.out.println(list);
		
		//요구사항) 짝수만 출력
		//case1 : for문
		for(int n: list) {
			if (n % 2 == 0) {
				System.out.printf("%-4d", n);
			}
		}
		System.out.println();
		
		//case2 : stream().forEach()
		list.stream().forEach(num -> {
			if (num % 2 == 0) {
				System.out.printf("%-4d", num);
			}
		});
		System.out.println();
		System.out.println();

		//case3 : stream().filter().forEach()
		list.stream().filter(num -> num % 2 ==0).forEach(num -> {
			System.out.printf("%-4d", num);
		});
		System.out.println();
		System.out.println();
		
		
		Data.getStringList().stream()
			.filter(word -> word.length() >= 5)
			.forEach(word -> System.out.print(word+" "));
		System.out.println();
		
		
		Data.getUserList().stream()
			.filter(user -> user.getWeight() >= 70 && user.getGender() == 2)
			.forEach(user -> System.out.print(user + " "));
		System.out.println();
		
		Data.getUserList().stream()
		.filter(user -> user.getWeight() >= 70)
		.filter(user -> user.getGender() == 2)
		.forEach(user -> System.out.print(user + " "));
		System.out.println();
		
	}

	private static void m4() {
		
		//스트림을 얻어오는 방법
		//1,2 연습
		//3,4,5 알아두기
		//1. 배열로부터
		//2. 컬렉션로부터
		
		//3. 숫자범위로부터
		//4. 파일로부터
		//5. 디렉토리부터
		
		//1. 순수배열로부터
		int[] nums1 = {10,20,30,40};
		
		Arrays.stream(nums1).forEach(num -> System.out.println(num));
		System.out.println();
		
		
		//2. 컬렉션으로부터
		ArrayList<Integer> num2 = new ArrayList<Integer>();
		num2.add(100);
		num2.add(200);
		num2.add(300);
		
		num2.stream().forEach(num -> System.out.println(num));
		System.out.println();
		
		
		//3. 숫자범위로부터
		//Stream<Integer> : 범용 스트림 > forEach > Consumer<Integer>
		//IntStream		  : 전용 스트림 > forEach > IntConsumer
		
		IntStream
			.range(1, 10)	//1~9
			.forEach(num -> System.out.print(num));
		System.out.println();
		System.out.println();
		
		try {
			
			//4. 파일로부터
			//- 스트림 > 파일 읽기
			//Paths.get("C:\\class\\java\code\\JavaTest\\data\\number.txt");
			
			//java.io > (버전업) java.nio
			
			// . : 현재 실행파일이 있는 폴더
			// - 자바 콘솔 프로젝트에서는 프로젝트 루트폴더를 표현
			Path path = Paths.get("data\\number.txt");	// <<<< \\data\\number.txt
			
			Files.lines(path).forEach(line -> System.out.println(line));
			System.out.println();
			
			//5. 디렉토리부터
			//- 목록보기 > dir.listFiles()
			Path dir = Paths.get("C:\\class\\dev\\eclipse");
			
			Files.list(dir).forEach(p -> {
				System.out.println(p.getFileName());
				System.out.println(p.toFile());
				System.out.println();
			});
			
			
		} catch (Exception e) {
			System.out.println("at Ex74_Stream.m4");
			e.printStackTrace();
		}
	}

	private static void m3() {
		
		//함수형 프로그래밍 > 의식의 흐름대로 작성
		Data.getIntList().stream().forEach(num -> System.out.printf("%4d", num));
		System.out.println();
		
		//엔터로 가독성 향상
		Data
			.getIntList()
			.stream()
			.forEach(num -> System.out.printf("%4d", num));
		System.out.println();
		
		Data.getUserList().stream().forEach(user -> {
			System.out.println("[회원정보]");
			System.out.println("이름: " + user.getName());
			System.out.println("나이: " + user.getAge());
			System.out.println("성별: " + user.getGender());
			System.out.println();
		});
		
		
		Data.getItemList().stream().forEach(item -> {
			System.out.println(item.getName());
			System.out.println(item.getColor());
			System.out.println();
		});
		
	}

	private static void m2() {
		
		//배열(컬렉션) 탐색
		List<String> list = Data.getStringList(10);
		
		//1. for
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		System.out.println();
		
		//2. 향상된 for문
		for (String word : list) {
			System.out.print(word + " ");
		}
		System.out.println();
		System.out.println();
		
		//3. Iterator
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		System.out.println();
		
		//4. Stream
		Stream<String> stream = list.stream();
		
		Consumer<String> c1 = str -> System.out.print(str + " ");
		
		//forEach 메소드
		//forEach stream의 데이터를 반복적으로 가져와서 c1의 메소드를 실행한다.
		//1. stream으로부터 얻어낸 데이터를 1개씩 가져온다.(향상된 for문처럼)
		//2. 가져온 데이터를 Consumer.accept() 메소드에 인자로 전달하고 호출한다.
		//3. 요소만큼 반복
		stream.forEach(c1);
		System.out.println();
		System.out.println();
		
		//stream has already been operated upon or closed > stream은 한번의 forEach만 가능하다(재사용 불가)
		//stream.forEach(c1);
		
		//Stream + 람다식 = 메소드 체이닝 > 함수형 프로그래밍 방식
		list.stream().forEach(str -> System.out.print(str + " "));
		System.out.println();
		
	}

	private static void m1() {
		
		int[] num1 = Data.getIntArray();
		System.out.println(Arrays.toString(num1));
		System.out.println(num1.length);
		System.out.println();
		
		int[] num2 = Data.getIntArray(5);
		System.out.println(Arrays.toString(num2));
		System.out.println();
		
		//List<Integer>
		List<Integer> num3 = Data.getIntList();
		System.out.println(num3.size());
		System.out.println();
		
		List<Integer> num4 = Data.getIntList();
		System.out.println(num4);
		System.out.println();
		
		String[] txt = Data.getStringArray();
		System.out.println(Arrays.toString(txt));
		System.out.println();
		
		Item[] items = Data.getItemArray();
		System.out.println(Arrays.toString(items));
		System.out.println();
		
		User[] list = Data.getUserArray();
		System.out.println(Arrays.toString(list));
		
	}
}


class Cup {
	
	public final static int BLACK = 1;
	public final static int WHITE = 2;
	public final static int RED = 3;
	public final static int YELLO = 4;
	public final static int BLUE = 5;
	
	//private String color2; 	//주관식 > 사용자 실수가 많음
	
	private int color;		//열거값 : 빨강, 파랑.... 선택
	private int size;
	
	public Cup(int color, int size) {
		this.color = color;
		this.size = size;
	}
	
	public int getColor() {
		return color;
	}
	
	public void setColor(int color) {
		this.color = color;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Cup [color=" + color + ", size=" + size + "]";
	}
	
	//개발자의 의도대로 객체를 비교하려면
	//1. hashCode() 재정의
	//2. equals() 재정의
	
	@Override
	public int hashCode() {
		return (""+ this.color + this.size).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return this.hashCode() == obj.hashCode();
	
	}
	
}

//Stream<Student> -> map() -> Stream<Result>
class Result {
	
	private String name;
	private String result;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	
	
}

