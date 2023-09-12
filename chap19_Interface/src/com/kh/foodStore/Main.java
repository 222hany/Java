package com.kh.foodStore;

public class Main {

	public static void main(String[] args) {
		FoodStore order = new Order(); // FoodStore´Â °´Ã¼°¡ ¾Æ´Ï°í Order°¡ FoodStore¸¦ implement ¹ÞÀº °´Ã¼¶ó¼­
		order.addMenu("Â«»Í");
		order.addMenu("Â¥Àå¸é");
		order.addMenu("ÅÁ¼öÀ°");
		
		order.printMenu();
		
		FoodStore order1 = new Order();
		order1.addMenu("¹ä");
		order1.addMenu("±º¸¸µÎ");
		order1.addMenu("¶óÁ¶±â");
		
		order1.printMenu();
	}

}
