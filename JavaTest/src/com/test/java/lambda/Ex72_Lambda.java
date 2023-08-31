package com.test.java.lambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Ex72_Lambda {
	public static void main(String[] args) {
		
		/*
		람다식, Lambda Expression
		- 함수형 프로그래밍에서 도입
		- 자바에서 람다식 : 컬렉션 조작(= 스트림)
		- 람다식을 사용하면 코드가 간결해진다.
		- 자바의 메소드를 간결하게 표현한 것이다.
		- 람다식은 매개변수를 가지는 코드블럭이다.(==메소드)
		- 자바의 람다식은 인터페이스를 사용해서 만든다.(자바만의 특징)
		
		
		
		람다식 형식
		- 인터페이스 변수에 람다식을 저장
		- ex) MyInterface m1 = () -> {};
		- (매개변수) -> {메소드 실행코드}
		- 자바 메소드의 다른 표현
		-  a. (매개변수) : 메소드의 매개변수 리스트와 동일
		-  b. ->: 화살표(Arrow), 코드블럭 호출역할
		-  c. {실행코드}: 메소드의 구현부와 동일
		
		*/
		
		m1();	//다양한 형태의 람다식	> 사용자 정의 함수형 인터페이스
//		m2();	//정렬
//		m3();	//Q122 성적순으로 정렬
		
	}

	private static void m3() {
		
		try {
			//1. 파일 읽기
			
			BufferedReader breader = new BufferedReader(new FileReader("C:\\class\\code\\java\\file\\파일_입출력_문제\\성적.dat"));
			
			ArrayList<Student> list = new ArrayList<Student>();
			
			String line = null;
			while((line=breader.readLine())!=null) {

				//텍스트 1줄 > Student 객체 1개로 만들기
				//홍길동,47,61,73
				
				String[] temp = line.split(",");
				Student s = new Student(
						temp[0], 
						Integer.parseInt(temp[1]), 
						Integer.parseInt(temp[2]), 
						Integer.parseInt(temp[3])
						);
				
				list.add(s);
				
			}
			
			//성적순으로 정렬
			list.sort(new Comparator<Student>() {	//version1
				@Override
				public int compare(Student o1, Student o2) {
					return o2.getTotal() - o1.getTotal();
				}
			});
			
			list.sort((o1, o2)-> o2.getTotal() - o1.getTotal());	//version2
			
			System.out.println(list);
			
			for (Student s : list) {
				System.out.println(s.getName()+":"+s.getTotal());
			}
			
			breader.close();
			
		} catch (Exception e) {
			System.out.println("at Ex72_Lambda.m3");
			e.printStackTrace();
		}
		
	}

	private static void m2() {

		//람다식 활용 == 익명 클래스(객체) 활용
		
		Random rnd = new Random();
		
		//int valuebetween 0 (inclusive) and the specified value (exclusive) > 0부터 지정한 숫자-1 까지 값
		//System.out.println(rnd.nextInt(10)); //0~9
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		for (int i=0; i<10; i++) {
			nums.add(rnd.nextInt(10)+1);
		}
		
		System.out.println(nums);
		
//		nums.sort(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o1-o2;
//			}
//		
//		});
//		System.out.println(nums);
		
		//간소화 안한 버전
		nums.sort((Integer o1, Integer o2)-> {
			return o1-o2;
		});
		
		//간소화 버전
		nums.sort((o1, o2) -> o2-o1);
		
		System.out.println(nums);
		
	}

	private static void m1() {
		//요구사항) MyInterface를 구현한 객체를 1개 만드시오.
		/*
		MyInterface m1 = new MyClass();
		m1.test();
		
		MyInterface m2 = new MyInterface() {
			
			@Override
			public void test() {
				System.out.println("익명클래스에서 구현한 메소드");
			}
		};
		m2.test();
		
		MyInterface m3 = () -> {
			System.out.println("람다식에서 구현한 메소드");
		};
		m3.test();
		System.out.println();
		*/
		
		NoParameterNoReturn pr1 = new NoParameterNoReturn() {
			@Override
			public void call() {
				System.out.println("pr1");
			}
		};
		pr1.call();
		
		NoParameterNoReturn pr2 = () -> {
			System.out.println("pr2");
		};
		pr2.call();
		
		//***블럭 생략 가능(실행문 한줄일 경우)
		NoParameterNoReturn pr3 = () -> System.out.println("pr3");
		pr3.call();
		
		ParameterNoReturn pr4 = (int num) -> System.out.println(num);
		pr4.call(1);
		pr4.call(10);
		
		//***매개변수의 자료형 생략 가능 > 클래스를 보고 추측이 가능하기 때문에
		ParameterNoReturn pr5 = (num) -> System.out.println(num);
		pr5.call(20);
		
		//***매개변수의 소괄호 생략 가능
		ParameterNoReturn pr6 = num -> System.out.println(num);		//가장 간소화한 람다식 형태
		
		
		//***매개변수의 소괄호는 매개변수가 1개일때만 생략할 수 있다.
		MultiParameterNoReturn pr7 = (name, age) -> System.out.printf("이름: %s, 나이: %d\n", name, age);
		pr7.call("홍길동", 25);
		
		
		NoParameterReturn pr9 = () -> {
			return 100;
		};
		System.out.println(pr9.call());
		
		//중괄호 생략 시 return 까지 생략하여 가능하다.
		NoParameterReturn pr10 = () -> 100;
		System.out.println(pr10.call());
		
		ParameterReturn pr11 = name -> name.length();
		System.out.println(pr11.call("홍길동"));
	}
}


interface MyInterface {
	void test();
}

class MyClass implements MyInterface {
	
	@Override
	public void test() {
		System.out.println("실명클래스에서 구현한 메소드");
	
	}
}


interface NoParameterNoReturn {
	void call();
}

interface ParameterNoReturn {
	void call(int num);
}

interface MultiParameterNoReturn {
	void call(String name, int age);
}

interface NoParameterReturn {
	int call();
}

interface ParameterReturn {
	int call(String name);
}


class Student {
	
	//홍길동,47,61,73
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	
	
	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return this.kor + this.eng + this.math;
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
		return "[name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]\n";
	}
	
	
}
