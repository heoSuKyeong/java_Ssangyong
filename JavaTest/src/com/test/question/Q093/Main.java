package com.test.question.Q093;

public class Main {
	
	public static void main(String[] args) {
		
		Note note = new Note();

		note.setSize("A8");
		note.setColor("흰색");
		note.setPage(100);
		note.setOwner("홍길동");

		System.out.println(note.info());


		Note note2 = new Note();

		note2.setSize("A4");
		note2.setColor("검정색");
		note2.setPage(100);

		System.out.println(note2.info());
	}
}
