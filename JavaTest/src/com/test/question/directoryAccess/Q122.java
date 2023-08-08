package com.test.question.directoryAccess;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Q122 {
	
//	요구사항
//	성적을 확인 후 합격자/불합격자 명단을 출력하시오.
//
//	조건..
//	합격 조건: 3과목 평균 60점 이상
//	과락 조건: 1과목 40점 미만
	
//	데이터..
//	//이름,국어,영어,수학
//	홍길동,50,60,70
//	아무개,100,80,50
//	하하하,98,48,56
	
	public static void main(String[] args) {
		
		try {
			
			String path = "C:\\class\\code\\java\\file\\파일_입출력_문제";
			BufferedReader breader = new BufferedReader(new FileReader(path + "\\성적.dat"));
			
			ArrayList<String> passList = new ArrayList<String>();
			ArrayList<String> failList = new ArrayList<String>();
			
			String line = null;
			while((line = breader.readLine())!=null) {
				
				String[] person = line.split(",");
				String name = person[0];
				int kor = Integer.parseInt(person[1]);
				int eng = Integer.parseInt(person[2]);
				int math = Integer.parseInt(person[3]);
				
				if (checkScore(kor,eng,math)) {
					passList.add(name);
				} else {
					failList.add(name);
				}
			}
			
			breader.close();
			
			System.out.println("[합격자]");
			System.out.println(passList);
			System.out.println();
			
			System.out.println("[불합격자]");
			System.out.println(failList);
			
			
		} catch (Exception e) {
			System.out.println("at Q122.main");
			e.printStackTrace();
		}
		
		
		
	}

	private static boolean checkScore(int kor, int eng, int math) {
		
		if (kor < 40 || eng < 40 || math < 40) {
			return false;
		}
		
		if ((kor + eng + math)/3 < 60) {
			return false;
		}
		
		return true;
	}
}
