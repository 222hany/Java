package com.kh.operator;

public class IncrementDecrement {

	public static void main(String[] args) {
		/* 3. 증감연산자(Increment & Decrement) : 변수의 값을 1씩 증가시키거나 감소시킬때 사용함.
		   전위 증감 연산자(++x, --x) 후위 증감 연산자(x++, x--)
		   
		   1-1)전위 증감 연산자 : ++ 항의 값에 1을 더한다.
		                     val = ++num; : num의 값이 1 증가한 후 val 변수에 대입
		                     val = --num; : num의 값이 1 감소한 후 val 변수에 대입 */
		int val;
		int num1 = 10;
		val = ++num1; //num의 값이 1 증가한 후 변수에 대입을 하기 때문에 11이 출력됨.
		System.out.println(val);
		val = --num1; //num의 값이 1 감소한 후 변수에 대입을 하기 때문에 10이 출력됨.
		System.out.println(val);
		
		// 1-2)후위 증감 연산자 : ++ 항의 값에 1을 더한다.
		int val2;
		int num2 = 10;
		System.out.println(num2);
		val2 = num2++; //val2 변수에 기존 num2값을 대입한 후 num2값 1 증가.
		//1.val2 = num2 값 추가.
		//2.num2 ++1 추가 = num2
		System.out.println(val2);
		System.out.println(num2);
		
		val2 = num2--;
		System.out.println(val2);
		System.out.println(num2);
	}

}
