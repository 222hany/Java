package com.kh.pattern.single;

public class SingleStudent {
	private String name;
	
	// 생성자
	private SingleStudent() {
		
	}
	// 출력매소드
	public void display() {
		System.out.println("싱글톤 학생입니다.");
	}

	public static void main(String[] args) {
		SingleStudent std1 = new SingleStudent(); // 싱글톤패턴. 클래스에서 하나의 객체만 생성.
		
		std1.display();
	}

}
