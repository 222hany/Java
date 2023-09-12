package com.kh.abstractSample.Animal;

public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("강아지");
		System.out.println("동물 이름 : " + dog.getDisplayName());
		System.out.println("동물 소리 : " + dog.sound());
		
		Cat cat = new Cat("고양이");
		System.out.println("동물 이름 : " + cat.getDisplayName());
		System.out.println("동물 소리 : " + cat.sound());
		
		// 객체배열로 Animal 정의해서 출력. 다형성 활용.
		Animal[] animal = new Animal[2];
		animal[0] = new Dog("강아지");
		animal[1] = new Cat("고양이");
		for(int i = 0; i < animal.length; i++) {
			System.out.println(animal[i].getDisplayName());
		}
		// 쌤 깃에서 긁어오기..
	}

}
