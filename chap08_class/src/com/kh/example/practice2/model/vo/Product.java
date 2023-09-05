package com.kh.example.practice2.model.vo;

public class Product {
	// 1. 멤버 변수
	private String pName;
	private int price;
	private String brand;
	
	// 2. 생성자
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	
	// 3. 출력 매소드
	public void information() {
		System.out.println("상품명 : " + pName);
		System.out.println("가격 : " + price);
		System.out.println("브랜드 : " + brand);
	}
}
