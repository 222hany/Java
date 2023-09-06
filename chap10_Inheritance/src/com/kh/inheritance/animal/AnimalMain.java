package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		Dog myDog = new Dog("°¡À»ÀÌ");
		
		myDog.info();
		myDog.speak();
		myDog.eat();
		
		Cat myCat = new Cat("³ªºñ");
		myCat.run();
		myCat.eat();
		
		Monkey myMonkey = new Monkey("¿ì³¢³¢");
		myMonkey.eat();
		
		Lion myLion = new Lion("½É¹Ù");
		myLion.sleep();
	}

}
