package com.kh.superSample;
// ��ӹ޾Ƽ� super()�� super.�� ������ Ȯ��
// super : �θ�Ŭ������ ������ �żҵ忡 �����ϱ� ���� ���.
// super() : �θ�Ŭ������ �����ڸ� ȣ���ϱ� ���� ���. ����Ŭ������ �����ڿ��� ù��° �ٿ� ȣ��Ǿ�� ��.
public class Parent {
	String name;
	
	Parent() {
		System.out.println("�θ�Ŭ������ �⺻������ �Դϴ�.");
	}
	
	Parent(String name) {
		this.name = name;
		System.out.println("�θ�Ŭ������ ���ڿ� �Ķ���� ������ �Դϴ�! �̸� : " + name);
	}
	
	public void show() {
		System.out.println("�θ�Ŭ������ show �żҵ� �Դϴ�.");
	}
}