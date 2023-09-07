package com.kh.practice8.func;

import java.util.ArrayList;

public class ArrayListPractice01 {

	public static void main(String[] args) {
		// 1. 빈 ArrayList 생성
		ArrayList<String> rainbow = new ArrayList<>();
		
		// 2. 요소 추가하기
		rainbow.add("red");
		rainbow.add("orange");
		rainbow.add("yellow");
		rainbow.add("green");
		rainbow.add("blue");
		rainbow.add("indigo");
		rainbow.add("violet");
		System.out.println("rainbow : " + rainbow);
		
		// 3. 요소 수정하기
		rainbow.set(1, "black");
		rainbow.set(3, "brown");
		rainbow.set(5, "green");
		System.out.println("수정 체크 : " + rainbow);
		
		// 4. 색상 지우기
		rainbow.remove(1);
		rainbow.remove(2);
		rainbow.remove(3);
		rainbow.remove(5);
		System.out.println("제거 확인 : " + rainbow);

		// 5. 향상된 for문 이용해서 최후 출력하기 -> red,blue,violet
		for (String colors : rainbow) {
			System.out.println(colors);
		}
	}

}
