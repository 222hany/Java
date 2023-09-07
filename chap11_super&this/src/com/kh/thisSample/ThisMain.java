package com.kh.thisSample;
//this : 객체(=인스턴스) 자신을 가리키는 참조변수. 객체(=인스턴스)의 주소가 저장되어있음.
//this() : 현재 클래스의 다른 생성자를 호출하는데 사용.
	/*
	int x = 10; // 정수 x를 변수로 선언, 10이라는 값을 할당.
	int y = x;  // 참조변수 y. x를 가리킨다.
	
	x = 20;
	System.out.println("y : " + y); // y값 = 10.
	
	int[] list1 = {1,2,3};
	int[] list2 = list1;  //참조변수 list2. list1을 참조.
	*/
class MyClass {
	int myField; // this.myField
	
	MyClass() {  // 첫번째 생성자
		this(0); // this를 사용해서 다른 생성자 호출
		//this.myField = 0;
	}
	MyClass(int value) { // 두번째 생성자
		this.myField = value; // 참조변수
	}
	void printValue() {
		System.out.println("myField의 값 : " + this.myField);
	}
}
public class ThisMain {

	public static void main(String[] args) {
		MyClass obj1 = new MyClass(); // 첫번째 생성자 호출
		MyClass obj2 = new MyClass(10); // 두번째 생성자 호출
		
		obj1.printValue();
		obj2.printValue();
	}

}
