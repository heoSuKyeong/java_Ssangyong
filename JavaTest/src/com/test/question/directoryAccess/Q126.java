package com.test.question.directoryAccess;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Q126 {
//	직원들의 지각과 조퇴를 카운트하시오.
//
//	조건..
//	출근 : 오전 9시
//	퇴근 : 오후 6시

	public static void main(String[] args) {
		
		
		try {
			
			String path = "C:\\class\\code\\java\\file\\파일_입출력_문제";
			BufferedReader breader = new BufferedReader(new FileReader(path + "\\출결.dat"));
			
			HashMap<String, Integer> in = new HashMap<String, Integer>();
			HashMap<String, Integer> out = new HashMap<String, Integer>();

			String line = null;
			while((line = breader.readLine())!=null) {
				
				String[] temp = line.split(",");
				
				String name = temp[1];
				int inHour = Integer.valueOf(temp[2].split(":")[0]);
				int inMin = Integer.parseInt(temp[2].split(":")[1]);
				int outHour = Integer.parseInt(temp[3].split(":")[0]);
				
//				System.out.printf("이름: %s, 입실: %d, 퇴실: %d\n", name, inHour, outHour);
				
				//지각 카운트
				if (in.containsKey(name)) {
					if (inHour == 9 && inMin > 0) {
						in.put(name, in.get(name)+1);
					}
				} else {
					in.put(name, 0);
				}
				
				//조퇴 카운트
				if (out.containsKey(name)) {
					if(outHour < 18) {
						out.put(name, out.get(name)+1);
					}
				} else {
					out.put(name, 0);
				}
				
			}
			
			breader.close();
			
			System.out.printf("[이름]\t[지각]\t[조퇴]\n");
			
			Set<String> set = in.keySet();
			
			for (String key : set) {
				System.out.printf("%s\t%3d회\t%3d회\n", key, in.get(key), out.get(key));
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	
}
}
