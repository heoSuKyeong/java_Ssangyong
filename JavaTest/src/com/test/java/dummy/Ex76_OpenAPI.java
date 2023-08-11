package com.test.java.dummy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Ex76_OpenAPI {
	public static void main(String[] args) {
		
		//OpenAPI, Open Application Programming Interface
		//- 공개된 프로그래밍 기능
		//- 공공 데이터 포털
		//- 구글, 아마존, 네이버, 다음 등에서 제공 
		//- 지도 기능
		//- 실제 데이터 확보 가능
		
		m1();
//		m2();	//JSONObject
		
		
		
	}

	private static void m2() {

		/*
		{
			"name": "홍길동",
			"age": 20,
			"tel": ["010-1234-5678","010-1111-2222", "010-3333-4444"]
		}
		
		
		*/
		
		String json = "		{\r\n"
				+ "			\"name\": \"홍길동\",\r\n"
				+ "			\"age\": 20,\r\n"
				+ "			\"tel\": [\"010-1234-5678\",\"010-1111-2222\", \"010-3333-4444\"]\r\n"
				+ "		}";
		
		//구문 해석기
		JSONParser parser = new JSONParser();
		
		try {
			
			//다운캐스팅
			JSONObject obj = (JSONObject)parser.parse(json);
			
			System.out.println(obj.get("name"));
			System.out.println(obj.get("age"));
			System.out.println(obj.get("tel"));
			
			JSONArray arr = (JSONArray)obj.get("tel");
			System.out.println(arr.size());
			
			for (Object t : arr) {
				System.out.println(t);
			}
			
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

	private static void m1() {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[지하철 정보 검색]");
		
		System.out.print("역검색: ");
		
		String name = scan.nextLine();
		
		
		//1. 요청 URL 만들기
		//상세기능 내 요청주소

		//데이터 받아오기, QueryString
		//http://apis.data.go.kr/1613000/SubwayInfoService/getKwrdFndSubwaySttnList?키=데이터&키=데이터
		
		String url = "http://apis.data.go.kr/1613000/SubwayInfoService/getKwrdFndSubwaySttnList?";
		
		//승인 받은 데이터의 일반 인증키(Encoding)
		url += "serviceKey=AWU1f088%2FVV23%2BsyldSRkB9R7W0aPPjvOzYchic9fzkzFibEutLntKVSRUhBgFCW3OL9gJNsbSefZBNmhutviQ%3D%3D";
		
		//XML or JSON
		url += "&_type=json";
		
		//데이터를 10개씩 가져오겠다.
		url += "&numOfRows=10";
		
		//ep
		url += "&pageNo=1";
		
		url += "&subwayStationName=" + URLEncoder.encode(name);
		
//		System.out.println(url);
		
		//QueryString
		//http://apis.data.go.kr/1613000/SubwayInfoService/getKwrdFndSubwaySttnList?키=데이터&키=데이터
		
		try {

			//URL 객체 생성
			URL obj_url = new URL(url);
			
			//URL와 연결하는 객체 생성 > 브라우저 대신 접속한다.
			HttpURLConnection conn = (HttpURLConnection)obj_url.openConnection();
			
			//지금은 그냥 옵션이라고 알아두기
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-type", "application/json");
			
			BufferedReader reader = null;
			
			//
			if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
				reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			} else {
				reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			
			
			//reader 가 검색 결과를 담고 있다.
			/*
			String line = null;
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
			*/
			
			JSONParser parser = new JSONParser();
			
			JSONObject root = (JSONObject)parser.parse(reader);
			
			JSONObject response = (JSONObject)root.get("response");
			
			JSONObject body = (JSONObject)response.get("body");
			
			JSONObject items = (JSONObject)body.get("items");
			
			
			ArrayList<String> temp = new ArrayList<String>();
			
			
			
			if (items.get("item") instanceof JSONObject) {
				
				//역이 하나
				JSONObject item = (JSONObject)items.get("item");
				System.out.println("1. ");
				System.out.printf("호선: %s\r\n역명: %s\n",item.get("subwayRouteName"), item.get("subwayStationName"));
				
				temp.add(item.get("subwayStationId").toString());
				
			} else {
				//역이 여러개
				
				JSONArray arr = (JSONArray)items.get("item");
				
				int n=1;
				for (Object obj : arr) {
					JSONObject item = (JSONObject)obj;
					System.out.println(n+".");
					System.out.printf("호선: %s\r\n역명: %s\n",item.get("subwayRouteName"), item.get("subwayStationName"));
					System.out.println("----------------------");
					
					n++;
					temp.add(item.get("subwayStationId").toString());
				}
				
			}
			
			reader.close();
			conn.disconnect();
			
			System.out.println("=================");
			System.out.print("역 선택: ");
			int sel = scan.nextInt();
			
			System.out.println(temp.get(sel-1));	//역ID
			
			
			//1. 요청 URL 만들기
			//상세기능 내 요청주소

			//지하철역 출구번호별로 주변시설의 목록을 조회
			url = "http://apis.data.go.kr/1613000/SubwayInfoService/getSubwaySttnExitAcctoCfrFcltyList?";
			
			//승인 받은 데이터의 일반 인증키(Encoding)
			url += "serviceKey=AWU1f088%2FVV23%2BsyldSRkB9R7W0aPPjvOzYchic9fzkzFibEutLntKVSRUhBgFCW3OL9gJNsbSefZBNmhutviQ%3D%3D";
			
			//XML or JSON
			url += "&_type=json";
			
			//데이터를 10개씩 가져오겠다.
			url += "&numOfRows=10";
			
			url += "&pageNo=1";
			
			url += "&subwayStationId=" + temp.get(sel-1);
			
			
			//2.
			obj_url = new URL(url);
			
			//URL와 연결하는 객체 생성 > 브라우저 대신 접속한다.
			conn = (HttpURLConnection)obj_url.openConnection();
			
			//지금은 그냥 옵션이라고 알아두기
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Content-type", "application/json");
			
			reader = null;
			
			//
			if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
				reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			} else {
				reader = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			
			JSONObject root2 = (JSONObject)parser.parse(reader);
			
			response = (JSONObject)root2.get("response");
			
			body = (JSONObject)response.get("body");
			
			items = (JSONObject)body.get("items");
			
			
			if (items.get("item") instanceof JSONObject) {
				
				JSONObject item = (JSONObject)items.get("item");
				
				System.out.println("출구번호: " + item.get("exitNo") + "번");
				System.out.println("주변시설: " + item.get("dirDesc"));
			} else {
				
				JSONArray arr = (JSONArray)items.get("item");
				
				for (Object obj : arr) {
					
					JSONObject item = (JSONObject)obj;
					
					System.out.println("출구번호: " + item.get("exitNo") + "번");
					System.out.println("주변시설: " + item.get("dirDesc"));
				}
			}
			
			reader.close();
			conn.disconnect();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
