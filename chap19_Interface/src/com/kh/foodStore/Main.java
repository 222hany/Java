package com.kh.foodStore;

public class Main {

	public static void main(String[] args) {
		FoodStore order = new Order(); // FoodStore�� ��ü�� �ƴϰ� Order�� FoodStore�� implement ���� ��ü��
		order.addMenu("«��");
		order.addMenu("¥���");
		order.addMenu("������");
		
		order.printMenu();
		
		FoodStore order1 = new Order();
		order1.addMenu("��");
		order1.addMenu("������");
		order1.addMenu("������");
		
		order1.printMenu();
	}

}
