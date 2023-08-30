package com.kh.If;

public class IfExam {

	public static void main(String[] args) {
		/* 이중 If문 (중첩 If문)
		If (조건식1) {
		   }If (조건식2) {
		       }If (조건식3) {
		            수행 될 문장;
		          } else If (조건식4) {
		                     수행 될 문장;
		} else {
		  수행 될 문장;
		}                             */
		
		int month = 9;
		int temp = -11;
		if (month == 1 || month == 2 || month == 12) {
			System.out.println("겨울");
			if (temp <= -15) {
				System.out.println("한파경보");
			} else if (temp <= -12) {
				System.out.println("한파주의보");
			}
		} else if (month >=3 && month <=5) {
			System.out.println("봄");
		} else if (month >= 6 && month <=8) {
			System.out.println("여름");
			if (temp >= 35) {
				System.out.println("폭염경보");
			} else if (temp >= 33) {
				System.out.println("폭염주의보");
			}
		} else if (month >=9 && month <=11) {
			System.out.println("가을");
		}
	}

}
