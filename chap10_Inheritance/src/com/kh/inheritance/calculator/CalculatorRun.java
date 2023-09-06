package com.kh.inheritance.calculator;

import java.util.Scanner;

public class CalculatorRun extends CalculatorForMod {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		/*
		int result1 = cal.add(10, 5);
		int result2 = cal.substruct(10, 5);
		int result3 = cal.multiply(10, 5);
		int result4 = cal.divide(10, 5);
		
		System.out.println("더하기 결과 : " + result1);
		System.out.println("빼기 결과 : " + result2);
		System.out.println("곱하기 결과 : " + result3);
		System.out.println("나누기 결과 : " + result4);
		*/
		
		
		// Scanner 이용해서 코드 변경하기
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해주세요.");
		int num = sc.nextInt();
		System.out.println("두번째 숫자를 입력해주세요.");
		int num2 = sc.nextInt();
		
		int result1 = cal.add(num, num2);
		int result2 = cal.substruct(num, num2);
		int result3 = cal.multiply(num, num2);
		int result4 = cal.divide(num, num2);
		
		System.out.println("더하기 결과 : " + result1);
		System.out.println("빼기 결과 : " + result2);
		System.out.println("곱하기 결과 : " + result3);
		System.out.println("나누기 결과 : " + result4);
		*/
		
		
		// 계산기 기능 업데이트
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 2개 입력해주세요.");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result1 = cal.add(num, num2);
		int result2 = cal.substruct(num, num2);
		int result3 = cal.multiply(num, num2);
		int result4 = cal.divide(num, num2);
		int result5 = cal.mod(num, num2);
		
		CalculatorForMod cal2 = new CalculatorForMod();
		System.out.println("add : " + cal2.add());
		System.out.println("mod : " + cal2.mod());
		*/

	}

}
