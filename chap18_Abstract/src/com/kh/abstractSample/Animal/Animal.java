package com.kh.abstractSample.Animal;

abstract class Animal {
	// 필드
	private String name;
	// 생성자
	public Animal(String name) {
		this.name = name;
	}
	// 추상매소드 동물소리 출력 void sound();
	abstract String sound();
	// 일반매소드 동물이름 출력 void displayName();
	public void setDisplayName(String name) {
		this.name = name;
	}
	public String getDisplayName() {
		return name;
	}
}
