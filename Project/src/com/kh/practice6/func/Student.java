package com.kh.practice6.func;

public class Student {
	// 1. ��� ���� ����
	String name;
	int grade;
	int classroom;
	char gender;
	double height;
	
	// 2. ������
	public Student(String name, int grade, int classroom, char gender, double height) {
		this.name = name;
		this.grade = grade;
		this.classroom = classroom;
		this.gender = gender;
		this.height = height;
	}
	
	// 3. ���� ��� �żҵ�
	public void information() {
		System.out.println("�̸� : " + name);
		System.out.println("�г� : " + grade);
		System.out.println("�� : " + classroom);
		System.out.println("���� : " + gender);
		System.out.println("Ű : " + height);
	}
}
