package com.kh.inheritance.calculator;

public class CalculatorForMod extends Calculator{
	public int mod() { // 나눈 다음 나머지를 구할 수 있는 기능이 추가 됨.
		return num % num2;
	}
}
