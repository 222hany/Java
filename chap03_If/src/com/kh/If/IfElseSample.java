package com.kh.If;

public class IfElseSample {

	public static void main(String[] args) {
		/* 2. if-else : 프로그램 조건에 따라 두 가지 서로 다른 코드 블록 중 하나를 실행하는 제어구조.
		                만약 if문의 조건이 참이면 if 내에 있는 블록이 실행되고 조건이 거짓이면 else 블록이 실행된다.
		                이를 통해 두 가지 상황에 따라 다른 동작을 수행할 수 있다.
		                if (조건) { 조건이 참일때 실행되는 코드
		                } 조건이 거짓일때 실행되는 코드                                                */
		
		int age = 60;
		if (age >= 60) {System.out.println("환갑잔치를 할거야.");}
		          else {System.out.println("아직 멀었네.");}
		
		int temp = 30;
		if (temp >= 25) {System.out.println("더운 날씨 예상됩니다.");}
		           else {System.out.println("적당한 날씨로 예상됩니다.");}
    }
}