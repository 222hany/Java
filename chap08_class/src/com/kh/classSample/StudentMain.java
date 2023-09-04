package com.kh.classSample;

public class StudentMain {

	public static void main(String[] args) {
		// 학생의 객체 생성
		Student student1 = new Student("이하니", 20, "1학년");
		
		// 학생 정보 출력
		student1.displayInfo();
		
		// 학생을 3명 만들어서 출력하기
		Student student2 = new Student("이미혜", 20, "1학년");
		Student student3 = new Student("이장원", 21, "2학년");
		Student student4 = new Student("신재평", 22, "3학년");
		student2.displayInfo();
		student3.displayInfo();
		student4.displayInfo();
	}

}
