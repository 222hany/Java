package com.kh.objexam1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PracticeMain3 {

	public static void main(String[] args) {
		PracticeMain3 pm = new PracticeMain3();
		//pm.practice1();
		//pm.practice2();
		//pm.practice3();
		//pm.practice4();
		pm.practice5();
	}
	
	public void practice1() {
		// 년-월-일
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String forDate = sdf.format(currentDate);
		System.out.println(forDate);
	}
	
	public void practice2() {
		// 시-분-초
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH-mm-ss");
		String forDate = sdf.format(currentDate);
		System.out.println(forDate);
	}

	public void practice3() {
		// 월-일
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		String forDate = sdf.format(currentDate);
		System.out.println(forDate);
	}
	
	public void practice4() {
		// 년-시
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-HH");
		String forDate = sdf.format(currentDate);
		System.out.println(forDate);
	}
	
	public void practice5() {
		// 년-월-일-요일
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-(E)");
		String forDate = sdf.format(currentDate);
		System.out.println(forDate);
	}

}
