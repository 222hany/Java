package com.kh.abstractSample;
// 추상클래스 정의
abstract class Shape {
	// 일반필드
	private String color;
	
	// 추상매소드(하위 클래스에서 구현해야 함)
	abstract double calculateArea();
	abstract int recArea();
	
	// 생성자
	public Shape(String color) {
		this.color = color;
	}
	
	// 일반매소드
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
}
