package com.kh.practice8.func;

import java.util.Scanner;

public class ArrayListPractice03 {

	public static void main(String[] args) {
		// ����ڷκ��� 5���� ������ �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("������ 5�� �Է����ּ���.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		
		// �迭 �����
		int[] numbers = {num1,num2,num3,num4,num5};
		
		// ���� for���� ����� �迭�� ��� ��Ҹ� ���� ��� ���
		for (int num : numbers) {
			System.out.println(num);
		}

	}

}
