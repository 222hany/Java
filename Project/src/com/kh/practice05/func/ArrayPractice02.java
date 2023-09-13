package com.kh.practice05.func;

import java.util.Scanner;

public class ArrayPractice02 {

	public static void main(String[] args) {
		// "월" ~ "일" 까지 초기화 된 문자열 배열을 만들고 0부터 6까지 숫자를 입력받아 입력한 숫자와 같은 인덱스에 있는
		// 요일을 출력. 범위에 없는 숫자를 입력 시 "잘못 입력하셨습니다."를 출력.
		Scanner sc = new Scanner(System.in);
		System.out.println("0 부터 6 사이의 숫자를 입력해주세요.");
		int num = sc.nextInt();
		
		String[] day = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		if(num >= 0 && num < 6) {
			for (int i = 0; i < day.length; i++) {
				if(i == num) {
				System.out.println(day[i]);
				}
			}
			} else {
				System.out.println("잘못 입력하셨습니다.");
		}

	}

}
