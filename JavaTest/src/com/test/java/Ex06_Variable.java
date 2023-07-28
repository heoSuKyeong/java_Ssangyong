package com.test.java;

public class Ex06_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//목표 : 자료형 + 변수 + 리터럴
		
		//1. 주변의 데이터 탐색! ex) 몸무게 저장할 변수 생성
		//2. 형태 + 길이 > 자료형 결정
		//3. 변수 생성 + 값 대입
		//4. 출력
		
		double myWeight = 70.5;
		System.out.println("제 몸무게는 " + myWeight + "kg입니다.");
		
		//각 자료형(값형 8가지, String 1가지) x 10회
		//정수 > byte(1), short(2), int(4), long(8)
		//실수 > float(단정도형), double(배정도형)
		//문자형 > char
		//논리형 > boolean(1)
		//참조형 > String : 문자열
		
		//1. byte : 나이, , 학년, 윈도우 버전, 강의실넘버, 오늘 날짜(달, 일), 학생수, 지하철라인, 
		byte myAge = 26;
		byte myGrade = 3;
		byte windowVersion = 11;
		byte lectureRoomNum = 1;
		byte academyFloor = 8;
		byte studentsNum = 24;
		byte todayMonth = 7;
		byte todayDay = 17;
		byte subwayLine = 2;
		byte timeToAcademy = 27;
		
		System.out.println("--------byte--------");
		System.out.println("1. 제 나이는 " + myAge + "살 입니다.");
		System.out.println("2. 저는 " + myGrade + "학년 입니다.");
		System.out.println("3. 컴퓨터 윈도우 버전은 " + windowVersion + "입니다.");
		System.out.println("4. 저는 " + lectureRoomNum + "번 강의실에서 강의를 듣습니다.");
		System.out.println("5. 학원은 " + academyFloor + "층에 있습니다.");
		System.out.println("6. 이 강의실에는 " + studentsNum + "명의 학생이 있습니다.");
		System.out.println("7~8. 오늘 날짜는 " + todayMonth + "월 " + todayDay + "일 입니다.");
		System.out.println("9. 저는 " + subwayLine + "호선을 타고 학원에 옵니다.");
		System.out.println("10. 집에서 학원까지 걸리는 시간은 " + timeToAcademy + "분 입니다.");
		
		//2. short : 시급,월급,희망연봉, 평균연봉,  출생년도,  이번년도, 졸업년도,책목차, 책 페이지, 책가격, 
		short hourlyWage = 9620;
		short salary = 201;
		short averageAnnualSalary = 3740;
		short desiredAnnualSalary = 3500;
		short myYearOfBirth = 1998;
		short todayYear = 2023;
		short yearOfGraduation = 2025;
		short bookIndex = 12;
		short bookPage = 441;
		short bookPrice = 27000;
		
		System.out.println("--------short--------");
		System.out.println("11. 올해 시급은 " + hourlyWage + "원 이다.");
		System.out.println("12. 월급으로 계산하면 " + salary + "만원을 받는다.");
		System.out.println("13. 개발자 1년차의 평균연봉은 " + averageAnnualSalary + "만원이다.");
		System.out.println("14. 나의 희망연봉은 " + desiredAnnualSalary + "만원이다.");
		System.out.println("15. 나는 " + myYearOfBirth + "년도에 태어났다.");
		System.out.println("16. 올해는 " + todayYear + "년이다.");
		System.out.println("17. 나는 " + yearOfGraduation + "년도에 졸업한다.");
		System.out.println("18. 교재의 목차는 " + bookIndex +"개로 이루어져있다.");
		System.out.println("19. 교재의 페이지는 " + bookPage + "쪽으로 이루어져있다.");
		System.out.println("20. 교재의 가격은 " + bookPrice + "원이다.");
		
		//3. int : 시간환산(시간, 분 > 초), 
//		int myStudentId = 2021059516;
//		int myBirthDate = 980427;
		int minute = 10;
		int minuteToSecond = 60 * minute;
		int hour = 1;
		int hourToSecond = hour * 60 * 60;
		int hourToMinute = hour * 60;
		int typeOfDataLearned = 9;
		int byteByte = 1;
		int shortByte = 2;
		int intByte = 4;
		int longByte = 8;
		int floatByte = 4;
		int doubleByte = 8;
		
		System.out.println("--------int--------");
//		System.out.println("21. 제 학번은 " + myStudentId + "입니다.");
//		System.out.println("22. 제 생년월일은 " + myBirthDate + "입니다.");
		System.out.println("21. " + minute + "분을 초로 환산하면 " + minuteToSecond + "초 입니다.");
		System.out.println("22. " + hour + "시간을 초로 환산하면 " + hourToSecond + "초 입니다.");
		System.out.println("23. " + hour + "시간을 분으로 환산하면 " + hourToMinute + "분 입니다.");
		System.out.println("24. 오늘 " + typeOfDataLearned + "개의 자료형을 배웠습니다.");
		System.out.println("25. byte형은 " + byteByte + "바이트 입니다.");
		System.out.println("26. short형은 " + shortByte + "바이트 입니다.");
		System.out.println("27. int형은 " + intByte + "바이트 입니다.");
		System.out.println("28. long형은 " + longByte + "바이트 입니다.");
		System.out.println("29. float형은 " + floatByte + "바이트 입니다.");
		System.out.println("30. double형은 " + doubleByte + "바이트 입니다.");
		
		//4. long : 가구수, 고령인구, 다문화가구, 외국인등록인구, 의료기관수, 주민등록인구, 출생아수, 혼인건수, 1인가구, 장애인인구
		long numOfHouseHold = 22022753L;
		long elderlyPopulation = 9500000L;
		long multiculturalHouseHold = 385219L;
		long foreignRegisteredPopulation = 1093891L;
		long numOfMedicalInstitution = 100396L;
		long residentPopulation = 51392745L;
		long numOfBabiesBorn = 249000L;
		long numOfMarriage = 191690L;
		long onePersonHousehold = 7165788L;
		long disabledPopulation = 2652860L;
		
		System.out.println("--------long--------");
		System.out.println("31. 2021년 기준 대한민국 가구수는 " + numOfHouseHold + "가구이다.");
		System.out.println("32. 2023년 기준 대한민국 고령인구 수는 " + elderlyPopulation + "명이다.");
		System.out.println("33. 2023년 기준 대한민국 다문화가구 수는 " + multiculturalHouseHold + "가구이다.");
		System.out.println("34. 2021년 기준 대한민국 외국인등록인구 수는 " + foreignRegisteredPopulation + "명이다.");
		System.out.println("35. 2022년 기준 대한민국 의료기관수 수는 " + numOfMedicalInstitution + "개소이다.");
		System.out.println("36. 2023년 기준 대한민국 주민등록인구 수는 " + residentPopulation + "명이다.");
		System.out.println("37. 2022년 기준 대한민국 출생아수 수는 " + numOfBabiesBorn + "명이다.");
		System.out.println("38. 2022년 기준 대한민국 혼인건수 수는 " + numOfMarriage + "건이다.");
		System.out.println("39. 2021년 기준 대한민국 1인가구 수는 " + onePersonHousehold + "가구이다.");
		System.out.println("40. 2022년 기준 대한민국 장애인인구 수는 " + disabledPopulation + "명이다.");
		
		//5. float :  코스피지수(지수, 전일대비증가, 증가퍼센트), 거리
		float kospiIndex = 2620.84F;
		float increaseIndex = 1.84F;
		float increasePercent = 0.07F;
		float distanceToAcademy = 8.8F;
		float seoulToIncheonDistance = 39.53247F;
		float myHeight = 158.6F;
		float myVision = 1.2F;
		float firstSemester = 4.1F;
		float sencondSemester = 4.3F;
		float myGrades = (firstSemester+sencondSemester) / 2;
		
		System.out.println("--------float--------");
		System.out.println("41. 오늘의 코스피지수는 " + kospiIndex + "포인트입니다.");
		System.out.println("42. 전일 대비 " + increaseIndex + "포인트 상승했습니다.");
		System.out.println("43. 전일 대비 " + increasePercent + "% 상승했습니다.");
		System.out.println("44. 집에서 학원까지 거리는 " + distanceToAcademy + "km 입니다.");
		System.out.println("45. 서울에서 인천까지 거리는 " + seoulToIncheonDistance + "km 입니다.");
		System.out.println("46. 제 키는 " + myHeight + "cm 입니다.");
		System.out.println("47. 제 시력은 " + myVision + "입니다.");
		System.out.println("48. 저의 1학기 성적은 " + firstSemester + "입니다.");
		System.out.println("49. 저의 2학기 성적은 " + sencondSemester + "입니다.");
		System.out.println("50. 저의 평균 성적은 " + myGrades + "입니다.");

		
		//6. double : 환율, 2021기대수명, 2021평균신장, 2023실업률, 2023고용률,2023근로시간
		double myBalance = 100123.456;
		double KRWToUSD = 1267.00;
		double KRWToJPY = 913.52;
		double KRWToEUR = 1423.98;
		double KRWToCNY = 176.46;
		double lifeExpectancy = 83.6;
		double averageHeight = 164.92;
		double unemploymentRate = 2.7;
		double employmentRate = 63.5;
		double workingHour = 154.6;
		
		
		System.out.println("--------double--------");
		System.out.println("51. 현재 저는 " + myBalance + "원 가지고 있습니다.");
		System.out.println("52. 가지고 있는 돈을 달러로 환산하면 " + (myBalance*KRWToUSD) + "달러 입니다.");
		System.out.println("53. 가지고 있는 돈을 엔화로 환산하면 " + (myBalance*KRWToJPY) + "엔 입니다.");
		System.out.println("54. 가지고 있는 돈을 유로로 환산하면 " + (myBalance*KRWToEUR) + "유로 입니다.");
		System.out.println("55. 가지고 있는 돈을 위안으로 환산하면 " + (myBalance*KRWToCNY) + "위안 입니다.");
		System.out.println("56. 2021년 기준 대한민국 기대수명은 " + lifeExpectancy + "년이다.");
		System.out.println("57. 2021년 기준 대한민국 평균신장은 " + averageHeight + "cm이다.");
		System.out.println("58. 2023년 기준 대한민국 실업률은 " + unemploymentRate + "%이다.");
		System.out.println("59. 2023년 기준 대한민국 고용률은 " + employmentRate + "%이다.");
		System.out.println("60. 2023년 기준 대한민국 근로시간은 " + workingHour + "시간이다.");
		
		//7. char : 국어, 수학, 영어, 한국사, 사회, 과학, 체육, 음악, 미술, 한문
		char korGrade = 'C';
		char mathGrade = 'A';
		char engGrade = 'B';
		char korHistoryGrade = 'A';
		char socialGrade = 'A';
		char scienceGrade = 'A';
		char phyGrade = 'A';
		char musicGrade = 'D';
		char artGrade = 'B';
		char chineseGrade = 'C';
		
		System.out.println("--------char--------");
		System.out.println("61. 나의 국어 성적은 " + korGrade + "등급이다.");
		System.out.println("62. 나의 수학 성적은 " + mathGrade + "등급이다.");
		System.out.println("63. 나의 영어 성적은 " + engGrade + "등급이다.");
		System.out.println("64. 나의 한국사 성적은 " + korHistoryGrade + "등급이다.");
		System.out.println("65. 나의 사회 성적은 " + socialGrade + "등급이다.");
		System.out.println("66. 나의 과학 성적은 " + scienceGrade + "등급이다.");
		System.out.println("67. 나의 체육 성적은 " + phyGrade + "등급이다.");
		System.out.println("68. 나의 음악 성적은 " + musicGrade + "등급이다.");
		System.out.println("69. 나의 미술 성적은 " + artGrade + "등급이다.");
		System.out.println("70. 나의 한문 성적은 " + chineseGrade + "등급이다.");
		
			
		
		//8. boolean : 결혼여부, 취업여부, 학교 졸업여부, 컴활자격증여부, 운전면허소유여부,  자동차소유여부, 형제여부, 자매여부,  
		boolean isMarriage = false;
		boolean isEmployment = false;
		boolean isGraduation = true;
		boolean isComputerCertificate = true;
		boolean isDriverLicense = true;
		boolean isCarOwnership = false;
		boolean isBrother = false;
		boolean isSister = true;
		boolean isOnePersonHouseHold = true;
		boolean isHomeOwnership = false;
		
		
		System.out.println("--------boolean--------");
		System.out.println("71. 결혼여부: " + isMarriage);
		System.out.println("72. 취업여부: " + isEmployment);
		System.out.println("73. 학교졸업여부: " + isGraduation);
		System.out.println("74. 컴퓨터자격증여부: " + isComputerCertificate);
		System.out.println("75. 운전면허소유여부: " + isDriverLicense);
		System.out.println("76. 자동차소유여부: " + isCarOwnership);
		System.out.println("77. 형제여부: " + isBrother);
		System.out.println("78. 자매여부: " + isSister);
		System.out.println("79. 1인가구여부: " + isOnePersonHouseHold);
		System.out.println("80. 집소유여부: " + isHomeOwnership);
		
		
		//9. String : 학원이름, 학원주소, 교재명, 지으니, 출판사, 컴퓨터 모델명, 제조년도, ide이름, 점심시간, 점심메뉴
		
		String academyName = "쌍용교육센터";
		String academyAddress = "강남구";
		String textbookName = "채쌤의 자바 프로그래밍 핵심";
		String writer = "채규태";
		String publisher = "쌤즈";
		String computerModelName = "Dell";
		String yearOfManufacture = "2020";
		String IDEName = "이클립스";
		String lunchTime = "1시";
		String lunchMenu = "볶음밥";
		
		System.out.println("--------String--------");
		System.out.println("81. 이 학원의 이름은 " + academyName + "이다.");
		System.out.println("82. 이 학원의 위치는 " + academyAddress + "이다.");
		System.out.println("83. 교재의 이름은 " + textbookName + "이다.");
		System.out.println("84. 교재의 작가는 " + writer + "이다.");
		System.out.println("85. 교재의 출판사는 " + publisher + "이다.");
		System.out.println("86. 학원에 있는 컴퓨터 모델명은 " + computerModelName + "이다.");
		System.out.println("87. 이 컴퓨터의 제조년도는 " + yearOfManufacture + "년이다.");
		System.out.println("88. 수업 중 사용하는 IDE 프로그램은 " + IDEName + "이다.");
		System.out.println("89. 학원의 점심시간은 " + lunchTime + "이다.");
		System.out.println("90. 오늘 나의 점심메뉴는 " + lunchMenu + "이다.");
		
		
	}

}
