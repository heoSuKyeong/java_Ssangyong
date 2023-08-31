package com.project.erpsystem.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import com.project.erpsystem.admin.view.DeducationView;
import com.project.erpsystem.vo.PayItemVo;

/**
 * 관리자의 사회보험 관리 전용 클래스
 * @author 허수경
 *
 */
public class PayItemDao {


	public static ArrayList<PayItemVo> list;
	
	static {
		PayItemDao.list = new ArrayList<PayItemVo>();
	}
	
	/**
	 * 사회보험 파일을 ArrayList로 저장하는 메소드
	 */
	public static void load() {
		String path = "data\\payItem.txt";
		
		File file = new File(path);
		//파일이 없으면 load를 멈춘다.
		if(!file.exists()) {
			return;
		}
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			String line = null;
			while((line=reader.readLine())!=null) {
				
				String[] temp = line.split(",");
				PayItemVo payItem = new PayItemVo(Integer.parseInt(temp[0])
													,temp[1]
													,Boolean.parseBoolean(temp[2]));
				PayItemDao.list.add(payItem);
			}
			
			reader.close();
			
			
		} catch (Exception e) {
			System.out.println("at PayItemDao.load");
			e.printStackTrace();
		}
	}//load
	
	
	public static void save() {
		
		
		
	}//save
	
	/**
	 * 사회보험 출력하는 메소드
	 */
	public static void listShow() {
		
		System.out.printf("%3s%10s\t\t%s\n", "[번호]", "[항목]", "[사용여부]");
		for (PayItemVo payItem : PayItemDao.list) {
			System.out.printf("%3d%10s\t\t%b\n", payItem.getNum(), payItem.getPayItem(), payItem.isToUse());
		}
		
	}
	
	
	//사용여부 변경
	/**
	 * 사회보험 사용여부 변경하는 메소드
	 * @param num 수정할 항목 번호
	 * @return 수정여부
	 */
	public static boolean toUseChange(int num) {
		
		boolean frag = false;
		for (PayItemVo payItem : PayItemDao.list) {
			if (payItem.getNum() == num) {
				payItem.setToUse(!payItem.isToUse());;
				frag = true;
				break;
			}
		}
		
		if (!frag) {
			System.out.println("유효한 번호를 입력해주세요");
			return false;
		}
		System.out.println("변경되었습니다.");
		return frag;
	}
	
	//항목 추가
	/**
	 * 사회보험 항목 추가하는 메소드
	 * @param item 추가할 사회보험 항목
	 */
	public static void itemAdd(String item) {
		
		//일련번호 > 모든 일련번호 중 가장 큰 숫자를 확인
		Integer maxNo = PayItemDao.list.stream()
									.map(s -> s.getNum())
									.max((a,b) -> a- b)
									.get();
				
		int no = maxNo +1;
		
		PayItemVo d = new PayItemVo(no, item, true);
		PayItemDao.list.add(d);	//새로운 항목 추가
		
		System.out.println("추가되었습니다.");
		
	}
	
	//항목삭제
	/**
	 * 사회보험 항목 삭제하는 메소드
	 * @param num 삭제할 항목 번호
	 * @return 삭제여부
	 */
	public static boolean delete(int num) {
		boolean frag = false;
		
		for (PayItemVo payItem : PayItemDao.list) {
			if (payItem.getNum() == num) {
				frag = true;
				PayItemDao.list.remove(payItem);
				break;
			}
		}
		if(frag) {
			System.out.println("삭제했습니다.");
			return true;
		} else {
			System.out.println("해당 항목이 존재하지 않습니다.");
			return false;
		}
	} 
	
}
