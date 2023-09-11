package com.kh.instance.cafe;

public class Cafe {
	private String type;
	private int size;
	private boolean isSugar;
	
	public Cafe (String type, int size, boolean isSugar) {
		this.type = type;
		this.size = size;
		this.isSugar = isSugar;
	}
	
	public void makeCoffee() {
		System.out.println(type + " 한 잔, 사이즈" + size + "을 주문합니다.");
		if (isSugar) {
			System.out.println("설탕을 추가합니다.");
		}
	}
}
