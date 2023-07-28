package com.test.question;

import java.util.Scanner;

public class Q005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		자전거가 있다. 자전거의 바퀴는 지름(직경)이 26인치이다. 
//		사용자가 페달을 밟은 횟수를 입력하면 자전거가 총 몇 m를 달렸는지 출력하시오.
		
		//1. 스캐너 작성하기
		Scanner scan = new Scanner(System.in);
		
		//2. 안내메시지 출력하기 및 입력데이터 변수에 저장하기
		System.out.print("사용자가 페달을 밟은 횟수: ");
		int num = scan.nextInt();
		
		//3. 인치 -> 미터(m) 변환하기
		final double PI = 3.141592;
		double inchi = 26 * PI;
		double intToMiteo = num * inchi * 0.0254;
		
		//4. 결과 출력하기
		System.out.printf("사용자가 총 %,d회 페달을 밟아 자전거가 총 %,.3fm를 달렸습니다.", num, intToMiteo);
		
		//5. 스캐너 닫기
		scan.close();
	}

}
