package com.kh.practice7.func;

public class Snack {
	// 1. �ʵ� ����
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;
	
	// 2. �ʵ� ���纻
	public String getKind() {
		return kind;
	}
	public String getName() {
		return name;
	}
	public String getFlavor() {
		return flavor;
	}
	public int getNumOf() {
		return numOf;
	}
	public int getPrice() {
		return price;
	}
	
	// 3. ������
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 4. �żҵ�
	public void information() {
		System.out.println("���� : " + kind);
		System.out.println("�̸� : " + name);
		System.out.println("�� : " + flavor);
		System.out.println("���� : " + numOf);
		System.out.println("���� : " + price);
	}
}
