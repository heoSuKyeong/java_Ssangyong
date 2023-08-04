package com.test.java.collection;

import java.util.HashMap;
import java.util.Set;

public class Ex62_Map {
	public static void main(String[] args) {
		/*
		ArrayList
		- 요소 접근 > 첨자(index) 사용
		- 순서가 있는 데이터 집합(방번호 == 요소의 순서)
		ex) 강의실 6개 > 1강의실, 2강의실
		- 스칼라 배열(Scalar Array)
		- 요소 일관 접근 가능 > 루프(for)
		- 요소끼리 구분이 힘들다 > 방번호의 의미가 없어서
		- 첨자(index)는 유일하다.
		- 값(value)은 중복 가능하다.
		
		
		HashMap
		- 요소 접근 > 키(key) 사용
		- 순서가 없는 데이터 집합
		ex) 강의실 6개 > 햇님반, 달님반,...
		- 키(key) -> 값(value) 한 쌍으로 관리
		- 맵 또는 딕셔너리(Dictionary) == 사전 구조
		- 연관배열
		- 요소 일관 접근 불가능
		- 요소끼리 구분이 용이하다.	> 식별자(key) > 방의 의미가 있어 가독성이 좋다.
		- 키(key)는 유일하다.
		- 값(value)은 중복 가능하다.
		- map 계열은 없는 키의 값을 요구하면 null을 반환한다.
		
		*/
		//String - key 자료형 > 방이름
		//Integer - value 자료형 > 데이터
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		//1. 요소 추가
		//-V put(k key, V value)
		map.put("국어",  100);	//int 국어 = 100;
		map.put("영어",  90);
		map.put("수학", 80);
		System.out.println();
		
		//2. 요소 개수
		//-int size()
		System.out.println(map.size());
		System.out.println();
		
		//3. 요소 읽기
		//-V get(K key)
		System.out.println(map.get("국어"));
		System.out.println(map.get("영어"));
		System.out.println(map.get("수학"));
		System.out.println();
		
		//4. 일괄 탐색 > 현재는 불가능
		
		//5. 요소 수정
		//- V put(K key, V value)
		map.put("국어", 95);	//데이터 추가가 아닌 수정이 된다.
		System.out.println(map.get("국어"));
		System.out.println();
		
		//6. 요소 검색
		//- boolean containsKey(K key)
		//- boolean containsValue(V value)
		
		System.out.println(map.containsKey("국어"));	//true
		System.out.println(map.containsKey("국사"));	//false
		
		System.out.println(map.get("국사"));	//null
		
		System.out.println(map.containsValue(90));	//90점 맞은 과목이 있니?
		System.out.println();
		
		//7. 요소 삭제
		//- V remove(K key)
		map.remove("국어");
		
		System.out.println(map.size());
		System.out.println(map.get("국어"));
		System.out.println();
		
		//8. 초기화
		map.clear();
		
		System.out.println(map.size());
		System.out.println();
		
		//-------------------------
		//Loop
		map.put("국어",  100);
		map.put("영어",  90);
		map.put("수학", 80);
		
		Set<String> set = map.keySet();
		System.out.println(set);
		
		for (String key : set) {
			System.out.println(key + ":" + map.get(key));
		}
		
		
		//교실
		HashMap<String, String> list = new HashMap<String, String>();
		
		list.put("반장",  "홍길동");
		list.put("부반장","아무개");
		list.put("미화부장", "하하하");
		
		
		
		
		
	}
}
