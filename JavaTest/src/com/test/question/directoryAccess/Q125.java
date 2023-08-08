package com.test.question.directoryAccess;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Stack;

public class Q125 {
	
//	모든 괄호가 서로 짝이 맞는지 검사하시오.
//
//	조건..
//	대상 괄호: (), {}
//	Stack 사용
	
	public static void main(String[] args) {
		
		try {
			
			String path = "C:\\Users\\fcb10\\Downloads\\파일_입출력_문제";
			BufferedReader breader = new BufferedReader(new FileReader(path + "\\괄호.java"));
			
			Stack<Character> stack = new Stack<Character>();
			
			boolean frag = true;
			
			String line = null;
			while((line=breader.readLine())!=null && frag==true) {
				
				for (int i=0; i<line.length(); i++) {
					char c = line.charAt(i);
					
					if (c=='{' || c=='(') {
						stack.push((char)c);
					}
					
					if (c=='}' || c==')') {
						frag = getpop(c, stack);
					}
				}
			}
			
			if (frag) {
				System.out.println("올바른 소스입니다.");
			} else {
				System.out.println("올바르지 않은 소스입니다.");
			}
			
			breader.close();
			
		} catch (Exception e) {
			
		}
	}

	private static boolean getpop(char c, Stack<Character> stack) {

		if (stack.size()<=0) {
			return false;
		}
		
		if (c=='}' && !(stack.pop()=='{')) {
			return false;
		}
		
		if (c==')' && !(stack.pop()=='(')) {
			return false;
		}
		
		return true;
		
	}
}
