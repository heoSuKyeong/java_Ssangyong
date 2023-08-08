package com.test.java.collection;

import java.util.Arrays;
import java.util.Comparator;

public class Ex67_sort {
	public static void main(String[] args) {
		
		//배열 or 컬렉션
		//- 오름차순 정렬, 내림차순 정렬
		//1. 직접 알고리즘 구현
		//2. JDK 제공 기능 활용
		
		//2번 + 커스터마이징 + 익명 클래스
		
		//int[] == Integer[]
		Integer[] nums = {1, 5, 2, 4, 3};
		
		System.out.println(Arrays.toString(nums));
		
		//오름차순 정렬
		Arrays.sort(nums);	//Quick Sort > 내림차순 정렬은 안됨
		System.out.println(Arrays.toString(nums));
		
		//내림차순 정렬 > 직접 구현
//		Arrays.sort(nums, Comparator);
		
		
	}
}

class MyComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		
		//
		
		return 0;
	}
	
	
}


