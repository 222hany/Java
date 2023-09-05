package com.kh.example.practice3.model.vo;

public class Circle {
	// 멤버변수 (필드)
	private double PI = 3.14;
	private int radius = 1;
		
	// 필드 복사본
	public double getPI() {
		return PI;
	}
	public int getRadius() {
		return radius;
	}
	
	// 생성자
	public void setPI(double pI) {
		PI = pI;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	// 출력 매소드
	public void IncrementRadius() {
		radius++;
	}
	public void AreaOfCircle() { 
		double area = PI * radius * radius;
		System.out.println("원의 넓이 : " + area);
		}
	public void SizeOfCircle() {
		System.out.println("원의 크기 : " + radius);
	}
}
