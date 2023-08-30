package com.kh.If;

public class IfElseIfSample {

	public static void main(String[] args) {
		/* if-else if-else : 여러개의 조건을 연속적으로 평가. 그 중 첫번째 참인 조건에 해당하는 코드 블록을 실행하는 구조.
		                     만약 if나 else if의 조건도 참이 아니라면 마지막 else 블록 실행.
		                     if(조건1){
		                     조건1이 참일 때 실행되는 코드
		                     } else if(조건2){
		                     조건2가 참일 때 실행되는 코드
		                     } else{
		                     위의 모든 조건이 거짓일 때 실행되는 코드
		                     }                                                                      */
		
		int age = 20;
		if (age == 20) {
			System.out.println("해외여행을 갈거야.");
		} else if (age >= 20) {
			System.out.println("세계여행을 갈거야.");
		} else {
			System.out.println("집에 있을거야.");
		}
		
		int score = 85;
		if (score >= 90) {
			System.out.println("A");
		} else if (score == 90) {
			System.out.println("B+");
		} else {
			System.out.println("B");
		}
		
		int hour = 15;
		if (hour < 12) {
			System.out.println("집에 가고 싶은 시간입니다.");
		} else if (hour < 18) {
			System.out.println("집에 가고 싶은 시간입니다.");
		} else {
			System.out.println("집입니다. 말걸지마세요.");
		}
		
		int temp = 28;
		if (temp > 30) {
			System.out.println("더운 날씨입니다.");
		} else if (temp > 20) {
			System.out.println("적당한 날씨입니다.");
		} else {
			System.out.println("쌀쌀한 날씨 입니다.");
		}
		
		int num = -5;
		if (num > 0) { //0보다 클 때 참.
			System.out.println("양수입니다.");
		} else if (num < 0) { //0보다 작을 때 참.
			System.out.println("음수입니다.");
		} else { //0일때 참.
			System.out.println("0 입니다.");
		}
		
		int myAge = 15;
		if (myAge > 12) {
			System.out.println("청소년 입니다.");
		} else if (myAge > 18) {
			System.out.println("성인 입니다.");
		} else {
			System.out.println("어린이 입니다.");
		}
		
		int month = 8;
		if (month == 1 || month == 2 || month == 12) { // 1월, 2월, 12월
			System.out.println("겨울");
		} else if (month >= 3 && month <= 5) { // 3월 ~ 5월
			System.out.println("봄");
		} else if (month >= 6 && month <= 8) { // 6월 ~ 8월
			System.out.println("여름");
		} else { // 9월 ~ 11월
			System.out.println("가을");
		}
	}

}
