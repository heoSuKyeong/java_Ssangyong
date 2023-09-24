package com.project.library.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import com.project.library.model.vo.TrueBooksVo;

public class TrueBooksDao {

	public static ArrayList<TrueBooksVo> list;
	
	static {
		
		list = new ArrayList<TrueBooksVo>();
		
	}
	
	static String path = "data\\trueBook.txt";
	
	public static void load() {
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				
				String[] temp = line.split("\\|");
				
				TrueBooksVo t = new TrueBooksVo(temp[0], temp[1], temp[2], temp[3], temp[4]);
				
				TrueBooksDao.list.add(t);
				
			}
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("at BooksDao.load");
			e.printStackTrace();
		}
	}//load
	
	public static void save() {
		
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(path));
			
			for (TrueBooksVo t : list) {
				
				writer.write(String.format("%s,%s,%s,%s,%s\r\n"
										, t.getIsbn()
										, t.getTitle()
										, t.getAuthor()
										, t.getPublisher()
										, t.getLocation()));
			}
			
			writer.close();
			
			
		} catch (Exception e) {
			System.out.println("at TrueBooksDao.save");
			e.printStackTrace();
		}
		
		
	}//save
	
	public static void searchBooks(String keyword) {
		
		String status = "";
		
		
		//1. false books 돌고 2. true books 돌고 > 일단 지금은 true만 도는걸로 가정
		for (TrueBooksVo tv : list) {
			
			if (tv.getTitle().contains(keyword)) {
				
				status = RentalBookDao.checkReturnFlag(tv.getIsbn()) ? "대출 가능" : "대출중";
				
				System.out.print("책 이름: " + tv.getTitle() + "|");
				System.out.print("ISBN: " + tv.getIsbn() + "|");
				System.out.println("대여상태: " + status);
			}
			
			
			
		}
		
		
	}
	
//	public static void temp() {
//		
//		//기존 truebook 뒤에 ISBN 공백 없애기
//		
//		try {
//			
//			BufferedReader reader = new BufferedReader(new FileReader(path));
//			
//			String line = null;
//			
//			while ((line = reader.readLine()) != null) {
//				
//				String[] temp = line.split(",");
//				
//				TrueBooksVo t = new TrueBooksVo(temp[0].trim(), temp[1], temp[2], temp[3], temp[4]);
//				
//				TrueBooksDao.list.add(t);
//				
//			}
//			
//			reader.close();
//			
//		} catch (Exception e) {
//			System.out.println("at BooksDao.load");
//			e.printStackTrace();
//		}
//		
//		
//	}
	
	
	
	
	
	
	
}
