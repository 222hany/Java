package com.kh.abstractSample.Animal;

public class Dog extends Animal{ // extends
	// 积己磊 super
	public Dog(String name) {
		super(name);
	}

	@Override
	String sound() {
	return "港港";
}
}
