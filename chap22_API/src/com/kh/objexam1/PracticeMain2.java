package com.kh.objexam1;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 pm = new PracticeMain2();
		//pm.practice1();
		//pm.practice2();
		//pm.practice3();
		//pm.practice4();
		pm.practice5();
	}
	
	public void practice1() {
		// ¹®ÀÚ¿­ µ¡ºÙÀÌ±â Ãâ·Â append
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã ");
		sb.append("Àú³á ¹¹¸ÔÁö");
		System.out.println(sb.toString());
	}
	
	public void practice2() {
		// ¹®ÀÚ¿­ µÚÁı±â reverse
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã Àú³á ¹¹¸ÔÁö");
		sb.reverse();
		System.out.println(sb.toString());
	}
	
	public void practice3() {
		// »ğÀÔ insert
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã Àú³á ¹¹¸ÔÁö?");
		sb.insert(10, "¤¾¤¾");
		System.out.println(sb.toString());
	}
	
	public void practice4() {
		// ´ëÃ¼ replace
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã Àú³á ¹¹¸ÔÁö?¤¾¤¾");
		sb.replace(10, 12, ",,");
		System.out.println(sb.toString());
	}
	
	public void practice5() {
		// »èÁ¦ delete
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã Àú³á ¹¹¸ÔÁö?,,");
		sb.delete(10, 12);
		System.out.println(sb.toString());
	}

}
