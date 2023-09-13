package com.kh.practice03.func;

import java.util.Scanner;

public class IfPractice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수를 입력해주세요.");
		int scoreOfKorean = sc.nextInt();
		System.out.println("수학점수를 입력해주세요.");
		int scoreOfMath = sc.nextInt();
		System.out.println("영어점수를 입력해주세요.");
		int scoreOfEnglish = sc.nextInt();
		
		if (scoreOfKorean >= 40 && scoreOfMath >= 40 && scoreOfEnglish >= 40 &&
				(((scoreOfKorean + scoreOfMath + scoreOfEnglish)/3 >= 60))) {
			System.out.println("국어점수 : " + scoreOfKorean + " 수학점수 : " + scoreOfMath + 
					" 영어점수 : " + scoreOfEnglish + " 합계 : " + (scoreOfKorean + scoreOfMath + scoreOfEnglish) +
					" 평균 : " + (scoreOfKorean + scoreOfMath + scoreOfEnglish)/3 + " 축하합니다! 합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		

	}

}