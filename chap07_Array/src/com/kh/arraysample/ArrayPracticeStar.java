package com.kh.arraysample;

import java.util.Scanner;

public class ArrayPracticeStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt();
		
		for (int i = 1; i <= 5 ;i++) { // i = 행 숫자
			for (int j = 1; j <=5; j++) { // j = 열 숫자
				if (i == 1 || j == 1 || j == num || i == num) { // i == 1 행이 1인 경우 (가장 윗줄)
					                                // j == 1 현재 행에서 출력하는 열이 첫 번째 열일 경우
					                                // j == num 현재 행에서 가장 마지막 열일 경우
					                                // i == num 행이 마지막일 경우 (가장 아랫줄)
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			} System.out.println();
		}

	}

}
