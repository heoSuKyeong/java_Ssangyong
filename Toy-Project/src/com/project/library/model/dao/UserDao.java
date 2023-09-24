package com.project.library.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.project.library.model.vo.UserVo;

public class UserDao {

	public static UserVo auth; // 로그인 사용자 저장변수 
	
	public static ArrayList<UserVo> list;
	
	static {
		list=new ArrayList<UserVo>();
	}
	
	public static void load() {
		
		try {
			String dir="data\\User.txt";
			
			BufferedReader reader=new BufferedReader(new FileReader(dir));
			
			String line=null;
			
			while((line=reader.readLine()) != null) {
				String[] temp=line.split(",");
				
				list.add(new UserVo(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5],temp[6]));
				
			}
			
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void save() {
		
		try {
			String dir="data\\User.txt";
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(dir));
			
			for(UserVo uv : list) {
				String result=String.format("%s,%s,%s,%s,%s,%s,%s\r\n"
										,uv.getUserNo()
										,uv.getName()
										,uv.getTel()
										,uv.getEmail()
										,uv.getId()
										,uv.getPw()
										,uv.getLevel());
				writer.write(result);
			}
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String checkLogin(String id, String pw) {
		
		if (id.equals("0") || pw.equals("0")) {
			return "-1";
		}
		
		String level="-1";
		
		for(UserVo uv : list) {
			if(uv.getId().equals(id) && uv.getPw().equals(pw)) {
				level=uv.getLevel();
				auth = uv;
				break;
			}
		}
		return level;
	}
	
	//회원가입
	public static boolean checkJoin(String name, String tel, String email, String id, String pw) {
		
		if (name.isEmpty() || tel.isEmpty() || email.isEmpty() || id.isEmpty() || pw.isEmpty()) {
			System.out.println("빈 값이 존재합니다. 모든 값을 입력해주세요.");
			return false;
		}
		
		String regex = "";
		Pattern p1 = null;
		Matcher m1 = null;
		
		//이름
		regex =  "^[가-힣]{2,5}$";
		p1 = Pattern.compile(regex);
		m1 = p1.matcher(name);
		if(!(m1.find())) {
			System.out.println("이름은 한글 2~5자 이내로 작성해주세요.");
			return false;
		}
		
		//전화번호
		regex = "(\\d{3})-(\\d{4})-(\\d{4})";
		p1 = Pattern.compile(regex);
		m1 = p1.matcher(tel);
		if(!(m1.find())) {
			System.out.println("전화번호는 \"010-XXXX-XXXX\" 형식으로 작성해주세요.");
			return false;
		}
		
		//이메일
		regex =  "^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$";
		p1 = Pattern.compile(regex);
		m1 = p1.matcher(email);
		if(!(m1.find())) {
			System.out.println("이메일은 \"XXX@XXX.XXX\" 형식으로 작성해주세요.");
			return false;
		}		

		//아이디
		regex = "^[A-za-z_]\\w{4,15}$";
		p1 = Pattern.compile(regex);
		m1 = p1.matcher(id);
		if(!(m1.find())) {
			System.out.println("아이디는 숫자로 시작 불가능하며 영어+숫자 조합으로 4~15글자 작성해주세요.");
			return false;
		}
		
		for(UserVo uv : list) {
			if (id.equals(uv.getId())) {
				System.out.println("중복된 아이디가 있습니다.");
				return false;
			}
		}
		
		//패스워드
		regex = "^[A-Za-z0-9]{4,15}$";
		p1 = Pattern.compile(regex);
		m1 = p1.matcher(pw);
		if(!(m1.find())) {
			System.out.println("패스워드는 숫자로 시작 불가능하며 영어+숫자 조합으로 4~15글자 작성해주세요.");
			return false;
		}		
		
		
		return true;
	}

	public static void userAdd(String name, String tel, String email, String id, String pw) {
		
		for (UserVo uv : list) {
			
		}
		
		String maxNo = list.stream()
							.map(s -> s.getUserNo())
							.map(s -> s.substring(1))
							.max((a,b) -> Integer.parseInt(a)- Integer.parseInt(b))
							.get();
		
		int no = Integer.parseInt(maxNo) +1;
		
		UserVo uv = new UserVo("U"+no, name, tel, email, id, pw, "1");
		list.add(uv);
		System.out.println("회원가입이 완료되었습니다.");
		
	}
	
	
}
