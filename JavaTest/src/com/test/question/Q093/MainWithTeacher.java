package com.test.question.Q093;

public class MainWithTeacher {
	
	public static void main(String[] args) {
		
		NoteWithTeacher note = new NoteWithTeacher();
		
		note.setSize("B4");
		note.setColor("노란색");
		note.setPage(25);
		note.setOwner("홍길동");
		
		System.out.println(note.info());
		
		
		NoteWithTeacher note2 = new NoteWithTeacher();
		
		note2.setSize("A4");
		note2.setColor("검정색");
		note2.setPage(100);
		
		System.out.println(note2.info());
	}
	

}
