package com.kh.practice02.func;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//실수형으로 국어,영어,수학 세 과목의 점수를 입력받아 총점과 평균을 출력하세요.
		//이 때 총점과 평균은 정수형으로 처리하세요.
		
		double korean, english, math;
		
		System.out.print("국어점수를 입력해 주세요.");
		korean = sc.nextDouble();
		System.out.print("영어점수를 입력해 주세요.");
		english = sc.nextDouble();
		System.out.print("수학점수를 입력해 주세요.");
		math = sc.nextDouble();
		
		//System.out.print("총점은 " + ((int)korean+(int)english+(int)math) + "점 입니다.");
		//System.out.print("평균은 " + (((int)korean+(int)english+(int)math)/3) + "점 입니다.");
		
		//선생님 풀이
		int totalScore = (int) (korean+english+math);
		int averageScore = (int) (korean+english+math)/3;
		System.out.print("총점은 " + totalScore + "점 입니다. ");
	    System.out.print("평균은 " + averageScore + "점 입니다.");
		
		
	}

}