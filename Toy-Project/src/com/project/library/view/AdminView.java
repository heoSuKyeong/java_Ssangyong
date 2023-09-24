package com.project.library.view;

import java.util.Scanner;

import com.project.library.model.dao.UserDao;
import com.project.library.model.vo.OverdueBookVo;
import com.project.library.controller.Controller;
import com.project.library.model.dao.FalseBooksDao;
import com.project.library.model.dao.OverdueBookDao;

public class AdminView {

	public static void mainView() {
	}
	

	public static void adminMainView() {
		System.out.println("관리자님 로그인 성공");

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("[관리자 메뉴]");
			System.out.println("1. 도서 추가");
			System.out.println("2. 도서 삭제");
			System.out.println("3. 연체 회원 조회");
			System.out.println("4. 희망 도서 신청 관리");
			System.out.println("5. 로그아웃");

			System.out.print("선택: ");
			String input = scan.nextLine();

			switch (input) {
			case "1":
				Controller.moveToAddBooksView();
				break;
			case "2":
				System.out.println("[도서 삭제]");
				break;
			case "3":
//				System.out.println("[연체 회원 조회]");
				overdueUserView();
				break;
			case "4":
				System.out.println("[희망 도서 신청 관리]");
				break;
			case "5":
				System.out.println("로그아웃되었습니다.");
				return;
			default:
				Controller.msg("잘못입력함");
				break;
			}

		}

	}//adminMain
	
	//연체 관리
	public static void overdueUserView() {
		
		MainVIew.dash();
		MainVIew.title("연체 회원 조회");
		MainVIew.dash();
		
		OverdueBookDao.isoverdueUser();
		
		for (OverdueBookVo ob : OverdueBookDao.overdueUserList) {
			System.out.println(ob.getUserNo());
		}
		
		MainVIew.dash();
	}


	//도서 추가 메뉴 View
	public static void addBooksView() {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("===============================");
		System.out.println("[도서 추가]");
		System.out.println("===============================");
		
		
		while (true) {
			
			System.out.println("추가하실 도서 정보를 입력해주세요.");
			
			System.out.print("ISBN: ");
			String isbn = scan.nextLine();
			
			//0. ISBN 유효성 검사 진행(13자리 숫자)
			if (FalseBooksDao.isValidIsbn(isbn)) {
				
				//유효성 검사 통과 다음 단계 진행
			} else {
				
				System.out.println("올바른 형식의 ISBN을 입력해주세요.(13자리 숫자)");
				System.out.println("계속 진행하시려면 Enter를 입력해주세요.");
				scan.nextLine();
				break;
			}
			
			//1. 도서 기존재여부 'ISBN'으로 확인
			if (FalseBooksDao.checkBookStock(isbn)) {
				
				System.out.println("기존에 등록된 도서입니다.");
				System.out.println("계속 진행하시려면 Enter를 입력해주세요.");
				scan.nextLine();
				break;
			} else {
				
				System.out.print("도서명: ");
				String title = scan.nextLine();
				
				System.out.print("저자: ");
				String author = scan.nextLine();
				
				System.out.print("출판사: ");
				String publisher = scan.nextLine();
				
				FalseBooksDao.addBooks(isbn, title, author, publisher);
				System.out.println("계속 진행하시려면 Enter를 입력해주세요.");
				scan.nextLine();
				break;
			}
		}
	}
}