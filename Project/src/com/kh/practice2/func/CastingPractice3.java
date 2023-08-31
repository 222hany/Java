package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//선언 및 초기화 된 5개의 변수를 가지고 알맞은 사칙연산과 형변환을 이용하여 주석에 적힌 값과 같은 값이 나오도록 코드를 작성하세요.
		//선생님 풀이
		
		int iNum1 = 10;
		int iNum2 = 4;
		 
		float fNum = 3.0f;
		 
		double dNum = 2.5;
		 
		char ch = 'A';
		 
		System.out.println( iNum1 % iNum2 ); // 2 나누기의 나머지를 구하는 문제
		System.out.println( (int)dNum ); // 2 int를 붙여 정수로 만드는 문제
		 //					4      2.5
		System.out.println( (double)iNum2 * dNum ); // 10.0 int를 double 로 바꿔서 실수로 나오는 문제
		System.out.println( (double)iNum1 ); // 10.0
		 //	int iNum1 = 10; int iNum2 = 4; 
		System.out.println( (double)iNum1 / (double)iNum2 ); // 2.5
		System.out.println( (float)dNum ); // 2.5
		 
		System.out.println( (int)fNum ); // float fNum = 3.0f; -> 3
		System.out.println( iNum1 / (int)fNum ); // 3 정수와 실수를 나눠서 3인 정수로 출력
		System.out.println( iNum1  / fNum );// 3.3333333 정수와 실수를 나눠서 3.3333333인 float을 이용한 실수로 출력
		System.out.println( (double)iNum1 / fNum ); // 3.3333333333333335 정수와 실수를 나눠서 3.3333333333333335인 double을 이용한 실수로 출력
		 
		System.out.println( ch ); // 'A' char 출력 문제
		System.out.println( (int)ch ); // 65 int로 변경해서 출력
		System.out.println( (int)ch +  iNum1 ); // 75 int로 ch를 변경 후 더하기
		System.out.println( (char)((int)ch + iNum1) ); // 'K' 75로나온 int를 ch로 변경

	}

}
