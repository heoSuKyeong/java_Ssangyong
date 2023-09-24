package com.project.library.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.project.library.model.vo.FalseBooksVo;
import com.project.library.model.vo.TrueBooksVo;

public class FalseBooksDao {

	public static ArrayList<FalseBooksVo> list;
	
	static {
		
		list = new ArrayList<FalseBooksVo>();
	}
	
	static String path = "data\\falseBook.txt";
	
	public static void load() {
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				
				String[] temp = line.split(",");
				
				FalseBooksVo f = new FalseBooksVo(temp[0], temp[1], temp[2], temp[3], temp[4]);
				
				FalseBooksDao.list.add(f);
				
			}
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("at FalseBooksDao.load");
			e.printStackTrace();
		}
	}//load
	
	
	public static void save() {
		
		
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(path));
			
			for (FalseBooksVo f : list) {
				
				writer.write(String.format("%s,%s,%s,%s,%s\r\n"
										, f.getIsbn()
										, f.getTitle()
										, f.getAuthor()
										, f.getPublisher()
										, f.getLocation()));
			}
			
			writer.close();
			
			
		} catch (Exception e) {
			System.out.println("at FalseBooksDao.save");
			e.printStackTrace();
		}
		
	}//save
	
	//도서 추가 메서드 > ISBN, 도서명, 저자, 출판사 매개변수로 받기
	public static void addBooks(String isbn, String title, String author, String publisher) {
		
		//1. 도서 기존재여부 'ISBN'으로 확인 > (1)truebooks, (2)falsebooks 확인 > 밖에 Admin View쪽으로 빼기.
		//2. 있으면 '기존에 등록된 도서입니다.'
		//3. 없으면 list에 추가 > 위치 자동 생성 (일련번호가 필요한가? 필요없을듯) + '<title> 도서가 추가되었습니다.'
		
		//1. 도서 기존재여부 'ISBN'으로 확인 > 밖에 Admin View 쪽으로 뺌.
//		if (checkBookStock(isbn)) {
//		
//			System.out.println("기존에 등록된 도서입니다.");
//			return;
//		} else { //list에 도서 객체 추가 전에 location 자동 생성
			
			
			String location = createLocation(author);
			
			FalseBooksVo f = new FalseBooksVo(isbn, title, author, publisher, location);
			
			list.add(f);
			
			System.out.printf("<%s> 도서가 추가되었습니다.\n",title);
			
//		}
		
		
	}//addBooks
	
	//도서 위치를 랜덤으로 생성하는 메서드
	private static String createLocation(String author) {

		//기존 위치와 중복검사를 진행해야 하나? 근데 한 위치에 여러개있을수도있쨔낭 이거잠깐 보류
		Random random = new Random();
		
		return (random.nextInt(701) + 100) + "." + author.substring(0, 1);
		
	}//createLocation


	//도서 기존재여부를 'ISBN'으로 확인하는 메서드
	public static boolean checkBookStock(String isbn) {

//		boolean bookStock = false;
		/*
		(1) falsebooks를 확인한다.
			- 있다? > return true;
			- 없다? > truebooks를 확인한다.
		
		(2) truebooks를 확인한다.
			- 있다? > return true;
			- 없다? > return false;
		*/
		
		//falsebooks를 확인한다.
		for (FalseBooksVo f : FalseBooksDao.list) {
			
			if(f.getIsbn().equals(isbn)) {
				
//				bookStock = true;
//				return bookStock;
				return true;
			}
			
		}
		
		
		//truebooks를 확인한다.
		for (TrueBooksVo t : TrueBooksDao.list) {
			
			if(t.getIsbn().equals(isbn)) {
				
//				bookStock = true;
//				return bookStock;
				return true;
			}
			
			
		}
		
//		return bookStock;
		return false;
	}//checkBookStock


	public static boolean isValidIsbn(String isbn) {

		String regex = "^\\d{13}$";
		Pattern p1 = Pattern.compile(regex);
		Matcher m1 = p1.matcher(isbn);
		
		if (!m1.find()) {
			return false;
		}
		
		return true;
	}
	

	
	
}
