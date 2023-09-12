package com.kh.hw.person.model.vo;

public class Student extends Person{
	private int grade;
	private String major;
	
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(name, age, height, weight);
		this.grade = grade;
		this.major = major;
	}
	
	//setter
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	//getter
	public int getGrade() {
		return grade;
	}
	public String getMajor() {
		return major;
	}
}
