package com.kh.practice01.func;

import java.util.Scanner;

public class VariablePractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
		// 키보드에서 정수 두 개를 입력받아, 두 수의 합, 차, 곱, 나누기 한 몫과 나머지를 출력하시오.
		int num1, num2;
		System.out.print("숫자를 입력해 주세요.");
		num1 = sc.nextInt();
		System.out.print("또 다른 숫자를 입력해 주세요.");
		num2 = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 결과(몫) : " + (num1 / num2));
		System.out.println("나누기 결과(나머지) : " + (num1 % num2));
	}

}
