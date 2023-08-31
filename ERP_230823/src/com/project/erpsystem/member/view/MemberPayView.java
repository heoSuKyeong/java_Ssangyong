package com.project.erpsystem.member.view;

import java.util.Scanner;

import com.project.erpsystem.dao.PayDao;
import com.project.erpsystem.main.UserDao;
/**
 * 일반회원 급여명세서 조회 화면 전용 클래스
 * @author 허수경
 *
 */
public class MemberPayView {
	/**
	 * 서브제목 출력하는 메소드
	 */
	public static void subTitle() {
		
		System.out.println("[급여명세서 확인]");
		
	}
	
	/**
	 * 조회할 년, 월 입력받는 메소드
	 */
	public static void paycheck() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("연도를 입력하세요: ");
		String year = scan.nextLine();
		
		System.out.print("월을 입력하세요: ");
		String month = scan.nextLine();
		
		
		if (!PayDao.isExistence(UserDao.auth.getId(), month)) {
			System.out.println("해당 날짜의 급여명세서가 없습니다.");
			System.out.println("계속 진행하시려면 Enter를 입력해주세요.");
			scan.nextLine();
		} else {
			
			PayDao.listShow(month, UserDao.auth.getId());
		}
		
		
	}
}
