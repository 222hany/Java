package com.kh.whilesample;

public class While04 {

	public static void main(String[] args) {
		// 1���� 100���� �� ���ϱ�
		int sum = 0; // ���� ��
		int num = 1;
		
		while (num <= 3) {
			System.out.println(num);
			sum += num; //
			num = num + 1;
			System.out.println(sum);
		}

	}

}
