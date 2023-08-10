package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class Ex67_sort {
	public static void main(String[] args) {
		
		//*********************잘 정리해두기
		
		
		//배열 or 컬렉션
		//- 오름차순 정렬, 내림차순 정렬
		//1. 직접 알고리즘 구현
		//2. JDK 제공 기능 활용
		
		//2번 + 커스터마이징 + 익명 클래스
		
//		m1();	//내림차순 정렬
//		m2();	//자료형별 정렬 - 문자(열)
//		m3();	//자료형별 정렬 - 날짜시간
//		m4();	//자료형별 정렬 - 객체
		m5();	//ArrayList
		
	}

	private static void m5() {

		//컬렉션 정렬
		//1. ArrayList	> 순서가 있는 데이터집합 > 정렬o
		//2. HashMap	> 순서가 없는 데이터집합 > 정렬x
		//3. Queue		> 순서가 있는 데이터집합 > but, 들어온 순서가 중요하기에 정렬x 
		//4. Stack		> 순서가 있는 데이터집합 > but, 들어온 순서가 중요하기에 정렬x 
		//5. HashSet	> 순서가 없는 데이터집합 > 정렬x
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i=0; i<10; i++) {
			list.add((int)(Math.random()*100));	//0~99 난수
		}
		
		System.out.println(list);
		System.out.println();
		
		//오름차순
		Collections.sort(list);
		System.out.println(list);
		System.out.println();
		
		//내림차순
//		Collections.sort(list, new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2-o1;
//			}
//		
//		});
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		
		System.out.println(list);
		
	}

	private static void m4() {
		
		//객체 정렬
		Score[] list = new Score[5];
		
		list[0] = new Score("홍길동", 100, 90, 80);
		list[1] = new Score("아무개", 98, 78, 88);
		list[2] = new Score("유재석", 78, 95, 79);
		list[3] = new Score("박명수", 56, 78, 76);
		list[4] = new Score("이순신", 99, 67, 79);
		
		System.out.println(Arrays.toString(list));
		System.out.println();
		
		//이름순으로 정렬
		//Arrays.sort(list);	//복합데이터의 정렬 기준이 없어 정렬 불가
		Arrays.sort(list, new Comparator<Score>() {
			@Override
			public int compare(Score o1, Score o2) {
				//return o1.getName().compareTo(o2.getName());	//이름순
				//return o2.getKor() - o1.getKor();	//국어 점수순
				return (o2.getKor()+o2.getEng()+o2.getMath()) - (o1.getKor() + o1.getEng() + o1.getMath());		//총점 순
			}
		});
		
		System.out.println(Arrays.toString(list));
		
	}

	private static void m3() {

		Calendar[] dates = new Calendar[5];
		
		for (int i=0; i<dates.length; i++) {
			dates[i] = Calendar.getInstance();
		}
		
		dates[0].add(Calendar.DATE, 7);
		dates[1].add(Calendar.DATE, -2);
		dates[2].add(Calendar.DATE, 1);
		dates[3].add(Calendar.DATE, 0);
		dates[4].add(Calendar.DATE, 3);
		
		for (int i=0; i<dates.length; i++) {
			System.out.printf("%tF\n", dates[i]);
		}
		System.out.println();
		
		//오름차순 정렬
		Arrays.sort(dates);
		
		for (int i=0; i<dates.length; i++) {
			System.out.printf("%tF\n", dates[i]);
		}
		System.out.println();
		
		//내림차순 정렬
		Arrays.sort(dates, new Comparator<Calendar>() {
			@Override
			public int compare(Calendar o1, Calendar o2) {
				
				//return (int)(o2.getTimeInMillis() - o1.getTimeInMillis());	//getTimeInMillis 가 long타입이기에 연산할 때 위험하다.
																			//차이가 너무 많이 나면 연산 결과가 음수가 아닌 양수가 나올 수 있다.
				//return o2.compareTo(o1);
				
				//요일로 정렬
				//일(1) ~ 토(7)
				return o1.get(Calendar.DAY_OF_WEEK) - o2.get(Calendar.DAY_OF_WEEK);
				
			}
		});
		
		for (int i=0; i<dates.length; i++) {
			System.out.printf("%tF %tA\n", dates[i], dates[i], dates[i]);
		}
		System.out.println();
	}

	private static void m2() {

		//자료형별 정렬
		//1. 숫자형
		//2. 문자(열) > 문자코드값 정렬 > 숫자 취급
		//3. 날짜시간 > 숫자 취급
		//4. 객체
		
		String txt1 = "홍길동";
		String txt2 = "홍무개";
		
		//참조형은 주소값을 담고 있고, 주소값들은 연산이 될 수 없으므로 비교가 불가능하다.
		//문자열 대 문자열은 비교 불가능
		//System.out.println(txt1>txt2);
		
		//문자 대 문자 비교 가능 : 문자는 문자코드이기때문에
		System.out.println('a'<'b');
		
		int n=0;
		
		for (int i=0; i<3; i++) {
			char c1 = txt1.charAt(i);
			char c2 = txt2.charAt(i);
			
			if (c1>c2) {
				n=1;
				break;
			} else if(c1<c2) {
				n=-1;
				break;
			}
		}
		
		if (n<0) {
			System.out.println("홍길동");
			System.out.println("홍무개");
		} else {
			System.out.println("홍무개");
			System.out.println("홍길동");
		}
		
		System.out.println(txt1.compareTo(txt2));
		System.out.println(txt1.compareToIgnoreCase(txt2));		//대소문자 구분없이 비교
		
		
		String[] names = {"홍길동","아무개","유재석","박명수","이순신", "훈", "김철"};
		
		//가다나순으로 정렬(오름차순)
		System.out.println(Arrays.toString(names));
//		Arrays.sort(names);
//		System.out.println(Arrays.toString(names));
		
		//내림차순
		Arrays.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {

				//return o2.compareTo(o1);	//가나다 정렬 : 문자 코드값 비교
				//return o1.length() - o2.length();	//글자수 비교
				
				//글자수, 가나다 오름차순 정렬
				if (o1.length() > o2.length() ) {
					return 1;
				} else if (o1.length() < o2.length()) {
					return -1;
				} else {
					
					//2차 정렬 기준
					return o1.compareTo(o2);
				}
			}
		});
		System.out.println(Arrays.toString(names));
		
	}

	private static void m1() {
		//int[] == Integer[]
		Integer[] nums = {1, 5, 2, 4, 3};
		
		System.out.println(Arrays.toString(nums));
		
		//오름차순 정렬
		//Arrays.sort(nums);	//Quick Sort > 내림차순 정렬은 안됨
		//System.out.println(Arrays.toString(nums));
		
		//내림차순 정렬 > 직접 구현
		Arrays.sort(nums, new MyComparator());
		System.out.println(Arrays.toString(nums));
		

		//쓸모없음 > sort의 목적으로 생성한 클래스이기에 굳이 인스턴스를 만들 필요가 없다.
		MyComparator mc1 = new MyComparator();
		System.out.println(mc1.compare(10, 20));	//출력 : 1
		
		
		Double[] nums2 = {3.1, 7.1, 3.8, 9.2, 8.9};
		//자료형이 달라지면 매번 새로운 클래스를 만들어야하므로 익명클래스로 1회성 클래스를 만들어준다.
		Arrays.sort(nums2, new Comparator<Double>() {
			@Override
			public int compare(Double o1, Double o2) {

//				if (o1 < o2) {
//					return 1;
//				} else if (o1>o2) {
//					return -1;
//				} else {
//					return 0;
//				}
				return (int)((o2-o1)*10);
			
			}
		});
		
		System.out.println(Arrays.toString(nums2));
	}
}

//정렬때문에 선언한 클래스
class MyComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		
		//o1 vs o2
		//1. 오름차순
		// a. o1이 더 크면 > 양수 반환 > 1
		// b. o2가 더 크면 > 음수 반환 > -1
		// c. 둘이 같으면 > 0 반환
		
		//2. 내림차순
		// a. o1이 더 크면 > 음수 반환 > -1
		// b. o2가 더 크면 > 양수 반환 > 1
		// c. 둘이 같으면 > 0 반환
		
		if (o1 > o2) { 
			return -1;
		} else if(o1 < o2) {
			return 1;
		} else {
			return 0;
		}
		
	}
	
}


class Score {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Score(String name, int kor, int eng, int math) {
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
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]\n";
	}
	
	
	
}