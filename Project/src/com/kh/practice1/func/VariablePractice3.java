package com.kh.practice1.func;
import java.util.Scanner;

public class VariablePractice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//키보드로 가로,세로 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
		
		double width, height;
		System.out.print("가로의 길이는?");
		width = sc.nextDouble();
		System.out.print("세로의 길이는?");
		height = sc.nextDouble();
		
		//System.out.println("면적은 " + width*height + " 입니다.");
		//System.out.println("둘레는 " + (width+height)*2 + " 입니다.");
		
		//선생님 풀이
		double area = width*height;
		double round = (width+height)*2;
		System.out.println("면적은 " + area + " 입니다.");
		System.out.println("둘레는 " + round + " 입니다.");
	}

}
