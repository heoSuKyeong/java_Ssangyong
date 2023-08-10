package com.test.java.stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.test.data.*;
import com.test.data.Item;
import com.test.data.User;
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
		m5();
		
		
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
			

			
			
		2. 최종 파이프
			- forEach() : 요소처리
			- 반환값 x + void
			- 반환값 0 + 다른 자료형 반환
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
		
		//case2 : stream
		list.stream().forEach(num -> {
			if (num % 2 == 0) {
				System.out.printf("%-4d", num);
			}
		});
		System.out.println();
		System.out.println();

		//case3 : stream().filter()
		list.stream().filter(num -> num % 2 ==0).forEach(num -> {
			System.out.printf("%-4d", num);
		});
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



