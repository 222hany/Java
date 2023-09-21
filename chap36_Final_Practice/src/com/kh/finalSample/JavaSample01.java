package com.kh.finalSample;

import java.util.Scanner;

public class JavaSample01 {
	public static void main(String[] args) {
		JavaSample01 java = new JavaSample01();
		java.inputText();
	}
	
	public void inputText() {
		Scanner sc = new Scanner(System.in);
		boolean a = true;
		while(a) { // true일 동안 돌아간다!!!
			System.out.println("문자열을 입력해주세요.");
			String str = sc.nextLine();
			if(str == "out") {
				break;
			} else {
				System.out.println(str.length());
			}
			sc.close();
		}
		System.out.println("Program Finish");
	}
}
