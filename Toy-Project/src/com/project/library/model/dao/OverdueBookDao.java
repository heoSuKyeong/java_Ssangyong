package com.project.library.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

import com.project.library.model.vo.OverdueBookVo;

public class OverdueBookDao {

	
	public static ArrayList<OverdueBookVo> list;
	public static ArrayList<OverdueBookVo> overdueUserList;
	
	static {
		
		list = new ArrayList<OverdueBookVo>();
		overdueUserList = new ArrayList<OverdueBookVo>();
	}
	
	static String path = "data\\overdueBook.txt";
	
	public static void load() {
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				
				String[] temp = line.split(",");
				
				OverdueBookVo o = new OverdueBookVo(temp[0], Integer.parseInt(temp[1]), temp[2], temp[3]);
				
				OverdueBookDao.list.add(o);
				
			}
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println("at OverdueBookDao.load");
			e.printStackTrace();
		}
		
	}//load
	
	public static void save() {
		
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(path));
			
			for (OverdueBookVo o : list) {
				
				writer.write(String.format("%s,%d,%s,%s\r\n"
										, o.getUserNo()
										, o.getRentalNo()
										, o.getDelinquencyStartDate()
										, o.getDelinquencyEndDate()));
			}
			
			writer.close();
			
		} catch (Exception e) {
			System.out.println("at OverdueBookDao.save");
			e.printStackTrace();
		}
		
		
		
	}//save
	
	//연체 회원 조회
	public static void isoverdueUser()   {
		
		//현재 날짜
		Date now = new Date();
		
		for (OverdueBookVo ob : list) {
			
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			
			Date endDate;
			try {
				endDate = simpleDateFormat.parse(ob.getDelinquencyEndDate());

				int result = now.compareTo(endDate);
				if (result < 0) {
					OverdueBookDao.overdueUserList.add(ob);
				}

			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}//isoverdueUser
	
}
