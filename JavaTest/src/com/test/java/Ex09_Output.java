package com.test.java;

public class Ex09_Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		CLI(Commad Line Interface) : 텍스트 기반 명령 입출력 환경 > 가벼움
		GUI(Graphic User Interface) : 화면 기반 입출력 환경
		
		콘솔 입출력, Console Input Output
		- 기본 입력 장치 : 키보드
		- 기본 출력 장치 : 모니터
		
		콘솔 출력
		- 클래스.필드.메소드(인자)
		
		1. System.out.println(값)
		- print line
		- 값을 줄단위로 출력 > 값 출력한 뒤 엔터를 친다.
		
		2. System.out.print(값)
		- print
		- 값만 출력
		
		3. System.out.printf(값)
		- print format
		- 형식 문자를 제공 > 편리, 가독성
		1) %s : String
		2) %d : Decimal(모든 정수) > byte, short, int, long
		3) %f : Float(모든 실수) > float, double
		4) %c : Char
		5) %b : Boolean
		
		>>확장 기능
		1) %숫자s, %숫자d...
		- 출력할 너비를 지정한다.
		- (+) : 우측정렬 / (-) : 좌측정렬
		2) %.숫자f
		- 소수점 이하 자릿수 지정
		- %f > 소수이하 6자리 강제 출력
		3) %,d  %,f
		- 자릿수 표기(천단위 표기)
		
		*/
		
		
		System.out.println(10);
		System.out.println(3.14);
		System.out.println('a');
		System.out.println("문자열");
		System.out.println(true);
		
		System.out.print(10);
		System.out.print(3.14);
		System.out.print('a');
		
//		System.out.print(); //사용불가
		System.out.println();
		
		
		//성적표 출력하기
		String name1 = "홍길동";
		int kor1 = 100;
		int eng1 = 90;
		int math1 = 80;
		
		String name2 = "아무개";
		int kor2 = 80;
		int eng2 = 80;
		int math2 = 30;
		
		System.out.println("=================================");
		System.out.println("             성적표");
		System.out.println("=================================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]");
		System.out.print(name1);
		System.out.print("\t");
		System.out.print(kor1+"\t");
		System.out.print(eng1+"\t");
		System.out.print(math1+"\t");
		System.out.println();
		System.out.println(name2 + "\t" + kor2 + "\t" + eng2 + "\t" + math2);
		
		System.out.println();
//		요구사항) "안녕하세요. 홍길동님" 문장을 출력하시오.
		String name = "홍길동";
		System.out.println("안녕하세요. name님");
		System.out.println("안녕하세요. " + name + "님");
		System.out.printf("안녕하세요. %s님\n", name);
		
//		요구사항) "안녕하세요. 홍길동님. 안녕히가세요. 홍길동님"
		System.out.println("안녕하세요. " + name + "님. 안녕히가세요. " + name + "님." );
		System.out.printf("안녕하세요. %s님. 안녕히가세요. %s님\n", name,name);
		System.out.printf("저는 %s입니다. 나이는 %d살이구요. 키는 %fcm입니다. 혈액형은 %c형입니다. %b\n", "홍길동", 20, 170.5, 'O', true);
		
		int num = 123;
		System.out.printf("[%d]\n", num);
		System.out.printf("[%10d]\n", num);	//10칸을 확보하고, 그안에서 데이터를 (우측정렬)출력
		System.out.printf("[%-10d]\n", num);	//10칸을 확보하고, 그안에서 데이터를 (좌측정렬)출력
		System.out.printf("[%2d]\n", num);
		
		double num2 = 3.15;
		System.out.printf("%f\n", num2);
		System.out.printf("%.2f\n", num2);
		System.out.printf("%.1f\n", num2); //자동 반올림됨
		System.out.printf("%.0f\n", num2);
		
		//자릿수 표기
		int price = 1234567;
		System.out.printf("금액: %d원\n", price);
		System.out.printf("금액: %,d원\n", price);
		
		//천단위 + 소수이하 2자리 + 전체너비(20자리 + 우측정렬)
		double num3 = 1234567.89012345;
		System.out.printf("[%f]\n",num3);
		System.out.printf("[%,20.2f]\n",num3);	//위치 주의
		
		System.out.println();
		//카페 메뉴판 출력 > 열 정렬! > 탭과 자릿수로 조율
		//***숫자출력시 단위 표시!!
		System.out.println("===========================");
		System.out.println("    음료 가격(단위:원)");
		System.out.println("===========================");
		System.out.printf("콜라: \t\t%,6d\n", 2500);
		System.out.printf("사이다:\t\t%,6d\n", 3500);
		System.out.printf("라테:\t\t%,6d\n", 2500);
		System.out.printf("아메리카노:\t%,6d\n", 10500);
		
		
	}

}
