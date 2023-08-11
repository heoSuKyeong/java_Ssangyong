package com.test.java.dummy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Ex75_dummyData {
	public static void main(String[] args) throws IOException {
		/*
		프로그램 제작시의 데이터
		1. 테스트용 데이터 > 10%
		- 진짜 데이터
		- 직접 작성
		
		2. 더미 데이터 > 90%
		- 양만 채우는 용도
		- 프로그램으로 작성
		
		
		<게시판 사이트>
		
		회원가입 기능 + 회원 명단 목록
		- 저장 경로 : JavaTest > data > "member.txt"
		- 데이터 저장 규칙 : 1,홍길동,010-1234-5678,서울시 강남구 역삼동
		- 데이터 생성
		- 파일 내보내기
		*/
		
		//파일쓰기 객체
		BufferedWriter writer = new BufferedWriter(new FileWriter("data\\member.txt"));
		
		
		//회원 100명 생성
		
		Random rnd = new Random();
		
		String[] name1 = {"김","이","박","최","정","현","길","조","신","허"};
		String[] name2 = {"진","민","인","지","명","정","재","석","홍","수","경","혜","소"};
		
		String[] address1 = {"서울시","부산시","춘천시","대전시","천안시"};
		String[] address2 = {"강남구","동남구","성동구","강동구","중구"};
		String[] address3 = {"역삼동","행당동","구성동","대치동","천호동"};
		
		for (int i=0; i<100; i++) {
			
			//회원 번호
			int no = i+1;
			
			//회원 이름
			String name = name1[rnd.nextInt(name1.length)] + name2[rnd.nextInt(name1.length)] + name2[rnd.nextInt(name1.length)];
			
			//나이(20~60)
			int age = rnd.nextInt(41)+20;
			
			//연락처
			String tel ="010-" 
			+ (rnd.nextInt(9000)+1000)
			+ "-" 
			+ (rnd.nextInt(9000)+1000);
			
			//주소
			String address = address1[rnd.nextInt(address1.length)]
								+ " "
								+ address2[rnd.nextInt(address2.length)]
								+ " "
								+ address3[rnd.nextInt(address3.length)]
								+ " "
								+ (rnd.nextInt(100)+20)
								+ "번지";

			//데이터 저장 규칙 : 1,홍길동,010-1234-5678,서울시 강남구 역삼동
			writer.write(String.format("%d,%s,%d,%s,%s\r\n"
										,no
										, name
										, age
										, tel
										, address));
			
		}
		
		writer.close();
		
		System.out.println("데이터 생성 완료");
		
	}
}
