package com.kh.arraysample;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		/* 문자열을 입력받아서 문자 하나하나 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지 개수와 몇 번째
		   인덱스에 위치하는지 인덱스 출력하기                                                    */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		String inputString = sc.next();
		
		System.out.println("검색할 문자를 입력하세요.");
		char searchChar = sc.next().charAt(0);
		
		char[] charString = inputString.toCharArray(); //toCharArray -> 문자열을 문자 배열로 변환하는 역할
		int charCount = charString.length;
		System.out.println("charCount : " + charCount);
		
		int count = 0;
		System.out.println(inputString + " 에 " + searchChar + " (이)가 존재하는 위치(인덱스)");
		for (int i = 0; i < charCount; i++) {
			if(charString[i] == searchChar) { //charString[i] 고정값이 아니라 i값인 이유는 searchChar 값이 고정.
			System.out.println(i);
			}
		}
		
	}

}
