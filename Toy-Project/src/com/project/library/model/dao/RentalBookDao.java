package com.project.library.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import com.project.library.model.vo.OverdueBookVo;
import com.project.library.model.vo.RentalBookVo;
import com.project.library.view.MainVIew;

public class RentalBookDao {

	
	public static ArrayList<RentalBookVo> list;
	
	static {
		list = new ArrayList<RentalBookVo>();
	}
	
	static String path = "data\\rentalBook.txt";
	
	public static void load() {
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				
				String[] temp = line.split(",");
				
				RentalBookVo r = new RentalBookVo(Integer.parseInt(temp[0]), temp[1], temp[2], temp[3], temp[4], temp[5]);
				
				RentalBookDao.list.add(r);
				
				
			}
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("at RentalBookDao.load");
			e.printStackTrace();
		}
		
	}//load

	public static void save() {
		
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(path));
			
			for (RentalBookVo r : list) {
				
				writer.write(String.format("%d,%s,%s,%s,%s,%s\r\n"
										, r.getRentalNo()
										, r.getUserNo()
										, r.getIsbn()
										, r.getRentalDate()
										, r.getReturnDate()
										, r.getReturnFlag()));
			}
			
			writer.close();
			
		} catch (Exception e) {
			System.out.println("at RentalBookDao.save");
			e.printStackTrace();
		}
		
	}//save
	
	//도서 대출 메서드
	public static void borrowBooks(String isbn) {
//	public static void borrowBooks(String title, String author, String publisher, String isbn) {
//	public static void borrowBooks(String isbn, String auth) {
	
//		Scanner scan = new Scanner(System.in);
	
		/*
		1. 해당 도서의 '대출여부:가능' 상태 확인
		 - 가능? > 로그인 확인 메서드로 이동
		 - 불가? > '대출중인 도서입니다.' 출력
		
		2. 로그인 여부 확인(Auth null여부 확인)
		 - 로그인 전(Auth == null): 로그인 메서드로 이동
		 - 로그인 후(Auth !== null): 해댱 회원의 대출 가능 상태 확인 메서드로 이동
		
		3. 대출 가능 상태 확인
		 - 1) 연체 여부 확인
				- YES? > '연체로 인한 대출 제한으로 대출이 불가합니다.'
				- NO? > 대출중인 책 개수 확인
		 - 2) 대출중인 책 개수 확인
				- 10권 이하? > 대출 진행
				- 10권 > '1인 최대 대출 권수 초과로 대출이 불가합니다.'
		
		4. 대출 진행 > 해당 도서 대출여부 상태 변경
		*/
		
		//1. 해당 도서의 '대출여부: 가능' 상태 확인 > true: 가능, false 불가
		if (RentalBookDao.checkReturnFlag(isbn)) {
			
			//대출가능 > 로그인 상태 확인
		} else {
			System.out.println("대출중인 도서입니다.");
			return;
		}

		//2. 로그인 여부 확인
		if (UserDao.auth != null) { //auth에 로그인한 사용자의 정보가 담긴다는 가정 하 UserDao.auth 변수의 null값 여부 확인 진행
			//null이 아니면 로그인 한상태 니까 다음꺼 진행
		} else {
			System.out.println("로그인 후에 도서 대출이 가능합니다.");
			MainVIew.loginViewforRental(); //로그인 후에 다시 이 메서드로 돌아오면 다음 절차 이어서 하겠지?
		}
		
		//3. 대출 가능 상태 확인
		// 1) 연체 여부 확인
		//연체회원 테이블에서 회원코드가 auth와 동일하고, 오늘 날짜가 연체종료 날짜보다 이르면(거나 null이면 -이거 보류) 연체 > 대출X
		//					 오늘 날짜가 연체종료 날짜보다 늦으면 대출 O
		LocalDate now = LocalDate.now();
		
		
		for (OverdueBookVo o : OverdueBookDao.list) {
			
			if (o.getUserNo().equalsIgnoreCase(UserDao.auth.getUserNo())) {
			
				LocalDate endLocalDate = LocalDate.parse(o.getDelinquencyEndDate());
				
				if (now.isAfter(endLocalDate)) {
					
				} else {
					System.out.println("연체로 인한 대출 제한으로 대출이 불가합니다.");
					return;
					
				}
				
				
			}
		
		}
		
		
		// 2) 대출 중인 책 개수 확인
		//대여정보 테이블에서 회원코드가 auth와 동일하고, 반납 여부가 N이 10개면 대출 불가.
		//												반납 여부 N이 10미만이면 대출 가능
		int sum = 0;

		
		for (RentalBookVo r : list) {
			
			if (r.getUserNo().equalsIgnoreCase(UserDao.auth.getUserNo()) && r.getReturnFlag().equalsIgnoreCase("N")) {
				
				sum++;
			}
			
		}
		
		if (sum < 10) {
			
			//대출 가능

		} else {
			
			//대출 불가
			System.out.println("1인 최대 대출 권수 초과로 대출이 불가합니다.");
			return;
		}
		
		
		//4. 대출 진행
		
//		System.out.println("--------------------------");
//		System.out.println("[대출 희망 도서 정보]");
//		System.out.println("도서명: " + title);
//		System.out.println("저자: " + author);
//		System.out.println("출판사: " + publisher);
//		System.out.println("ISBN: " + isbn);
//		System.out.println("--------------------------");
//		System.out.print("위 도서를 대출하시겠습니까?(Y/N): ");
//		String input = scan.nextLine();
//		
//		if (input.equalsIgnoreCase("Y")) {
			
			//도서 대출
			Calendar cal = Calendar.getInstance();
			Calendar today = Calendar.getInstance();
			
			System.out.println("대출이 완료되었습니다.");
			cal.add(cal.DATE, 7);
			System.out.printf("반납기한: %tF\n", cal);
			RentalBookVo r = new RentalBookVo(list.size() + 1, UserDao.auth.getUserNo(), isbn, String.format("%tF", today),null,"N");
			list.add(r);
//		} else if (input.equalsIgnoreCase("N")) {
//			System.out.println("대출이 취소되었습니다.");
//		} else {
//			System.out.println("잘못 입력");
//		}
		
	}//borrowBooks
	
	
	
	//해당 도서의 대출여부 상태 반환 메서드(true: 대출 가능, false: 대출 불가)
	public static boolean checkReturnFlag(String isbn) {

		for (RentalBookVo r : list) {
			
			if (r.getIsbn().equals(isbn)) {
				
				if (r.getReturnFlag().equalsIgnoreCase("Y")) {
					return true; //"Y" 반납 완료면 대출 가능 > true 반환
				} else {
					return false; //"N" 반납 전이면 대출 불가 > false 반환
				}
			}
			
		}
		return true; //대출이력이 아예 없으면 대출 가능 > true 반환
	}
	
	
	public static ArrayList<RentalBookVo> getRentalBooks() {
		ArrayList<RentalBookVo> bs =new ArrayList<RentalBookVo>();
		
		for(RentalBookVo b : list) {
			if(b.getUserNo().equals("U100")) { // 회원정보일치 대여책 가져오기 U100 은 회원번호, 나중에 로그인 정보에서 가져온거랑 바꾸기
				bs.add(b);
			}
		}
		
		return bs;
	}
	
	
}
