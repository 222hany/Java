package com.kh.practice05.func;

import java.util.Scanner;

public class ArrayPractice01 {

	public static void main(String[] args) {
		// 사용자에게 입력받은 양의 정수만큼 배열크기를 할당하고, 1부터 입력받은 값까지 배열에 초기화 한 후 출력.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요.");
		int num = sc.nextInt();
		int[] numArray = new int[num];
		
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = i + 1;
			System.out.println(numArray[i]);
		}
		

	}

}
