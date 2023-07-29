package com.test.question;

import java.util.Scanner;

public class Q091 {

//	연산식을 입력받아 실제 연산을 하시오.
//
//	조건..
//	산술 연산자만 구현하시오.(+, -, *, /, %)
//	연산식의 공백은 자유롭게 입력 가능합니다.
//	산술 연산자가 반드시 존재하는지 체크하시오.
//	피연산자의 갯수가 2개인지 체크하시오.
//	입력..
//	입력: 10 + 2 
//
//	출력..
//	10 + 2 = 12
	
	public static void main(String[] args) {
		
		// 숫자 > 연산자 > 숫자
		
		//변수 생성
		char[] operator = {'+', '-', '/', '*', '%'};
		String input = "";
		
		//스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		//산수식 입력받기
		System.out.print("입력: ");
		
		input = scan.nextLine();
		
		input = input.replace(" ", "");
		
		
		if (isFormula(input)) {
			
			//indexOf > 해당하는 인덱스를 찾아줌
			int index =-1;
			for (int i=0; i<operator.length; i++) {
				index = input.indexOf(operator[i], index);
				if (index > 0) break;
			}
			int num1 = Integer.parseInt(input.substring(0, index));
			int num2 = Integer.parseInt(input.substring(index+1));
			
			calculator(input.charAt(index), num1, num2);
			
		}
		
		
	}

	private static void calculator(char c, int num1, int num2) {
		
		int result=0;
		
		switch (c) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '%':
			result = num1 % num2;
			break;

		default:
			break;
		}
		
		System.out.printf("%d %c %d = %d", num1, c, num2, result);
		
		
	// TODO Auto-generated method stub
	
}

	private static boolean isFormula(String input) {
		// TODO Auto-generated method stub
		char[] operator = {'+', '-', '/', '*', '%'};
//		String[] operator = {"+", "-", "*", "/", "%"};

		boolean isNum1=false, isOperator=false, isNum2=false;
		for (int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			if (c >= '1' && c <= '9') {
				if (isNum1) {
					isNum2=true;
					return true;
				}
				isNum1 = true;
				continue;
			}
			if (isNum1) {
				for (int j=0; j<operator.length; j++) {
					if (c == operator[j]) {
						isOperator = true;
						break;
					}
					
				}
			}
		}
		if (!isOperator) {
			System.out.println("연산자가 올바르지 않습니다.");
		} else {
			System.out.println("피연산자가 올바르지 않습니다.");
		}
		
		return false;
		
	}
	
}
