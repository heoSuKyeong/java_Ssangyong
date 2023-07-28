package com.test.java;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Ex32_Array {

	
	public static void main(String[] args) {
		/*
		프로그래밍에 필요한 두 part
		- 자료구조 > 제어문
		- 알고리즘 > 배열
		
		배열, Array
		- 자료구조 중 하나
		- 자료형 : 참조형
		- 집합 자료형 : 데이터를 여러개 저장할 수 있는 자료형
		- 같은 자료형 / 같은 성격데이터 들의 집합
		
		****개발자가 만드는 모든 지역 변수는 Stack에 생성한다.
		stack은 직접 접근 가능 / heap은 stack을 통해 접근
		
		
		*/
		
//		m1();	//배열 사용하지않고 성적처리
//		m2();	//배열 사용하여 성적처리
//		m3();
//		m4();	//변수 초기화 필수
//		m5();	//메모리 공간 고정적
//		m6();	//메모리 공간 입력받아 설정
//		m7();	//배열끼리 복사
//		m8();	//얕은 복사, 깊은 복사
//		m9();	//유틸리티 클래스, dump
//		m10();	//배열 초기화
//		m11();	//배열 초기화2
//		m12();	//정렬(버블정렬)
		m13();
		
	}

	private static void m13() {
		// TODO Auto-generated method stub
		
		int[] num = {5,3,1,4,2};
		
		Arrays.sort(num);	//Quicksort implementations > 퀵정렬
		
		System.out.println(Arrays.toString(num));
		
		
	}

	private static void m12() {
		// TODO Auto-generated method stub
		
		//정렬
		//- 요소간의 크기 비교
		
		//1. 오름차순
		//	a. 숫자 : 작은 수 > 큰 수
		
		//2. 내림차순
		//	a. 숫자 : 큰 수 > 작은수
		//	b. 문자열 : 문자코드 값 역순으로
		//	c. 날찌시간 : 미래 > 과거
		
		//정렬 구현
		//1. 개발자가 구현
		//2. JDK OR Library 사용
		
		
		//버블 정렬 : 쉽지만, 다른 알고리즘 정렬보다 속도가 느리다.
		//오름차순 정렬
		int[] num = {5,3,1,4,2};	//int num[5];
		
		System.out.println(Arrays.toString(num));
		System.out.println();
		
		for(int i=0; i<num.length-1; i++) {	//0,1,2,3
			
			for (int j=0; j<num.length-1-i; j++) {	//비교 후 스왑
				
				if (num[j] > num[j+1]) {	//오름차순
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(num));
		
		
		
	}

	private static void m11() {
		// TODO Auto-generated method stub
		
		//배열 초기화 리스트
		int[] num = new int[3];
		System.out.println(Arrays.toString(num));
		
		//초기화
		num[0] = 100;
		num[1] = 200;
		num[2] = 300;
		System.out.println(Arrays.toString(num));
		
		//초기화 리스트
		int[] num2 = new int[] {100,200,300};
		
		System.out.println(Arrays.toString(num2));
		
		String[] name1 = new String[3];
		name1[0] = "홍길동";
		name1[1] = "아무개";
		name1[2] = "하하하";
		
		
		String[] name2 = new String[] {"홍길동","아무개","하하하"};
		
		System.out.println(Arrays.toString(name1));
		System.out.println(Arrays.toString(name2));
		
	}

	private static void m10() {
		// TODO Auto-generated method stub
		
		
//		int a;
//		System.out.println(a);	>>컴파일 에러
		
		//배열 자동 초기화
		//- 배열(참조형)은 생성 직후에 자동으로 초기화가 된다.
		
		//초기화 규칙
		//1. 정수배열 > 0으로 초기화
		//2. 실수배열 > 0.0
		//3. 문자배열 > \0
		//4. 논리배열 > false
		//5. 나머지 참조형배열 > null
		
		int[] num = new int[3];
		System.out.println(num[0]);
		System.out.println(Arrays.toString(num));
		
		double[] nums = new double[3];
		System.out.println(Arrays.toString(nums));
		
		char[] chrArray = new char[3];
		System.out.println(Arrays.toString(chrArray));	// \0 > 눈에 보이지 않음
		
		boolean[] booleanArray = new boolean[3];
		System.out.println(Arrays.toString(booleanArray));
		
		String[] strArray = new String[3];
		System.out.println(Arrays.toString(strArray));
		
	}

	private static void m9() {
		// TODO Auto-generated method stub
		
		//유틸리티 클래스
		//- int > Integer
		//- double > Double
		
		//Arrays 클래스
		//- 배열 유틸리티 클래스
		
		int[] num = new int[3];
		num[0] = 111;
		num[1] = 222;
		num[2] = 333;
		
		//배열의 상태가 궁금하면 > 출력
		printArray(num);	//배열끼리 복사가 이루어짐
		
		//dump(덤프): 객체의 상태를 하나의 문자열로 풀어내는 행동
		
//		System.out.println(num);	//[I@7d6f77cc(해시코드)  >> '[I' :자료형 / '7d6f77cc' : 메모리 주소
		
		System.out.println(Arrays.toString(num));	//[111, 222, 333]
		
		//깊은 복사 메소드
		int[] copy;
		
		copy = Arrays.copyOfRange(num, 0, num.length);	//0 ~ (length-1) 까지 카피
		
		num[0] = 1000;
		
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(copy));
		
		
	}
	
	public static void printArray(int[] num) {
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
		
		
	}

	private static void m8() {
		// TODO Auto-generated method stub
		
		//배열 복사
		//1. 얕은 복사, Shallow Copy
		//- 주소값 복사
		//- Side Effect 발생
		//stack 영역에서 복사
		
		//2. 깊은 복사, Deep Copy
		//- 요소 복사
		//- Side Effect 없음
		//heap 영역에서 복사
		
		int[] nums = new int[3];
		
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		
		int[] copy = new int[3];
		
		for (int i=0; i<nums.length; i++) {
			
			//int = int > 값형 복사
			copy[i] = nums[i];
		}
		
	}

	private static void m7() {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b;
		
		b=a;
		
		//원본 수정 > 복사본에게 영향을 미치는지 확인 > 미치지 않음
		//값형 복사할 때는 원본 수정이 되지 않음 > Side Effect가 발생하지 않는다.
		a=20;
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println();
		
		
		//참조형
		int[] nums = new int[3];
		
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		
		int[] copy;
		
		//***배열 변수끼리의 복사는 주소값 복사이다.
		copy = nums;
		
		//원본 수정
		//***nums와 copy는 같은 주소값을 가지고, 같은 배열을 가리킨다. 
		//둘 중 하나를 조작하면 나머지 배열도 영향을 받는다. > Side Effect가 발생한다.
		nums[0] = 1000;
		
		System.out.println("nums[0]: "+nums[0]);
		System.out.println("copy[0]: "+copy[0]);
		
//		****개발자가 만드는 모든 지역 변수는 Stack에 생성한다.
//		단, new와 붙이면 Heap에 생성
		
	}

	private static void m6() {
		// TODO Auto-generated method stub
		
		//배열의 길이는 런타임때 정할 수도 있다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생 수 : ");
		
		int num = scan.nextInt();
		
		int[] kors = new int[num];
		
		System.out.println(kors.length);
		
	}

	private static void m5() {
		// TODO Auto-generated method stub
		
		//****메모리의 공간은 한번 할당되면, 절대로 공간을 더 늘리거나 줄일 수 없다.
		
		int n;
		
		int[] nums = new int[3];
		
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		
		//갑자기 방이 하나 더 필요함
		//num[3] = 400; //100% 불가능
		
		//***배열은 처음부터 사용하는 최대 길이 미리 에측 > 나중에 수정 불가능
		
	}

	private static void m4() {
		// TODO Auto-generated method stub
		
		long[] list1 = new long[5];
		
		//Calendar c1;
		
		Calendar[] list6 = new Calendar[5];	//캘린더 5개 생성한 것x > 캘린더 저장할 변수 5개 생성o
		list6[0] = Calendar.getInstance();
		System.out.printf("%tF/n", list6[0]);
		
	}

	private static void m3() {
		// TODO Auto-generated method stub
		
		int[] nums = new int[3];
		
		//길이(방의 개수): 3
		//인덱스(방 번호): 0~2, 0~길이-1
		//방 1개(데이터) : 요소(Element)
		
//		nums[0] = 100;
//		nums[1] = 200;
//		nums[2] = 300;
//		nums[3] = 400;
		
		//입력
		//배열을 방을 원하는 순서대로 접근 > 탐색한다 > 주로 for문을 사용한다.
		for (int i=0; i<nums.length; i++) {
			nums[i] = i;
			System.out.printf("sum[%d] = %d\n", i, nums[i]);
		}
		
	}

	private static void m2() {
		// TODO Auto-generated method stub
		
//		요구사항) 학생 3명의 국어점수를 저장하여 총점, 평균을 구하시오
//		추가사항) 학생 수 300명 증가
		
		//배열 선언하기(생성하기)
		//- 자료형[] 배열명 = new 자료형[길이];
		//int[] -> 'integer배열'이라고 읽음
		
		int[] kors = new int[3];	//메모리에 int공간이 3개 연속으로 생성, kors가 주소번지를 기억함
		
		//배열의 방 갯수 == 배열의 길이
		System.out.println(kors.length);
		
		kors[0] = 100;
		kors[1] = 90;
		kors[2] = 80;
		
		
//		int total = kors[0] + kors[1] + kors[2];
		int total=0;
		for (int i=0; i<kors.length; i++) {
			total += kors[i];
		}
		
		double avg = total / (double)kors.length;
		
		System.out.printf("총점: %d점, 평균: %.1f점\n", total, avg);
	}

	private static void m1() {
		// TODO Auto-generated method stub
		
//		요구사항) 학생 3명의 국어점수를 저장하여 총점, 평균을 구하시오
		
		int kor1, kor2, kor3;
		
		kor1 = 100;
		kor2 = 90;
		kor3 = 80;
		
		int total = kor1 + kor2 + kor3;
		
		double avg = total/3.0;
		
		System.out.printf("총점: %d점, 평균: %.1f점\n", total, avg);
	}
	
	
}
