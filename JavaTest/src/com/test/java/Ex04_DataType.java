package com.test.java;

public class Ex04_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//변수 생성 방법, 주의할 점
		
		byte kor; //변수 선언
		kor = 100; //초기화
		System.out.println(kor); //출력
		
		byte eng; //변수 선언
		eng = 100; //초기화
		System.out.println(eng); //출력
		
		byte math; //변수 선언
		math = 100; //초기화
		System.out.println(math); //출력
		
		//문장(Statement) > 1개 이상의 표현식
		//문장 종결자 > ;
		
		/*
		변수명을 만들 때 규칙(*****) 
		1. 영문자 + 숫자 + '_'만 사용한다. > 관습적, 한글도 사용가능하나 잘 사용하지 않음. 
		2. 숫자로 시작 불가능 
		3. 예약어(키워드) 사용 불가능 
		4. 의미있게 생성(*********) > 풀네임으로 (ks > kor_score)
		5. 대소문자 구분
		
		*/
		
		
//		  변수명 명명법 패턴 
//		  1. 헝가리언 표기법 : 식별자의 접두어로 자표형을 표시하는 방법 / 현재 많이 사용하지 않음(가끔 인터페이스명에 사용)
		  byte byte_weight, bweight;
		  
//		  2. 파스칼 표기법 : 식별자 단어의 첫문자를 대문자 표기 + 나머지 문자는 소문자로 표기 / 2개 이상 단어로 만든 합성어에 사용 / 사용)클래스명
		  byte Height, EnglishScore;
		  
//		  3. 캐멀 표기법 : 파스칼과 비슷 / 단, 첫문자를 소문자 표기 / 사용)변수명, 메소드명
		  byte englishScore;
		  
//		  4. 스네이크 표기법 : 모두 소문자(혹은 모두 대문자)로 쓰되, 띄어쓰기를 밑줄(_) 기호로 대체하는 것
		  
//		  5. 케밥 표기법 : 전부 소문자 표기 / 합성어 단어를 '-'로 연결 / 자바에서는 사용 불가능(minus로 인식)
		  
		  
		  
		 
		
		byte b1;
		b1 = 100;
		System.out.println(b1);
		
		//수정, 치환
		b1 = 50;  //기존값 100을 가지고 있는 변수 b1에 새롭게 50을 대입
		System.out.println(b1);
		
		//변수(변하는 데이터) vs 상수(변하지 않는 데이터)
		//프로그래밍의 상수 : 데이터
		
		kor =100;
		System.out.println(100); // 국어 점수 출력 > 의미(x) > 가독성 낮음
		System.out.println(kor); // 국어 점수 출력 > 변수명=의미 > 가독성 높음
		
		//프로프래밍 발전 방향 중 제일 큰 영향력 : 코드 재사용
		
		//변수 생성 및 초기화
		byte b2;
		b2 = 100;
		
		//선언 + 초기화
		byte b3 = 100;
		
		// byte b4, b5;
		byte b4;
		byte b5;
		byte b6 = 100, b7 = 50, b8;
		
		//지도 좌표(x,y)
		byte x1;  // 현재 x좌표
		byte y1;  //현재 y좌표
		
		byte x2, //마트 x좌표
			 y2;  //마트 y좌표
		
		
		
		

	}

}
