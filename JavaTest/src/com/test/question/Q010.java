package com.test.question;

public class Q010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		숫자 1개를 전달하면 4자리로 출력하는 메소드를 선언하시오.
//		입력한 숫자가 4자리 이상이면 그대로 출력한다.
		
//		출력 예시
//		1 → 0001
//		12 → 0012
		
		//메소드 호출
		digit(1);
		digit(12);
		digit(321);
		digit(5678);
		digit(98765);
	}
	
	public static void digit(int num) {
//		4자리로  결과를 반환할 변수
		String result = "";
//		10미만이면 한자릿수
		result = (num < 10 ? "000" + num 
				: num < 100 ? "00" + num 
				: num < 1000 ? "0" + num : num+"");
		System.out.printf("%d -> %s\n", num, result);
	}

}
