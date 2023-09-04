package com.kh.classSample;

public class Car {
	// 1. 상태 필드 멤버변수
	String brand;      //브랜드
	String model;      //모델
	int speed;         //속도
	boolean engineOn;  //엔진상태
	
	// 멤버변수 밑에는 모두 매소드로 정의
	// 2. 생성자 (매소드의 한가지 종류)
	public Car(String brand, String model) { //차를 볼때 필수로 넣을 파라미터는 브랜드와 모델
		this.brand = brand;
		this.model = model;
		this.speed = 50;
		this.engineOn = true;
	}
	// 엔진 시작 메소드
	public void startEngine() { 
		if(engineOn) { //만약에 엔진이 true면 엔진 시동
			System.out.println("엔진을 시동합니다."); //출력 메소드 작성
		} else { //false면 엔진이 켜져있다
			System.out.println("이미 엔진이 켜져 있습니다.");
		}
	}
	// 가속 메소드
	public void accelerate(int amount) {
    	if(engineOn) { //만약에 엔진이 true면 지금 속도가 얼마다
    		System.out.println("속도 얼마입니다.");
    	} else //false면 엔진이 꺼져있어 속도를 낼 수 없다
    		System.out.println("속도를 알 수 없습니다.");
    }
	

}
