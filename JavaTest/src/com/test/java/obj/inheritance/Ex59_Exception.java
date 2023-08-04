package com.test.java.obj.inheritance;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex59_Exception {
	
	public static void main(String[] args) {
		
		/*
		예외, Exception
		- 런타임 오류
		- 컴파일 때 발견되지않고, 실행 중 발견되는 오류
		- 개발자가 경험을 통해 미리 예측 가능한 것도 있지만 예측 불가능한 것도 있다.
		- ex) n을 0으로 나누는 코드 (예측 가능함)
		
		
		예외 처리, Exception Handing
		1. 전통적인 방식
			- 제어문 사용(조건문)
		
		2. 전용 방식
			- try catch finally 문 사용
		*/
		
//		m1();	//if 문 vs try문
//		m2();	//finally
//		m3();	//예외의 종류 > 각각 try-catch
//		m4();	//다중 catch 문
		
//		try {
//			m5();	//throws Exception
//		} catch (Exception e) {
//			
//		}
		
		m6();	//예외 던지기
		
		try {
			int num=0;
			System.out.println(100/num);
		} catch (Exception e) {
			
		}
		
		try {
			
		} catch (Exception e) {
			System.out.println("at Ex59_Exception.main");
			e.printStackTrace();
		}
		
		
	}

	private static void m6() {

		//예외 던지기 != 예외 미루기
		
		//요구사항) 숫자 입력 
		//조건) 반드시 짝수만 입력, 홀수는 에러 처리
		
		int num = 5;
		
		if (num % 2 == 0) {
			System.out.println("업무 진행..");
		} else {
			System.out.println("예외 처리..");
		}
		System.out.println();
		
		//try 구현
		try {
			if (num % 2 == 1) {
				throw new Exception("홀수 입력");	//강제적으로 에러 발생
			}
			
			System.out.println("업무 진행..");
			
		} catch (Exception e) {
			System.out.println("예외 처리..");
			System.out.println(e.getMessage());
		}
		
		
		
	}

	private static void m5() throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//Unhandled exception type IOException > 반드시는 아니지만 예외 발생 가능성이 있다.
		
		//예외 처리 방법 1.
//		try {
//			String input = reader.readLine();
//		} catch (Exception e) {
//		}
		
		
		//예외 처리 방법 2.
		//예외 미루기 : 메소드 명 뒤에 throws Exception 붙이기
		//해당 메소드에서 책임을 안지겠다는 뜻 > 메인 메소드에 사용하면 뒤로 미룰 메소드가 없어 프로그램이 뻑이 난다.
		String input = reader.readLine();
		
	}

	private static void m4() {
		
		//예외의 종류
		// 다중 catch 문
		
		try {
			//0으로 나누기 오류
			int num = 10;
			System.out.println(100 / num);	// throw new ArithmeticException() > 에러 객체 생성 > 해당 catch 문에서 에러 객체를 잡는다.
			
			//배열 첨자
			int[] nums = new int[3];
			nums[0] = 10;
			
			//널 참조
			Scanner scan = null;
			scan.nextLine();
			
			//설정하지 않은 StringIndexOutOfBoundException 발생 > (Exception이 없다면)프로그램 중단
			
		}  catch (ArithmeticException e) {
			System.out.println("0으로 나누려고 함");
		
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 첨자 오류");
		
		} catch (NullPointerException e) {
			System.out.println("널 참조 오류");
		
		} catch (Exception e) {		// else 절과 비슷함, 순서 주의
			System.out.println("예외 처리");
		}
		
	}
	
	private static void m3() {
		
		//예외의 종류
		
		//0으로 나누기 오류
		//java.lang.ArithmeticException > 산술 연산 오류
		try {
			int num =0;
			System.out.println(100/num);
			
		} catch (Exception e) {
			System.out.println("0으로 나누려고 함");
		}
		
		
		//배열 첨자
		//java.lang.ArrayIndexOutOfBoundsException
		try {
			int[] nums = new int[3];
			nums[5] = 10;
			
		} catch (Exception e) {
			System.out.println("배열 첨자 오류");
		}
		
		//널 참조
		//java.lang.NullPointerException
		try {
			Scanner scan = null;
			scan.nextLine();
		} catch (Exception e) {
			System.out.println("널 참조 오류");
		}
		
	}

	private static void m2() {
		
		int num = 10;
		
		try {
			
			//비즈니스 영역
			System.out.println(100/num);
			
		} catch (Exception e) {
			//예외처리 영역
			System.out.println("예외 처리");
			
		} finally {
			//마무리 영역 : 에외와 상관없이 무조건 실행되는 블럭 
			System.out.println("마지막");
		}
		
		
	}

	private static void m1() {

		//요구사항) 숫자를 입력받아 연산을 하시오.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자: ");
		int num = scan.nextInt();
		
		//전통적인 예외처리
		if (num!=0) {
			//비즈니스 코드(=업무 코드) : 원래 목적
			System.out.printf("100 / %d = %d\n", num, 100/num);
			
		} else {
			//예외 처리 코드
			System.out.println("0을 입력하면 안됩니다.");
		}
		
		
		//가독성이 떨어지므로 비권장
		if (num==0) {
			//예외 처리 코드
			System.out.println("0을 입력하면 안됩니다.");
		} else {
			//비즈니스 코드(=업무 코드) : 원래 목적
			System.out.printf("100 / %d = %d\n", num, 100/num);
			
		}
		
		
		//if 문 vs try문
		//- if 문 : 사전에 미리 검사를 해서 사고가 안나게 처리
		//- try 문 : 일단 실행하여 감시한다. 사고가 터지면 그 때 뒷처리
		
		
		//try 영역 : 예외가 발생하는지 감시를 한다. 에러가 나면 예외 처리코드가 준비된 catch 문으로 이동한다.
		
		try {
			System.out.println(1);
			System.out.printf("100 / %d = %d\n", num, 100/num);
			System.out.println(2);
			
		} catch (Exception e) {
			
			//Exception e
			//- 예외 객체
			//- 예외의 상황을 전달
//			System.out.println(e.getMessage());
//			e.printStackTrace();
			System.out.println("0을 입력하면 안됩니다.");
		}
		
		System.out.println("종료");
		
	}
}
