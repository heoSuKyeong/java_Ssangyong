package com.test.question.Q095;

public class Employee {

	private String name;
	private String department;
	private String position;
	private String tel;
	private Employee boss;

	// getter, setter 구현

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		//조건 : 한글 2~5자 이내
		if (name.length() > 5 || name.length() < 2) {
			return;
		}
		
		for (int i=0; i<name.length(); i++) {
			char c = name.charAt(i);
			
			if (c<'가' || c>'힣') {
				return;
			}
		}
		
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		
		//조건 : 영업부, 기획부, 총무부, 개발부, 홍보부
		
		String departmentAry[] = {"영업부", "기획부", "총무부", "개발부", "홍보부"};
		
		for (int i=0; i<departmentAry.length; i++) {
			if (department.equals(departmentAry[i])) {
				this.department = department;
				return;
			}
		}
		
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		
		//조건 : 부장, 과장, 대리, 사원
		
		String positionAry[] = {"부장", "과장", "대리", "사원"};
		
		for (int i=0; i<positionAry.length; i++) {
			if (position.equals(positionAry[i])) {
				this.position = position;
				return;
			}
		}
		
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		
		//조건 : 010-XXXX-XXXX 형식 확인
		
		if (tel.length() < 1 || tel.length() > 13 ) {
			return;
		}
		
		if (tel.indexOf('-') != 3 || tel.indexOf('-',4) != 8) {
			return;
		}
		
		this.tel = tel;
	}

	public Employee getBoss() {
		return boss;
	}

	public void setBoss(Employee boss) {
		
		//조건 : 다른 직원 중 한명, 같은 부서가 아니면 될 수 없음(유효성 검사
		if (boss == null) {
			return;
		}
		if (!boss.getDepartment().equals(this.department)) {
			return;
		}
		this.boss = boss;
	}

	public void info() {
		
		System.out.println("[" + this.name + "]");
		System.out.println("부서: " + this.department);
		System.out.println("직위: " + this.position);
		System.out.println("연락처: " + this.tel);
		
		if (this.boss == null) {
			System.out.println("직속상사: 없음");
		} else {
			
			System.out.printf("직속상사: %s(%s %s)" , this.boss.name, this.boss.department, this.boss.position);
		}
		System.out.println();
		
	}

}
