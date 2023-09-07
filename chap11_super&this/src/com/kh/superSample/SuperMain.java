package com.kh.superSample;

public class SuperMain {

	public static void main(String[] args) {
		Child child1 = new Child();
		
		Child child2 = new Child("홍길동");
		child2.display();
		// ★블로그 숙제★
		// super.display(); 를 했을 때 어떻게 되는지
		// super.display(); 를 사용하고 싶을 때 어떻게 해야하는지
	}

}
