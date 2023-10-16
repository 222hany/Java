package com.kh.inheritance.animal;

public class Dog extends Animal {
	public Dog(String name) {
		super(name); // 상위 클래스(Animal)의 멤버변수에 접근하는데 사용.
		}
	
		public void speak() {
			System.out.println(getName() + " 멍멍!!");
		}
}

