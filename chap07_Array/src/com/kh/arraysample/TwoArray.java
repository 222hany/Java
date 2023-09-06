package com.kh.arraysample;

public class TwoArray {

	public static void main(String[] args) {
		// 이중 문자열 배열 선언과 초기화
		String[][] fruits = {
				{"Apple", "Banana", "Cherry"},
				{"Grape", "Orange", "Strawberry"},
				{"Kiwi", "Mango", "Pineapple"}
		};
		
		System.out.println("fruits.length : " + fruits.length);
		
		for (int i = 0; i < fruits.length; i++) {         // 첫번째 for문은 행
			for (int a = 0; a < fruits[i].length; a++) {  // 두번째 for문은 열
				System.out.println(fruits[i][a] + " ");
			}
		System.out.println(); // 다음으로 이동할 수 있게 enter용 출력 매소드 입력
		}
	}

}
