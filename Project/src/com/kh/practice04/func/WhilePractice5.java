package com.kh.practice04.func;

import java.util.Scanner;

public class WhilePractice5 {

	public static void main(String[] args) {
		// 1부터 사용자에게 입력 받은 수 까지의 정수들의 합을 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력하세요.");
		int num = sc.nextInt();
		
		/*int sum = 0;
		int num2 = 1;
		
		while (num2 <= num1) {
			System.out.println(sum);
			sum += num2;
			num2 = num2 + 1;
		}*/
		
		//선생님 풀이
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다.");
}
}
