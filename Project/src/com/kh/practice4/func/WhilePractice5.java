package com.kh.practice4.func;

import java.util.Scanner;

public class WhilePractice5 {

	public static void main(String[] args) {
		// 1���� ����ڿ��� �Է� ���� �� ������ �������� ���� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �ϳ� �Է��ϼ���.");
		int num1 = sc.nextInt();
		int sum = 0;
		int num2 = 1;
		
		while (num2 <= num1) {
			System.out.println(sum);
			sum += num2;
			num2 = num2 + 1;
		}
}
}
