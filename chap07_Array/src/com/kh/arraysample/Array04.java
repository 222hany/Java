package com.kh.arraysample;

public class Array04 {

	public static void main(String[] args) {
		//String[] fruitArray = {"사과", "딸기", "키위", "메론", "귤"};
		//사과에는 바나나, 딸기에는 수박, 키위에는 레몬, 메론에는 귤, 귤에는 오렌지.
		String[] fruitArray =  {"사과", "딸기", "키위", "메론", "귤"};
		fruitArray[0] = "바나나";
		fruitArray[1] = "수박";
		fruitArray[2] = "레몬";
		fruitArray[3] = "귤";
		fruitArray[4] = "오렌지";
		System.out.println("사과 대신 : " + fruitArray[0]);
		System.out.println("딸기 대신 : " + fruitArray[1]);
		System.out.println("키위 대신 : " + fruitArray[2]);
		System.out.println("메론 대신 : " + fruitArray[3]);
		System.out.println("귤 대신 : " + fruitArray[4]);
	}

}
