package com.test.question.directoryAccess;

import java.io.File;
import java.util.ArrayList;

public class Q118 {
	//선생님 코드 참고하여 풀었음
//	폴더 내의 모든 파일들을 찾아 크기를 비교하고, 크기가 큰 순으로 정렬하시오.
//
//	조건..
//	자식 폴더내의 파일도 모두 검색하시오.
//	부모 자식 폴더에 상관없이 파일을 한번에 비교하시오.
	
	public static void main(String[] args) {
		
		String path = "C:\\class\\code\\java\\JavaTest\\src\\com\\test\\question\\directoryAccess\\파일_디렉토리_문제\\크기 정렬";
		
		File dir = new File(path);
		
		ArrayList<File> fList = new ArrayList<File>();
		
		//ArrayList에 모든 파일 추가
		addList(dir, fList);
		
		//ArrayList속 파일 크기 비교
		for (int i=1; i<fList.size(); i++) {
			for (int j=0; j<fList.size()-i-1; j++) {
				if (fList.get(i).length() > fList.get(j).length()) {
					File temp = fList.get(j);
					fList.set(j, fList.get(j+1));
					fList.set(j+1, temp);
				}
			}
		}
		
		System.out.printf("%-33%s%s\t%10s\n", "[파일명]", "[크기]", "[파일이 들어있는 폴더]");
		
		for (File file : fList) {
			System.out.printf("%-30s\t%10s\t%s\n"
								, file.getName()
								, getSize(file.length())
								, file.getParentFile().getName());
		}
		
	}

	private static Object getSize(long length) {
		
		if (length < 1024) {
			return length + "B";
		} else if (length < 1024*1024) {
			return String.format("%.1f", length / 1024.0) + "KB";
		} else if (length <1024*1024*1024) {
			return String.format("%.1, null)
		}
		
		
		return null;
	}

	private static void addList(File dir, ArrayList<File> fList) {
		
		File[] list = dir.listFiles(); 
		
		for (File f : list) {
			if (f.isFile()) {
				fList.add(f);
			}
		}
		
		for (File subDir : list) {
			if (subDir.isDirectory()) {
				addList(subDir, fList);
			}
		}
		
		
	}
}
