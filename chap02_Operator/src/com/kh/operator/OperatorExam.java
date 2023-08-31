package com.kh.operator;

public class OperatorExam {

	public static void main(String[] args) {
	// 1. 전위 증가 연산자 : 변수 1을 증가시킨 후 그 값을 다시 변수에 할당.
	int i = 5;
	i = ++i;
	System.out.println(i);
	
	// 2. 후위 증가 연산자 : 변수의 현재 값을 사용한 후 변수 1을 증가. i의 현재 값을 변수에 할당하고, 그 후에 변수의 값을 1 증가.
    //                    하지만 할당은 현재 값이므로 변수는 변경되지 않는다.
	
	int j = 5;
	j = j++;
	System.out.println(j);
	
	int a = 5;
	++a;
	System.out.println(a);
	
	int b = 5;
	b++;
	System.out.println(b);
	
	}
}
