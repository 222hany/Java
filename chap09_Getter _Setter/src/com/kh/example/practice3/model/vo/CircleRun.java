package com.kh.example.practice3.model.vo;

public class CircleRun {

	public static void main(String[] args) {
		// 기본 생성자 객체 생성
		Circle circle = new Circle();
				
		// 초기 원의 둘레와 넓이를 계산하고 출력
		System.out.println("초기 원의 정보");
		circle.AreaOfCircle();				
		circle.SizeOfCircle();
				
		// 원의 둘레와 넓이가 반지름 1씩 증가한 다음 계산 출력
		circle.IncrementRadius(); // 반지름을 1씩 증가시킴
				
		System.out.println("반지름을 1씩 증가시킨 후 원의 정보");
		circle.AreaOfCircle();
		circle.SizeOfCircle();

	}

}
