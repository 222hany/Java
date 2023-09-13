package com.kh.practice06.func;

public class Product {
	// 1. 멤버변수 생성
	String pname;
	int price;
	String brand;
	
	// 2. 생성자 this를 활용해서 만들기
	public Product(String pname, int price, String brand){
		this.pname = pname;
		this.price = price;
		this.brand = brand;
	}
		
	// 3. 정보 출력 메소드 만들기
	public void information() {
		System.out.println("상품명 : " + pname);
		System.out.println("가격 : " + price + "원");
		System.out.println("브랜드 : " + brand);
	}

}
