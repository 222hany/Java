package com.kh.superSample;

public class Child extends Parent{  // 자식이 부모를 상속받음.
	
	//Child()  // 접근제한자가 디폴트로 변경 된 것일 뿐, public과 쓰임은 같음.
	public Child() {  
		super();  // 부모클래스의 기본생성자를 호출.
		System.out.println("자식클래스의 기본생성자 입니다.");
	}
	
	public Child(String name) {
		super(name);  // 부모클래스의 문자열 파라미터 생성자 호출.
		System.out.println("자식클래스의 문자열 파라미터 생성자 입니다.");
	}
	
	public void display() {
		super.show();  // 부모클래스의 show 출력매소드를 호출.
		System.out.println("자식클래스의 디스플레이 매소드 입니다.");
	}
}
