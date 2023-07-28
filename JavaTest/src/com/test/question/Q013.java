package com.test.question;

import java.util.Scanner;

public class Q013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		국어, 영어, 수학 점수를 전달하면 '합격' 혹은 '불합격'이라는 단어를 반환하는 메소드를 선언하시오.
		
		//1. 스캐너 작성
		Scanner scan = new Scanner(System.in);
		
		//2. 안내메시지 출력 및 변수에 입력데이터 저장하기
		System.out.print("국어 : ");
		int kor = scan.nextInt();
		System.out.print("영어 : ");
		int eng = scan.nextInt();
		System.out.print("수학 : ");
		int math = scan.nextInt();
		
		//3. 메소드 호출
		String result = test(kor, eng, math);
		System.out.println(result);
	}
	
	public static String test(int kor, int eng, int math) {
		String result;
		double avergeScore = (kor + eng + math) / 3;
		result =  (avergeScore >= 60 ? "합격입니다." : "불합격입니다.");
		result = (kor<40 || eng<40 || math<40) ? "과락입니다." : result;
		return result;
	}

}
