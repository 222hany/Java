package com.kh.listAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {

	public static void main(String[] args) {
		ListArray1();
		ListArray2();
	}
		
		public static void ListArray1() {
		
		// Array 예제
		int[] intArray = new int[2]; // 크기가 5인 정수 배열 생성.
		intArray[0] = 1;
		intArray[1] = 2;
		//intArray[2] = 3; // 크기를 지정해뒀기 때문에 오류.
		
		// Array를 출력
		System.out.println("Array요소 : ");
		for(int a = 0; a < intArray.length; a++) {
			System.out.print(intArray[a] + " ");
		}
		System.out.println(); // 개행문자 포함되어 있어 enter같은 역할.
		
		// List 예제
		List<Integer> intList = new ArrayList<>(); // Integer 객체를 저장하는 ArrayList를 생성.
		intList.add(1);
		intList.add(2);
		intList.add(3); // 크기가 지정되어 있지 않기때문에 얼마든지 추가 가능.
		
		// List를 출력
		System.out.println("List요소 : ");
		for(int num : intList) { // 향상된 for문 사용.
			System.out.println(num + " ");
		}
		}
		
		public static void ListArray2() {
		
		// String으로 변경 후 Array와 List 출력
		String[] strArray = new String[3];
		strArray[0] = "딸기";
		strArray[1] = "체리";
		strArray[2] = "멜론";
		System.out.println("String Array : ");
		for(int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i]);
		}
		
		System.out.println();
		
		List<String> strList = new ArrayList<>();
		strList.add("망고");
		strList.add("자두");
		strList.add("수박");
		System.out.println("String List : ");
		for(String str : strList) {
			System.out.print(str);
		}
		}

}
