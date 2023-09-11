package com.kh.class_array;

public class StudentMaIn {

	public static void main(String[] args) {
		// Student 객체를 저장하는 배열 생성
		Student[] student = new Student[3];
		
		// 배열에 Student 객체를 추가
		// 인덱스 [0]번째 학생부터 인덱스 [2]번째 학생까지 추가 저장하기
		student[0] = new Student("홍길동", 17);
		student[1] = new Student("김마리", 18);
		student[2] = new Student("장발장", 19);
		
		// 총 길이를 구하고 싶으면 length
		// 1 번째 학생의 이름 student[0].name;
		// 1 번째 학생의 나이 student[0].age;
		System.out.println("총 학생 수 : " + student.length);
		System.out.println("첫 번째 학생의 이름 : " + student[0].name);
		System.out.println("첫 번째 학생의 나이 : " + student[0].age);
		
		// 2 번째 학생의 이름, 나이 출력
		System.out.println("두 번째 학생의 이름 : " + student[1].name);
		System.out.println("두 번째 학생의 나이 : " + student[1].age);
		
		// 3 번째 학생의 이름, 나이 출력
		System.out.println("세 번째 학생의 이름 : " + student[2].name);
		System.out.println("세 번째 학생의 나이 : " + student[2].age);
		
		// for문을 이용하여 1 번째 학생부터 3번째 학생까지 출력
		for(int i = 0; i < student.length; i++) {
			System.out.print(student[i].name + " / ");
			System.out.println(student[i].age + "세");
		}
	}
}
