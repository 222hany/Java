package com.kh.scannersample;
import java.util.Scanner;

public class Scannersample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해 주세요.");
		int age = sc.nextInt(); //정수만 받는 next
		System.out.println("내 나이는 " + age + "살 입니다.");
		
		String name;
		String phonenumber;
		
		System.out.println("당신의 이름을 입력하세요. : ");
		name = sc.next();
		System.out.println("당신의 번호를 입력하세요. : ");
		phonenumber = sc.next(); //-넣지않기
		
		System.out.print("당신의 이름은 " + name + "입니다.");
		System.out.println("당신의 전화번호는 " + phonenumber + "입니다.");
		
		// 내 취미와 내가 좋아하는 음식과 내 주소 1개 출력하기
		String hobby;
		String favoriteFood;
		String address;
		
		System.out.println("당신의 취미는 무엇입니까?");
		hobby = sc.next();
		System.out.println("당신이 좋아하는 음식은 무엇입니까?");
		favoriteFood = sc.next();
		System.out.println("주소를 입력해 주세요.");
		address = sc.next();
		System.out.println("당신의 취미는 " + hobby + "입니다. 당신의 좋아하는 음식은 " + favoriteFood + "입니다. 당신의 주소는 " + address + " 입니다." );
	}

}
