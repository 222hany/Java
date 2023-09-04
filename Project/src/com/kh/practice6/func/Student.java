package com.kh.practice6.func;

public class Student {
	// 1. 멤버 변수 생성
	String name;
	int grade;
	int classroom;
	char gender;
	double height;
	
	// 2. 생성자
	public Student(String name, int grade, int classroom, char gender, double height) {
		this.name = name;
		this.grade = grade;
		this.classroom = classroom;
		this.gender = gender;
		this.height = height;
	}
	
	// 3. 정보 출력 매소드
	public void information() {
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println("반 : " + classroom);
		System.out.println("성별 : " + gender);
		System.out.println("키 : " + height);
	}
}
