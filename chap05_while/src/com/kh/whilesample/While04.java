package com.kh.whilesample;

public class While04 {

	public static void main(String[] args) {
		// 1부터 100까지 합 구하기
		int sum = 0; // 최종 합
		int num = 1;
		
		while (num <= 3) {
			System.out.println(num);
			sum += num; //
			num = num + 1;
			System.out.println(sum);
		}

	}

}
