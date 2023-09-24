package com.project.library.view;

import java.util.Scanner;

import com.project.library.controller.Controller;
import com.project.library.model.dao.FalseBooksDao;
import com.project.library.model.dao.RentalBookDao;
import com.project.library.model.dao.TrueBooksDao;
import com.project.library.model.dao.UserDao;
import com.project.library.model.vo.TrueBooksVo;

public class MainVIew {

	public static void startView() {
		
		load();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("쌍용 도서관");
			System.out.println("1. 회원가입");
			System.out.println("2. 도서조회");
			System.out.println("3. 로그인");
			System.out.println("4. 종료");
			
			System.out.print("선택: ");
			String input=scan.nextLine();
			
			switch(input) {
				case "1" : join(); break;
				case "2" : System.out.println("개발중");break;
				case "3" : if (loginView())	{
								return;
							} else {
								break;
							}
				case "4" : System.out.println("종료합니다");save();return;
				default : Controller.msg("잘못입력함");
			}
			
		}
		
	}
	
	private static void save() {
		UserDao.save();
	}

	public static void join() {
		dash();
		title("회원가입");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*이름은 한글 2~6글자로 입력해주세요.");
		System.out.print("이름을 입력하세요: ");
		String name = scan.nextLine();
		
		System.out.println("*전화번호는 \"010-XXXX-XXXX\" 입력해주세요.");
		System.out.print("전화번호를 입력하세요: ");
		String tel = scan.nextLine();
		
		System.out.print("이메일을 입력하세요: ");
		String email = scan.nextLine();
		
		System.out.println("*아이디는 영어+숫자 조합으로 4~15글자 입력해주세요.");
		System.out.print("아이디를 입력하세요: ");
		String id = scan.nextLine();

		System.out.println("*비밀번호는 영어+숫자 조합으로 4~15글자 입력해주세요.");
		System.out.print("비밀번호를 입력하세요: ");
		String pw = scan.nextLine();
		
		
		boolean joinCheck = Controller.join(name, tel, email, id, pw);
		
		if (joinCheck) {
			Controller.userAdd(name, tel, email, id, pw);
		}
		
	}
	
	
	public static boolean loginView() {
		
		dash();
		title("로그인");
		Scanner scan = new Scanner(System.in);

		System.out.print("아이디를 입력하세요: ");
		String id = scan.nextLine();
		
		System.out.print("비밀번호를 입력하세요: ");
		String pw = scan.nextLine();
		
		String loginCheck = Controller.login(id, pw);
		
		if (loginCheck.equals("1")) {
			MemberView.memberMainView();
		} else if (loginCheck.equals("0")) {
			AdminView.adminMainView();
		} else {
			System.out.println("아이디 또는 비밀번호가 틀립니다.");
			dash();
			return false;
		}
		
		dash();
		return true;
		
	}
	
	public static void searchBooks() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[도서 조회]");
//		System.out.println(TrueBooksDao.list);
		
		
		System.out.print("도서명: ");
		String input = scan.nextLine();
		
		TrueBooksDao.searchBooks(input);
		
		System.out.print("(임시) 빌릴 책의 isbn을 입력하세용");
		String isbn = scan.nextLine();
		
		RentalBookDao.borrowBooks(isbn);
		System.out.println("계속 진행하시려면 Enter를 입력해주세요.");
		scan.nextLine();
		
		if (UserDao.auth != null) {
			MemberView.memberMainView();
		} 
		
	}
	/* 중복
	public static void loginView() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===============================");
		System.out.println("[로그인]");
		System.out.println("===============================");
		
		System.out.print("ID: ");
		String id = scan.nextLine();
		
		System.out.print("PW: ");
		String pw = scan.nextLine();
		
		String result = UserDao.checkLogin(id, pw);
		
		switch(result) {
		
			case "0": Controller.moveToAdminMainView(); break;
			case "1": Controller.moveToMemberMainView(); break;
			default: System.out.println("잘못눌러따 다시해라");
		
		}
		
		
		
	}*/


	public static void loginViewforRental() {
		
		Scanner scan = new Scanner(System.in);
		
		boolean loop = true;
		
		while (loop) {
		
			System.out.println("===============================");
			System.out.println("[로그인]");
			System.out.println("===============================");
			
			System.out.print("ID: ");
			String id = scan.nextLine();
			
			System.out.print("PW: ");
			String pw = scan.nextLine();
			
			String result = UserDao.checkLogin(id, pw);
			
			switch(result) {
			
			case "0": System.out.println("회원 계정으로 로그인 해주세요"); break;
			case "1": loop = false; break;
			default: System.out.println("잘못눌러따 다시해라");
			
			}
			
		}
		
		
	}//(로그인 전) 도서 조회 > 대출 시 로그인 메서드
	
	

	public static void dash() {
		
		System.out.println("--------------------------------------------------------------");
	}

	public static void title(String title) {
		
		System.out.println("["+title+"]");
		
	}
	
	public static void load() {
		UserDao.load();
	}

}
