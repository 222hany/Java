package com.kh.practice7.func;

public class Student {
	// 1. 필드 생성
	private String name;
	private int grade;
	private int classroom;
	private char gender;
	private double height;
	
	// 2. 필드 복사본
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public char getGender() {
		return gender;
	}
	public double getHeight() {
		return height;
	}
	
	// 3. 생성자 초기화
	public void setName(String name) {
		this.name = name;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	// 4. 실행 매소드 만들기
	public void information() {
		System.out.println("학생 이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println("반 : " + classroom);
		System.out.println("성별 : " + gender);
		System.out.println("키 : " + height);
	}
	
}
