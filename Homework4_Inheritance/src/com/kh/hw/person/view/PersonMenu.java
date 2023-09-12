package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();
	
	public void mainMenu() {
		System.out.println("메뉴를 선택하세요 : 1.학생메뉴 2.사원메뉴 9.끝내기");
		int menu = sc.nextInt();
	}
	
	public void studentMenu() {
		System.out.println("1.학생추가 2.학생보기 9.메인으로");
		int menu = sc.nextInt();
	}
	
	public void employeeMenu() {
		System.out.println("1.사원추가 2.사원보기 9.메인으로");
		int menu = sc.nextInt();
	}
	
	public void insertStudent() {
		
	}
	
	public void printStudent() {
		
	}
	
	public void insertEmployee() {
		
	}
	
	public void printEmployee() {
		
	}
}
