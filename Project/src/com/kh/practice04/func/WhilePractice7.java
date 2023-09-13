package com.kh.practice04.func;
 
import java.util.Scanner;

public class WhilePractice7 {

	public static void main(String[] args) {
		// 사용자로부터 입력받은 숫자의 단을 입력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
		int result = num * i;
		System.out.println(result);
	}
}

}
