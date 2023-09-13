package com.kh.practice07.func;

public class StudentRun {

	public static void main(String[] args) {
		Student student1 = new Student();
		System.out.println("학생 정보");
		
		// set 설정하기
		student1.setName("이하니");
		student1.setGrade(1);
		student1.setClassroom(3);
		student1.setGender('F');
		student1.setHeight(166.0);
		
		// 출력
		student1.information();
	}

}
