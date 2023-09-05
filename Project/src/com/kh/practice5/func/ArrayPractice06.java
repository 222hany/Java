package com.kh.practice5.func;

public class ArrayPractice06 {

	public static void main(String[] args) {
		
		// 1. 주민번호 만들기
		String jumin = "123456-1234567";
		
		// 2. 성별자리 이후 별표 만들기
		String star = "*";
		char[] juminStar = jumin.toCharArray(); //to Char Array를 사용해서 String -> Char Array로 변경
		//{'1', '2', '3', '4', '5', '6', '-', '1', '2', '3', '4', '5', '6', '7'}
		for (int i = 8; i <= 13 ; i++) { // 주민번호 9자리부터 끝자리까지 별표처리
			juminStar[i] = '*';
		}
		System.out.println(juminStar);
	}

}
