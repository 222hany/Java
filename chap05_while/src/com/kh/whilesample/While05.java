package com.kh.whilesample;

import java.util.Scanner;

public class While05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("5 이하의 정수를 입력해주세요.");	
		int sum = 0; // sum은 0인 상태.
		int num = sc.nextInt(); // num은 아직 어떤 값을 받을지 모름.
		
		while (sum <= 10){
			sum += num;
			num = num +1;
			System.out.println(num);
			System.out.println(sum);
		}

	}

}
