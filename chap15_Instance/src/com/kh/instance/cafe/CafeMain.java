package com.kh.instance.cafe;

public class CafeMain {

	public static void main(String[] args) {
		Cafe customer1 = new Cafe("³ìÂ÷¶ó¶¼", 1, false);
		Cafe customer2 = new Cafe("¹öºíÆ¼", 2, true);
		Cafe customer3 = new Cafe("Ä«Æä¶ó¶¼", 1, true);
		
		customer1.makeCoffee();
		System.out.println("*******************************");
		customer2.makeCoffee();
		System.out.println("*******************************");
		customer3.makeCoffee();
	}

}
