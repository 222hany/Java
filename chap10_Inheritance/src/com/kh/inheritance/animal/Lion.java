package com.kh.inheritance.animal;

public class Lion extends Animal{
	public Lion(String name) {
		super(name);
	}
	
	@Override
	public void sleep() {
		System.out.println(getName() + "가 정글에서 잡니다.");
	}
}
