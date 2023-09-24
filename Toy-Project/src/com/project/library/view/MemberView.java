package com.project.library.view;
import java.util.Scanner;

import com.project.library.controller.Controller;
import com.project.library.model.dao.RentalBookDao;
import com.project.library.model.dao.UserDao;
import com.project.library.model.dao.ApplyBookDao;

public class MemberView {

	public static void mainView() {
		// TODO Auto-generated method stub
		
	}
	

	public static void memberMainView() {
		System.out.println(UserDao.auth.getName() + " 님 로그인 성공");

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("[회원 메뉴]");
			System.out.println("1. 도서 조회 및 대출");
			System.out.println("2. 도서 반납");
			System.out.println("3. 희망 도서 신청 및 조회 ");
			System.out.println("4. 나의 대출 현황 조회");
			System.out.println("5. 비밀번호 변경");
			System.out.println("6. 로그아웃");

			System.out.print("선택: ");
			String input = scan.nextLine();

			switch (input) {
			case "1":
				Controller.moveToBorrowBooksView();
				break;
			case "2":
				System.out.println("[도서 반납]");
				break;
			case "3":
				System.out.println("[희망 도서 신청 및 조회]");
				Controller.applybookView();break;
			case "4":
				System.out.println("[나의 대출 현황 조회]");
				Controller.rentalbooks();break;
			case "5":
				System.out.println("[비밀번호 변경]");
				break;
			case "6":
				System.out.println("로그아웃되었습니다.");
				return;
			default:
				Controller.msg("잘못입력함");
				break;
			}

		}

	}//memberMainView
	
	
	public static void borrowBooksView() {
		
		System.out.println("===============================");
		System.out.println("[도서 조회 및 대출]");
		System.out.println("===============================");
		
		/* 합치면 도서 조회 메서드 추가 */

		/* 아래부터는 도서 조회 메서드 합치기 전 임시 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("빌리고 싶은 도서의 ISBN 입력행: ");
		String isbn = scan.nextLine();
		
		RentalBookDao.borrowBooks(isbn);
//		RentalBookDao.checkReturnFlag(isbn); //도서조회한 ISBN 여기에 매개변수로 받기
		
		System.out.println("계속 진행하시려면 Enter를 입력해주세요.");
		scan.nextLine();
		
		
	}

}
