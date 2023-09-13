package com.kh.practice03.func;

import java.util.Scanner;

public class IfPractice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 번호를 입력하세요.");
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		int button = sc.nextInt();
		
		//switch로 풀이
		/*switch (button) {
		       case 1 :
		    	   System.out.println("입력 메뉴입니다.");
		    	   break;
		       case 2 :
		    	   System.out.println("수정 메뉴입니다.");
		    	   break;
		       case 3 :
		    	   System.out.println("조회 메뉴입니다.");
		    	   break;
		       case 4 :
		    	   System.out.println("삭제 메뉴입니다.");
		    	   break;
		       case 7 :
		    	   System.out.println("프로그램이 종료됩니다.");
		    	   break;
		       default :
		    	   System.out.println("잘못된 선택입니다. 다시 입력해주세요.");*/
		
		//if로 풀이
		if (button == 1) {
			System.out.println("입력");
		} else if (button == 2) { //3.조회 4.삭제 7.종료");
			System.out.println("수정");
		} else if (button == 3) {
			System.out.println("조회");
		} else if (button == 4) {
			System.out.println("삭제");
		} else if (button == 7) {//else를 쓸 경우 조건을 넣지 못하기 때문에 else if 를 써야함
			System.out.println("프로그램이 종료됩니다.");
		} 
		
	}
}