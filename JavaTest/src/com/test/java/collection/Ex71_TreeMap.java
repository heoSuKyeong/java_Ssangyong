package com.test.java.collection;

import java.util.TreeMap;
import java.util.Vector;

public class Ex71_TreeMap {
	public static void main(String[] args) {
		
		//TreeMap
		//- Tree > 이진 탐색 트리 > 자동정렬
		//- Map > 키+값 > 연관 배열
		
		/*
		정리
		
		List
		- (*****)ArrayList : 배열이 필요할 때 / 단, 삽입&삭제 시 속도가 매우 느리다.
		- LinkedList : ArrayList 대체제 / 극심한 삽입,삭제가 많을 때
		- Stack : 스택 구조가 필요할 때
		- Queue : 큐 구조가 필요할 때
		- Vector : ArrayList로 대체되어 현재는 거의 사용하지 않는다.
		
		Set
		- (*****)HashSet : 중복값 배제, 유일한 집합
		- TreeSet : HashSet + 정렬 > set에서 정렬이 필요할 때가 많지 않다.
		
		Map
		- (*****)HashMap : 키와 값 연관 배열이 필요할 때
		- TreeMap : HashMap + 정렬 > map에서 정렬이 필요할 때가 많지 않다.
		- HashTable : HashMap으로 대체
		
		- Properties : JSON, XML 으로 대체
		
		*/
		
		TreeMap<String, String> map = new TreeMap<String, String>();
		
		map.put("while", "흰색");
		map.put("black", "검정");
		map.put("red", "빨강");
		map.put("yello", "노랑");
		map.put("blue", "파랑");
		map.put("orange", "주황");
		map.put("green", "초록");
		
		System.out.println(map);	//key 순으로 자동 정렬
		
		System.out.println(map.size());
		
		System.out.println(map.get("green"));
		map.put("green", "녹색");
		System.out.println(map.get("green"));
		
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		
		System.out.println(map.headMap("m"));		//{black=검정, blue=파랑, green=녹색}
		System.out.println(map.tailMap("m"));		//{orange=주황, red=빨강, while=흰색, yello=노랑}
		System.out.println(map.subMap("r", "y"));	//{red=빨강, while=흰색}
		System.out.println();
		
		
		Vector<Integer> list = new Vector<Integer>();
		
		list.add(10);
		System.out.println(list.get(0));
		
		
		
	}
}
