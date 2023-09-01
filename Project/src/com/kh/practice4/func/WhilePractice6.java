package com.kh.practice4.func;

import java.util.Scanner;

public class WhilePractice6 {

	public static void main(String[] args) {
		// 사용자로부터 두 개의 값을 입력받아 그 사이의 숫자를 모두 출력.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력해주세요.");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력해주세요.");
		int num2 = sc.nextInt();
		/*int i;
		
		while (num1 > num2) {
			i = --num1;
			System.out.println(i);
		}*/
		
		//선생님 풀이
		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
		}
	}

}
