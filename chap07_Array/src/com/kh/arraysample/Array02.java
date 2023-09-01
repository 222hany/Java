package com.kh.arraysample;

public class Array02 {

	public static void main(String[] args) {
		/*
		// 1. 배열의 길이를 선언
		int[] num = new int[10]; // 길이가 10인 배열을 선언.
		// 1~10 까지의 반복문을 이용해서 순서대로 배열 인덱스에 넣은 후
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
			System.out.println(num[i]);
		}
		// 그 값을 출력
		for (int i = 1; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		
		//길이가 10인 배열을 선언. 1~10까지의 값을 반복문을 이용해 역순으로 배열 인덱스에 넣은 후 그 값을 출력.
		int[] num1 = new int[10];

		int value = 10; // num1.length = 10
		for (int i = 0; i < num1.length; i++) {
			num1[i] = value--;
			System.out.println(num1[i]);
		}
		*/
		
		//길이가 5인 String 배열을 선언. 사과,귤,포도,복숭아,참외로 초기화 한 후 배열 인덱스를 활용하여 귤을 출력.
		String[] fruit = {"사과", "귤", "포도", "복숭아", "참외"};
		int fruitLength = fruit.length;
		System.out.println(fruit[1]);

	}

}
