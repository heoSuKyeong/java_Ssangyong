package com.test.java;

import java.util.Scanner;

public class Ex17_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		산술 연산자
//		비교 연산자
//		논리 연산자
//		대입 연산자
//		증감 연산자
//		조건 연산자
//		비트 연산자
		/*
		3. 논리 연산자
		- &&(and), ||(or), !(not), ^(xor)
		- 1항 연산자(!)
		- 2항 연산자(&&, ||, ^)
		- 피연산자를 대상으로 정해진 규칙에 따라 연산 결과를 반환
		- 피연산자의 자료형이 boolean형이다.
		- 연산의 결과가 boolean형이다.
		
		*/
		
		//논리곱 (&&)
		System.out.println("논리곱");
		System.out.println(true && true);	//true
		System.out.println(false && true);	//false
		System.out.println(false && false);	//false
		
		int age = 20;
		System.out.println((age>19) && (age<60));	
		
		//논리합 (||)
		System.out.println("논리합");
		System.out.println(true || true);	//true
		System.out.println(false || true);	//true
		System.out.println(false || false);	//false
		
		//부정 : 논리를 반대로 뒤집기
		System.out.println("부정");
		System.out.println(!true);	//false
		System.out.println(!false);	//true
		
		//배타적 논리합(^) : 같으면 false, 다르면 true
		System.out.println("배타적 논리합");
		System.out.println(true ^ true);	//false
		System.out.println(false ^ true);	//true
		System.out.println(false ^ false);	//false
		
		/*
		4. 대입 연산자(할당 연산자)
		- 복합 대입 연산자 : +=, -=, *=, /=, %=
		- LValue(변수) = RValue(상수, 변수)
		- 연산 순위가 제일 낮음
		
		연산자 우선 순위
		- 산술(*,/ > +, -)
		
		연산자 연산 방향
		- 대입, 증감 : 오른쪽에서 왼쪽
		- 나머지 : 왼쪽에서 오른쪽
		
		
		*/
		int sum = 10 + 20 * 3;
		System.out.println(sum);
		
		int a1 = 10, a2, a3;
		a3 = a2 = a1;	//같은 항목일 때, 오른쪽에서 왼쪽으로
		
		//복합 대입 연산자
		int n = 10;
		
		//기존 n에 1 추가하기 > 누적
		n = n + 1;	// n=11
		n += 1;
		
		n = n - 2;
		n -= 2;
		
		/*
		5. 증감 연산자
		- ++(증가), --(감소)
		- 1항 연산자
		- 피연산자는 숫자형을 가진다.
		- 누적 연산을 한다. 기존의 값에 1을 더하거나, 1을 뺀다.
		
		*** 연산자의 위치를 바꿀 수 있다. > 연산자 우선 순위가 달라진다.
		1. ++n : 전위 배치(전치) > 연산자 우선 순위가 가장 높음
		2. n++ : 후위 배치(후치)  > 연산자 우선 순위가 가장 낮음(대입 연산자보다 순위가 낮음)
		>> *** 증감연산자를 다른 연산자와 한문장에서 사용하지 말고 나눠서 작성하기 : 헷갈리지 않음
		*
		*/
		
		n = 10;
		//아래 3개 식 동일한 기능
		n = n + 1;
		n += 1;
		++n;
		System.out.println("n = " + n);
		
		n = 10;
		int result = 0;
//		result = 10 + ++n; >> 한 줄에 쓰는 것보다 아래처럼 두 줄로 나눠 작성
		++n;
		result = 10 + n;
		System.out.println(result);	//21
		
		n = 10;
		
//		result = 10 + n++; >> 한 줄에 쓰는 것보다 아래처럼 두 줄로 나눠 작성
		result = 10 + n;
		n++;
		System.out.println(result);
		System.out.println(n);
		
		int o = 10;
		System.out.println(--o-o--);
		System.out.println(o);
		
		/*
		6. 조건 연산자
		- ? : 
		- A ? B : C
		- 3항 연산자
		- 피연산자(A, B, C)
		- A : boolean
		- B, C : 데이터(상수, 변수)
		- A 조건 참 : B 반환, 조건 거짓 : C 반환
		
		*/
		
		boolean flag = true;
		String m1 = "참";
		String m2 = "거짓";
		System.out.println(flag ? m1 : m2);
		
		Scanner scan = new Scanner(System.in);
//		System.out.print("나이: ");
//		age = scan.nextInt();
		
//		String result2 = (age >= 19 && age < 60) ? "통과" : "거절";
//		System.out.printf("입력한 나이 %d세는 %s입니다.\n", age, result2);
		
		/*
		7. 비트 연산자
		- 비트 대 비트 연산
		*/
		int a = 10, b = 5;
		System.out.println(a&b);
		System.out.println(a|b);
		
	}

}
