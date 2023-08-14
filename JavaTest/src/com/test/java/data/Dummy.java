package com.test.java.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Dummy {
	public static void main(String[] args) throws IOException {
		
		//학생 데이터 생성
		//- 학년 > 1~3학년
		//- 반 > 3학급
		//- 번호 > 10명
		
		
		int n =1;
		String[] name1 = {"김","이","박","최","정"};
		String[] name2 = {"수","소","경","빈","재","석","진","래","명","여"};
		
		Random rnd = new Random();
		
		BufferedWriter writer = new BufferedWriter(new FileWriter("data\\student.txt"));
		
		for (int i=1; i<=3; i++) {	//학년
			
			for (int j=1; j<=5; j++) {	//학급
				
				for (int k=1; k<=10; k++) {	//번호==학생수
					
					//일련번호,학생명,학년,반,번호
					String name = name1[rnd.nextInt(name1.length)]+ name2[rnd.nextInt(name2.length)] + name2[rnd.nextInt(name2.length)];
					
					String s = String.format("%d,%s,%d,%d,%d\n"
												,n++
												,name
												,i
												,j
												,k);
					
//					System.out.println(s);
					writer.write(s);
				}
			}
			
		}
		writer.close();
		
		
	}
}
