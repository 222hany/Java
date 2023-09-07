package com.kh.inheritance.calculator;

public class Calculator {
	// 계산기
	int num, num2;  // int는 예약어. 객체변수 아님.
	
	// 1. 더하기
	public int add() { // 파라미터(매개변수) 숫자 2개 넣어주기
		return num + num2;
	}
	// 2. 빼기
	public int substruct() {
		return num - num2;
	}
	// 3. 곱하기
	public int multiply() {
		return num * num2;
	}
	// 4. 나누기
	public int divide() {
		return num / num2;
	}
}
