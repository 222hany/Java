package com.kh.objexam1;

import java.util.Scanner;

public class PracticeMain {

	public static void main(String[] args) {
		// practice1();
		PracticeMain pm = new PracticeMain();
		pm.practice1();
	
	}	
	public void practice1() {
		// Scanner 이용해서 구현
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 문자열을 입력하세요");
		String str1 = sc.nextLine();
		System.out.println("두 번째 문자열을 입력하세요");
		String str2 = sc.nextLine();
		
		sc.close();
		
		// 객체 비교
		if(str1.equals(str2)) {
			System.out.println("두 문자열은 같습니다.");
		} else {
			System.out.println("두 문자열은 다릅니다.");
		}

		// hashCode() 매소드를 사용하여 객체의 해시코드 출력
		int hashcode1 = str1.hashCode();
		int hashcode2 = str2.hashCode();
		System.out.println("str1의 해시코드 : " + hashcode1);
		System.out.println("str2의 해시코드 : " + hashcode2);
				
		// toString() 매소드를 사용하여 객체를 문자열로 표현
		String str1String = str1.toString();
		String str2String = str2.toString();
		System.out.println("str1의 문자열 표현 : " + str1String);
		System.out.println("str2의 문자열 표현 : " + str2String);
				
		// getClass() 매소드를 사용하여 객체의 클래스정보 출력
		Class<?> classOfstr1 = str1.getClass();
		Class<?> classOfstr2 = str2.getClass();
		System.out.println("str1 클래스 : " + classOfstr1);
		System.out.println("str2 클래스 : " + classOfstr2);

	}
	

}
