package com.project.library.controller;
import java.util.ArrayList;
import com.project.library.model.dao.FalseBooksDao;
import com.project.library.model.dao.OverdueBookDao;
import com.project.library.model.dao.RentalBookDao;
import com.project.library.model.dao.TrueBooksDao;
import com.project.library.model.dao.UserDao;
import com.project.library.view.AdminView;
import com.project.library.view.MainVIew;
import com.project.library.view.MemberView;
import com.project.library.view.MsgView;

import com.project.library.model.dao.ApplyBookDao;
import com.project.library.model.vo.ApplyBookVo;
import com.project.library.model.vo.RentalBookVo;
import com.project.library.view.ApplyBookView;
import com.project.library.view.RentalChView;


public class Controller {

	public static void mainView() {//main > MainView
		FalseBooksDao.load();
		TrueBooksDao.load();
		RentalBookDao.load();
		OverdueBookDao.load();
		UserDao.load();
		MainVIew.startView();
	}

	public static void msg(String msg) {
		MsgView.msg(msg);
		
	}

	public static String login(String id, String pw) {
		return UserDao.checkLogin(id, pw);
	}
	
	//회원가입
	public static boolean join(String name, String tel, String email, String id, String pw) {
		
		return UserDao.checkJoin(name, tel, email, id, pw);
	}

	public static void userAdd(String name, String tel, String email, String id, String pw) {
		UserDao.userAdd(name, tel, email, id, pw);
	}

	
	public static void moveToAddBooksView() {
		
		AdminView.addBooksView();
	}

	public static void moveToLoginView() {
		
		MainVIew.loginView();
	}
	
	public static void moveToAdminMainView() {
		
		
		AdminView.adminMainView();
	}
	
	public static void moveToMemberMainView() {
		
		MemberView.memberMainView();
	}
	
	public static void moveToBorrowBooksView() {
		MemberView.borrowBooksView();
	}
	
	public static void rentalbooks() {
		ArrayList<RentalBookVo> result=RentalBookDao.getRentalBooks();
		RentalChView.rentalView(result);
	}

	public static void applybookView() {
		ApplyBookView.applyBookView();
	}

	public static ArrayList<ApplyBookVo> applyBooks() {
		ArrayList<ApplyBookVo> abs=ApplyBookDao.getBook();
		
		return abs;
	}

	public static void setApplyBook(ApplyBookVo b) {
		ApplyBookDao.setApplyBook(b);
		
	}
	
	

}
