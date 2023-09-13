package com.kh.practice04.func;

import java.util.Scanner;

public class WhilePractice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue = false;
		while(!isTrue) {
		
		System.out.println("숫자를 입력해주세요.");
		int num = sc.nextInt();
		
		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else {
			for (int i = num; i >= 1; i--) {
			System.out.println(i);
			isTrue = true;
			}
		}
	}
  }

}
