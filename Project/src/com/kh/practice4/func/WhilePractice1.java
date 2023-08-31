package com.kh.practice4.func;

import java.util.Scanner;

public class WhilePractice1 {

	public static void main(String[] args) {
		// 사용자로부터 한개의 값을 입력받아 1부터 그 숫자 까지의 숫자들을 모두 출력. 단 입력한 숫자는 1보다 크거나 같아야 함.
		// 만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요."를 출력.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		int num = sc.nextInt();
		
		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for (int i = 1; i <= num; i++) {
			System.out.println(i);
			}
		}

	}

}
