package com.kh.abstractSample;

public class Rectangle extends Shape{
	private int width;
	private int heigt;
	
	public Rectangle(String color, int width, int heigt) {
		super(color);
		this.width = width;
		this.heigt = heigt;
	}
	
	@Override
	public int recArea() {
		return width * heigt;
	}

	@Override
	double calculateArea() {
		return 0;
	}
}
