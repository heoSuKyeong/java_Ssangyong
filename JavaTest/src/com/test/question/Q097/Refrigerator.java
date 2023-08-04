package com.test.question.Q097;

public class Refrigerator {
	private Item[] items = new Item[100];
	private int index = 0;
	
	
	//냉장고에 음식 넣기
	public void add(Item item) {
		
		if (index>this.items.length) {
			System.out.println("냉장고가 꽉 찼습니다.");
			return;
		}
		
		this.items[this.index] = item;
		this.index++;
		
		System.out.printf("'%s'를 냉장고에 넣었습니다.\n", item.getName());
		
	}
	
	//냉장고에서 아이템 꺼내기
	public Item get(String name) {
		
		int index=0;
		
		for (int i=0; i<this.items.length; i++) {
			if (this.items[i].getName().equals(name)) {
				index=i;
				break;
			}
		}
		
//		Item food = this.items[index];
		
		for (int i=index; i<this.items.length-1; i++) {
			this.items[i] = this.items[i+1];
		}
		return this.items[index];
		
	}
	
	//냉장고 안의 총 아이템 개수
	public int count() {
		int cnt =0;
		int i=0;
		while(true) {
			if (this.items[i]==null) {
				break;
			}
			i++;
			cnt++;
		}
		return cnt;
		
	}
	
	
	//냉장고 아이템 목록
	public void listItem() {
		
		System.out.println();
		
		System.out.println("[냉장고 아이템 목록]");
		
		int i=0;
		while(true) {
			if (this.items[i]==null) break;
			System.out.printf("%s(%tF)\n", this.items[i].getName(), this.items[i].getExpiration());
			i++;
		}
		
	}

}
