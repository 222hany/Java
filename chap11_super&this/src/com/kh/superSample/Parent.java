package com.kh.superSample;
// 상속받아서 super()와 super.의 차이점 확인
// super : 부모클래스의 변수나 매소드에 접근하기 위해 사용.
// super() : 부모클래스의 생성자를 호출하기 위해 사용. 서브클래스의 생성자에서 첫번째 줄에 호출되어야 함.
public class Parent {
	String name;
	
	Parent() {
		System.out.println("부모클래스의 기본생성자 입니다.");
	}
	
	Parent(String name) {
		this.name = name;
		System.out.println("부모클래스의 문자열 파라미터 생성자 입니다! 이름 : " + name);
	}
	
	public void show() {
		System.out.println("부모클래스의 show 매소드 입니다.");
	}
}
