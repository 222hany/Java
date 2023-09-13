package com.kh.practice02.func;

import java.util.Scanner;

public class CastingPractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//키보드로 문자 하나를 입력받아 그 문자의 숫자를 출력하세요.
		System.out.print("문자를 입력해 주세요.");
		
		char inputChar = sc.next().charAt(0);
		int changeChar = inputChar;
		System.out.print(changeChar);
	}

}
