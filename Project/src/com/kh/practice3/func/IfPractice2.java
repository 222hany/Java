package com.kh.practice3.func;

import java.util.Scanner;

public class IfPractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		
		int number = sc.nextInt();
		
		if (number/2 != 0 && number > 0) {
			System.out.println("홀수다.");
		} else if (number/2 == 0 && number > 0) {
			System.out.println("짝수다.");
		} else {
			System.out.println("양수만 입력해주세요");
		}

	}

}