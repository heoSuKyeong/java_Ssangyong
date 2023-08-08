package com.test.question.directoryAccess;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class Q126 {
//	직원들의 지각과 조퇴를 카운트하시오.
//
//	조건..
//	출근 : 오전 9시
//	퇴근 : 오후 6시
	
	public static void main(String[] args) {
		
		
		try {
			
			String path = "C:\\Users\\fcb10\\Downloads\\파일_입출력_문제";
			BufferedReader breader = new BufferedReader(new FileReader(path + "\\출결.dat"));
			
			HashMap<String, Integer> in = HashMap<String, Integer>();
			HashMap<String, Integer> out = HashMap<String, Integer>();

			String line = null;
			while((line=breader.readLine())=!null) {
				
				String[] temp = line.split(",");
				
				String name = temp[1];
				int inHour = Integer.parseInt(temp[2].split(":")[0]);
				int inMin = Integer.parseInt(temp[2].split(":")[1]);
				int outHour = Integer.parseInt(temp[3].split(":")[0]);
				
				//지각 카운트
				if (inHour == 9 && inMin > 0) {
					
					if (!in.containsKey(name)) {
						in.put(name, 1);
					} else {
						in.put(name, in.get(name)+1);
					}
				}
				
				//조퇴 카운트
				if(outHour < 18) {
					if (!out.containsKey(name)) {
						out.put(name, 1);
					} else {
						out.put(name, out.get(name)+1);
					}
				}
				
			}
			
			breader.close();
			
			System.out.printf("[이름]\t[지각]\t\[조퇴]\n");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
   