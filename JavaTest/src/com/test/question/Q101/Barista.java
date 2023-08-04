package com.test.question.Q101;

public class Barista {

//	에스프레소 1잔을 만든다.
//	int bean : 원두량(g)
//	return Espreeso : 에스프레소 1잔
	Espresso makeEspresso(int bean) {
		
		Coffee.espresso += 1;

		Espresso espresso = new Espresso();
		espresso.setBean(bean);
		
		return espresso;
	}
	
//	에스프레소 N잔을 만든다.
//	int bean : 원두량(g)
//	int count : 음료 개수(잔)
//	return Espresso[] : 에스프레소 N잔
	Espresso[] makeEspressoes(int bean, int count) {
		
		Espresso espressos[] = new Espresso[count];
		
		for (int i=0; i<count; i++) {
			Espresso espresso = new Espresso();

			espresso.setBean(bean);
			
			espressos[i] = espresso;
			Coffee.espresso += 1;
			
		}
		return espressos;
	}
	
//	라테 1잔을 만든다.
//	int baen : 원두량(g)
//	int milk : 우유량(ml)
//	return Latte : 라테 1잔
	Latte makeLatte(int bean, int milk) {
		
		Coffee.latte += 1;
		
		Latte latte = new Latte();
		latte.setBean(bean);
		latte.setMilk(milk);
		
		return latte;
		
		
	}
//	라테 N잔을 만든다.
//	int baen : 원두량(g)
//	int milk : 우유량(ml)
//	int count : 음료 개수(잔)
//	return Latte[] : 라테 N잔
	Latte[] makeLattes(int bean, int milk, int count) {
		
		Latte[] lattes = new Latte[count];;
		for (int i=0; i<count; i++) {
			
			Latte latte = new Latte();
			
			latte.setBean(bean);
			latte.setMilk(milk);

			lattes[i] = latte;

			Coffee.latte += 1;
			
		}
		return lattes;
		
	}
//	아메리카노 1잔을 만든다.
//	int baen : 원두량(g)
//	int water : 물량(ml)
//	int ice : 얼음 개수(개)
//	return Americano : 아메리카노 1잔
	Americano makeAmericano(int bean, int water, int ice) {
		
		Coffee.americano += 1;
		
		Americano americano = new Americano();
		americano.setBean(bean);
		americano.setIce(ice);
		americano.setWater(water);
		
		return americano;
		
	}
//	아메리카노 N잔을 만든다.
//	int baen : 원두량(g)
//	int water : 물량(ml)
//	int ice : 얼음 개수(개)
//	int count : 음료 개수(잔)
//	return Americano[] : 아메리카노 N잔
	Americano[] makeAmericanos(int bean, int water, int ice, int count) {
		
		Americano[] americanos = new Americano[count];;
		for (int i=0; i<count; i++) {
			
			Americano americano = new Americano();
			
			americano.setBean(bean);
			americano.setIce(ice);
			americano.setWater(water);
			
			americanos[i] = americano;
			
			Coffee.americano += 1;
			
		}
		return americanos;
		
	}
	
//	판매 결과를 출력한다.
//	음료 판매량(에스프레소 판매 개수, 라테 판매 개수, 아메리카노 판매 개수)
//	원자재 소비량(원두 소비량, 물 소비량, 우유 소비량, 얼음 소비량)
//	매출액(원두 판매액, 물 판매액, 우유 판매액, 얼음 판매액)
	void result() {
		
		System.out.println("=================================");
		System.out.println("판매 결과");
		System.out.println("=================================");
		System.out.println();
		
		System.out.println("---------------------------------");
		System.out.println("음료 판매량");
		System.out.println("---------------------------------");
		System.out.printf("에스프레소 : %d잔\n", Coffee.espresso);
		System.out.printf("아메리카노 : %d잔\n", Coffee.americano);
		System.out.printf("라테 : %d잔\n", Coffee.latte);
		
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("원자재 소비량");
		System.out.println("---------------------------------");
		System.out.printf("원두 : %,dg\n", Coffee.bean);
		System.out.printf("물: %,dml\n", Coffee.water);
		System.out.printf("얼음 : %,d개\n", Coffee.ice);
		System.out.printf("우유 : %,dml\n", Coffee.milk);
		System.out.println();
		
		System.out.println("---------------------------------");
		System.out.println("매출액");
		System.out.println("---------------------------------");
		System.out.printf("원두 : %,d원\n", Coffee.bean * Coffee.beanUnitPrice);
		System.out.printf("물: %,.0f원\n", Coffee.water * Coffee.waterUnitPrice);
		System.out.printf("얼음 : %,d원\n", Coffee.ice * Coffee.iceUnitPrice);
		System.out.printf("우유 : %,d원\n", Coffee.milk * Coffee.milkUnitPrice);
		
	}
	
	
}
