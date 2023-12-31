package com.kh.variable;

public class VariableConversion {
	public static void main(String[] args) {
		// 1.자동형변환 (암시적형변환, 묵시적형변환)
		int intNum = 100;
		System.out.println(intNum);
		long longNum = intNum; //int -> long 자동형변환
		System.out.println(longNum);
		
		float floatNum = 3.14f;
		double doubleNum = floatNum; //float -> double 자동형변환
		
		// int -> long 형변환 2가지 만들고 출력하기
		//1
		int no_1 = 93290182;
		long no_2 = no_1;
		System.out.println(no_2);
		//2
		int no_3 = 930224;
		long no_4 = no_3;
		System.out.println(no_4);
		// short -> int 형변환 1가지 만들고 출력하기
		short no_5 = 917;
		int no_6 = no_5;
		System.out.println(no_6);
		// float -> double 형변환 1가지 만들고 출력하기
		float no_7 = 9.17f;
		double no_8 = no_7;
		System.out.println(no_8);
		
		// 2.강제형변환 (명시적형변환)
		long largeLong = 123456789012345L;
		System.out.println(largeLong);
		int largeInt = (int) largeLong;
		System.out.println(largeInt); //long을 int로 강제형변환 할 경우 값이 범위안에 있지 않으면 일부 데이터는 손실된다.
		
		double largeDouble = 12345.6789;
		int intPart = (int) largeDouble;
		System.out.println(intPart); //실수를 정수로 강제형변환 할때는 정수부분만 유지된다.
		
		// 문자와 숫자 간의 형변환 2개 출력
		// 문자는 char charValue = 'Z'; -> int로 변경
		char charValue = 'Z';
		int intValue = charValue;
		System.out.println(intValue);
		char charValue1 = 'A';
		int intValue1 = charValue1;
		System.out.println(intValue1);
		// double -> int 형변환 출력 1개
		double number = 3.14;
		int number1 = (int)number;
		System.out.println(number1);
		// int -> short 형변환 출력 1개
		int number2 = 1234;
		short number3 = (short)number2;
		System.out.println(number3);
	}

}
