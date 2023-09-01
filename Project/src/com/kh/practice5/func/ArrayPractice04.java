package com.kh.practice5.func;

import java.util.Scanner;

public class ArrayPractice04 {

	public static void main(String[] args) {
		// 3 이상인 홀수 자연수를 입력받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고, 중간 이후부터
		// 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력. 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우,
		// "다시 입력하세요." 출력하고 다시 정수 받기.
		Scanner sc = new Scanner(System.in);
		System.out.println("3 이상인 홀수 자연수를 입력해주세요.");
		int num = sc.nextInt();
		
		if (num/2 != 0) {
			for (int i = 0; i > num; i++) {
				num += 1;
				System.out.println(i);
				}
		} else {
			System.out.println("다시 입력하세요."); //너무 어렵다...
		}

	}

}
