package com.kh.inheritance.animal;

public class Monkey extends Animal{
	public Monkey(String name) {
		super(name);
	}
	
	@Override
	public void eat() {
		System.out.println(getName() + "가 배불러서 먹이를 먹지 않습니다.");
	}
}
