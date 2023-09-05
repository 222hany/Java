package com.kh.practice7.func;

import java.util.Scanner;

public class SnackRun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴를 선택해주세요");
		System.out.println("menu");
		
		Snack snk = new Snack();
		// set 설정하기
		snk.setKind("빵");
		snk.setName("케이크");
		snk.setFlavor("블루베리");
		snk.setNumOf(1);
		snk.setPrice(15000);
		
		snk.information();
	}

}
