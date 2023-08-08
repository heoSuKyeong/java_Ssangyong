package com.test.question.directoryAccess;

import java.io.File;
import java.util.Scanner;

public class Q112 {
	
//	요구사항
//	지정한 파일을 다른 폴더로 이동하고, 이동한 파일과 동일한 파일명의 파일이 존재하는 경우 중복 처리하시오.
//
//	조건..
//	C:\class\java\file\AAA\test.txt → C:\class\java\file\BBB\test.txt 로 이동하는 것이 목적
//	BBB 폴더에 이미 test.txt가 있을 경우 덮어쓰거나(y) 작업을 취소(n) 하시오.
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		File file = new File("C:\\class\\code\\java\\file\\AAA\\test.txt");
		File newFile = new File("C:\\class\\code\\java\\file\\BBB\\test.txt");
		
		System.out.println("파일 이동을 실행합니다.");
		if (file.exists()) {
			if (newFile.exists()) {
				System.out.println("같은 이름을 가지는 파일이 이미 존재합니다. 덮어쓸까요?(y/n)");
				String answer = scan.nextLine();
				
				if (answer.equals("y")) {
					newFile.delete();	//삭제 후
					file.renameTo(newFile); //이동하기
					System.out.println("y. 파일을 덮어썼습니다.");
				} else {
					System.out.println("n. 작업을 취소합니다.");
				}
			} else {
				file.renameTo(newFile);	//BBB폴더에 해당 파일이 없으면 바로 이동시킨다.
				
			}
		} else {
			System.out.println("해당 파일이 없습니다.");
		}
		
		
	}
}
