package com.kh.practice06.func;

public class Circle {
	// 1. 멤버 변수 (필드)
	Double pi = 3.14; 
	int radius = 1;
	
	// 2. 생성자 
	public Circle() { // 기본생성자, 아무런 초기화를 진행하지 않는다.
	}
	
	// 3. 메소드
	public void incrementRadius() {
		radius++;
		System.out.println(radius);
	}
	public void getAreaOfCircle() {
		double area = pi * radius * radius;
		System.out.println("area : " + area);
	}
	public void getSizeOfCircle() {
		System.out.println("원의 반지름 : " + radius);
	}
}
