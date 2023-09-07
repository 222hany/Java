package com.kh.practice8.func;

import java.util.Scanner;

public class ArrayListPractice03 {

	public static void main(String[] args) {
		// 사용자로부터 5개의 정수를 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 5개 입력해주세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		
		// 배열 만들기
		int[] numbers = {num1,num2,num3,num4,num5};
		
		// 향상된 for문을 사용해 배열의 모든 요소를 더한 결과 출력
		for (int num : numbers) {
			System.out.println(num);
		}

	}

}
