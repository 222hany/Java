package com.kh.Switch;

import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		/*
		System.out.println("주문하실 번호를 선택해주세요.");
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페라떼");
		System.out.println("3. 아인슈페너");
		System.out.println("4. 그린티라떼");
		
		int choice = sc.nextInt();
		
		switch (choice) {
		       case 1 :
		    	   System.out.println("아메리카노 주문하셨습니다.");
		    	   break;
		       case 2 :
		    	   System.out.println("카페라떼 주문하셨습니다.");
		    	   break;
		       case 3 :
		    	   System.out.println("아인슈페너 주문하셨습니다.");
		    	   break;
		       case 4 :
		    	   System.out.println("그린티라떼 주문하셨습니다.");
		    	   break;
		       default :
		    	   System.out.println("잘못된 선택입니다. 다시 주문해주세요.");
		}*/
		
		int choice = sc.nextInt();
		boolean isChoice = false; // while은 false일때 조건이 실행되고 true일때 종료.
		while (!isChoice) { // 조건이 참인 동안 코드 블록을 반복적으로 실행.
			System.out.println("과자를 선택해주세요.");
			System.out.println("1. 새우깡");
			System.out.println("2. 감자깡");
			System.out.println("3. 고구마깡");
			System.out.println("4. 양파깡");
		
		switch (choice) {
		       case 1 :
		    	   System.out.println("새우깡을 주문하셨습니다.");
		    	   isChoice = true;
		    	   break;
		       case 2 :
		    	   System.out.println("감자깡을 주문하셨습니다.");
		    	   isChoice = true;
		    	   break;
		       case 3 :
		    	   System.out.println("고구마깡을 주문하셨습니다.");
		    	   isChoice = true;
		    	   break;
		       case 4 :
		    	   System.out.println("양파깡을 주문하셨습니다.");
		    	   isChoice = true;
		    	   break;
		       default :
		    	   System.out.println("잘못된 선택입니다. 다시 주문해주세요.");
		}
		}
		
		
	}

}
