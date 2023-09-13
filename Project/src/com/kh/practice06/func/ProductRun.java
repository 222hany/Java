package com.kh.practice06.func;

public class ProductRun {

	public static void main(String[] args) {
		// Product 생성 3개 하고 각각 상품명, 가격, 브랜드명 출력
		
		Product product1 = new Product("새우깡", 1000, "농심");
		Product product2 = new Product("초코파이情", 3000, "오리온");
		Product product3 = new Product("스크류바", 1500, "롯데");
		
		System.out.println("Product 정보");
		product1.information();
		System.out.println("Product 정보");
		product2.information();
		System.out.println("Product 정보");
		product3.information();
	}

}
