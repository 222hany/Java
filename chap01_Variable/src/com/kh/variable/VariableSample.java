package com.kh.variable;

public class VariableSample {
	public static void main(String[] args) {
		String name;
		name = "쿠팡";
		
		int hour = 15;
		double score = 90.5;
		char grade = 'A';
		
		System.out.println("안녕하세요. " + name + "입니다. 오늘 " + hour + "시에 배송됩니다.");
		System.out.println("저의 성적은 " + score + "점 입니다.");
		System.out.println(score + "점은 학점 " + grade + " 입니다.");
		
		//변수에 이름과 나이와 자신의 성적(double) 등급(char)로 넣기.
		String name2 = "이하니";
		int age = 20;
		double score2 = 98.5;
		char grade2 = 'A';
		System.out.println("안녕하세요. 저의 이름은 " + name2 + "입니다. 저는 " + age + "살 입니다.");
		System.out.println(name2 + " 학생의 점수는 " + score2 + "점 입니다. 학점은 " + grade2 + " 입니다.");
	}

}
