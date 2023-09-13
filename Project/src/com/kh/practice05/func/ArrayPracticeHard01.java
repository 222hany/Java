package com.kh.practice05.func;

import java.util.Scanner;

public class ArrayPracticeHard01 {

	public static void main(String[] args) {
		/* 사용자로부터 입력받은 하나의 값이 소수인지 판별하는 프로그램을 구현.
		   단, 입력한 수가 2보다 작은경우 "잘못 입력하셨습니다." 출력.
		   소수 : n을 1부터 n까지로 나누었을때 나누어 떨어지는 수가 1과 n뿐인 수. ex)2,3,5,7,11...
		   소수입니다 / 소수가 아닙니다 / 잘못 입력하셨습니다                                 */
		
		Scanner sc = new Scanner(System.in); // 입력받기 위해 불러오는 메소드
		System.out.println("숫자를 입력해주세요."); // 출력 메소드
		int num = sc.nextInt();
		int count = 1; // 소수가 아닐경우. count를 1로 초기화. 소수가 아닌수의 개수를 나타냄.
		
		if (num < 2) { //단, 입력한 수가 2보다 작은경우
			System.out.println("잘못 입력하셨습니다.");
		} else { //입력한 수가 2보다 클 경우
			boolean checkNum = true; // 소수인지 아닌지 판별하기 위한 boolean 변수 checkNum을 초기화 처음에는 소수 가정
			for (int i = 2; i <= num; i++ ) { // 2부터 num까지의 반복문 : 소수를 찾는 역할
				for (int j = 2; j*j <= i; j++) { // 입력받은 숫자가 아닌 현재숫자 i가 소수인지 판단하기 위한 반복문
					// 만약 i가 어떤 숫자 j로 나누어 떨어진다면 i가 j의 배수라면 i/j 역시 i의 약수 중 하나
					// 이때 i를 j보다 큰 숫자로 나눠 봤을때는 이미 j로 떨어지지 않기 때문에 i/j와  i/j보다 큰 다른 숫자
					// j가 i의 약수라면 i/j 역시 i의 약수이고, j는 i/j는 서로 다른 숫자가 됨
					// i가 소수인지 판별하기 위해 2부터 i-까지 모든 숫자 대신 2부터 i까지의 숫자로만 나눠봐도 소수여부 판별
					// j*j를 사용하는 것은 소수판별 알고리즘을 최적화 하기 위해 사용되는 방법
					// sqrt(i) : i의 제곱근을 나타내는 함수 소수를 판별할 떄 i가 소수인지 확인하기 위해 2부터 sqrt(i)까지의
					// 숫자로 나눠보면 계산량을 줄이고 효율적으로 소수판별가능.
					if (i % j == 0) { // 소수가 아닐경우
						checkNum = false;
						count++;
						break;
					} if (checkNum) {
						System.out.println(i); // 출력 메소드 작성
					}
					checkNum = true;
				}
				System.out.println("소수의 총 갯수 : " + (num - count)); // 모든 숫자 검사가 끝난 후, 
			}
		}
		
		

	}

}
