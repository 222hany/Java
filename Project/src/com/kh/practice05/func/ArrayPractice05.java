package com.kh.practice05.func;

import java.util.Scanner;

public class ArrayPractice05 {

	public static void main(String[] args) {
		// 사용자가 입력한 값이 배열에 있는지 검색하여 있으면 "@@@치킨 배달가능" 없으면 "@@@치킨은 없는 메뉴입니다" 출력.
		Scanner sc = new Scanner(System.in);
		System.out.println("치킨을 검색해주세요");
		String chicken = sc.next();
		String[] menu = {"고추바사삭", "허니콤보", "청양마요", "후라이드"};
		
		for (int i = 0; i < menu.length; i++) {
		if(chicken == menu[i]) {
			System.out.println(menu[i] + "배달 가능.");
			} else {
			System.out.println(chicken + "은 없는 메뉴입니다."); // 어려워요...ㅠㅠ
		}

	}
	}
}
