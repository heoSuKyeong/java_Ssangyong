package com.test.java.obj;

public class Ex41_Class {

	public static void main(String[] args) {
		
		//Pencil, PencilCase
		
		PencilCase pcase = new PencilCase();
		pcase.setColor("파란색");
		
		/*
		for (int i=0; i<5; i++) {
			
			Pencil p1 = new Pencil();
			p1.setHardness("HB");
			p1.setColor("검은색");
			
			//[index] : 인덱서(Indexer) - 표기법
			pcase.getPencil()[i] = p1;
		}
		
		for (int i=0; i<5; i++) {
			System.out.println(pcase.getPencil()[i].info());
		}
		*/
		
		for (int i=0; i<5; i++) {
			Pencil p = new Pencil();
			p.setHardness("B");
			p.setColor("하늘색");
			pcase.add(p);
			
		}
		System.out.println(pcase.info());
		
		Pencil p2 = pcase.get(2);
		
		System.out.println(pcase.info());
	}
	
	
}
