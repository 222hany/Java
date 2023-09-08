package com.kh.pattern.mvc;

public class MVCStudent {
	// 1. Model -> 생성자 getter setter
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public MVCStudent(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 2. Controller -> 출력 매소드
	public class SController {
		private MVCStudent model;
		private MVCStudent view;
		
	public SController() {
		this.model = model;
		this.view = view;
	}
	
	public void updateView() {
		view.printinfo();
	}
	}
	
	// 3. view -> 보여지는 것(시스템프린트)
	public void printinfo() {
		System.out.println("학생들의 정보");
	}
	
	// etc. Client
	public static void main(String[] args) {
	}

}
