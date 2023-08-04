package com.test.question.Q100;

public class Packer {

//	연필 포장 개수(개)
	static int pencilCount;
//	지우개 포장 개수(개)
	static int eraserCount;
//	볼펜 포장 개수(개)
	static int ballPoinPenCount;
//	자 포장 개수(개)
	static int rulerCount;
	
	private boolean isPacke = false;
	
//	연필을 검수하고 포장한다.
//	Pencil pencil : 연필
	void packing(Pencil pencil) {
		
		System.out.println(pencil.info());
		
		// 4B, 3B, 2B, B, HB, H, 2H, 3H, 4H
		String[] hardnessAry = { "4B", "3B", "2B", "B", "HB", "H", "2H", "3H", "4H" };

		for (int i = 0; i < hardnessAry.length; i++) {
			if (pencil.getHardness().equals(hardnessAry[i])) {
				Packer.pencilCount++;
				isPacke = true;
			}
		}
		
		if (isPacke) {
			System.out.println("포장을 완료했습니다.");
		} else {
			System.out.println("포장을 실패했습니다.");
			
		}
	}
//	지우개를 검수하고 포장한다.
//	Eraser eraser : 지우개
	void packing(Eraser eraser) {
		
		System.out.println(eraser.info());
		System.out.println("포장을 완료했습니다.");
		
	}
//	볼펜을 검수하고 포장한다.
//	BallPointPen ballPointPen : 볼펜
	void packing(BallPointPen ballPointPen) {
		
		System.out.println(ballPointPen.info());
		System.out.println("포장을 완료했습니다.");
	}

//	자를 검수하고 포장한다.
//	Ruler ruler : 자
	void packing(Ruler ruler) {
		
		System.out.println(ruler.info());
		System.out.println("포장을 완료했습니다.");
		
	}
	
//	포장한 내용물 개수를 출력한다.
//	int type : 출력할 내용물의 종류
//	0 : 모든 내용물
//	1 : 연필
//	2 : 지우개
//	3 : 볼펜
//	4 : 자
	void countPacking(int type) {
		System.out.println("=====================");
		System.out.println("포장 결과");
		System.out.println("=====================");
		
		switch (type) {
		case 0:
			System.out.println("연필 " + pencilCount + "회");
			System.out.println("지우개 " + eraserCount + "회");
			System.out.println("볼펜 " + ballPoinPenCount + "회");
			System.out.println("자 " + rulerCount + "회");
			System.out.println();
			break;
		case 1:
			System.out.println("연필 " + pencilCount + "회");
			System.out.println();
			break;
		case 2:
			System.out.println("지우개 " + eraserCount + "회");
			System.out.println();
			break;
		case 3:
			System.out.println("볼펜 " + ballPoinPenCount + "회");
			System.out.println();
			break;
		case 4:
			System.out.println("자 " + rulerCount + "회");
			System.out.println();
			break;
		default:
			break;
		}
		
	}
	
}
