package com.kh.TodoList;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
	private ArrayList<String> tasks;
	
	public TodoList() {
		tasks = new ArrayList<>();
	}
	
	public void addTask(String task) {
		tasks.add(task);
	}
	
	public void changeTask(int index, String task) {
		if(index >= 0 && index < tasks.size()) {
			tasks.set(index, task);
		}
	}
	
	public void removeTask(int index) {
		if(index >= 0 && index < tasks.size()) {
			tasks.remove(index);
		}else {
			System.out.println("잘못된 인덱스입니다.");
		}
	}
	
	public void clearTask() {
		tasks.clear();
		System.out.println("오늘 할 일을 모두 끝냈다!!!");
	}
	
	public void diplayTasks() {
		System.out.println("My TodoList");
		for(int i = 0; i < tasks.size(); i++) {
			System.out.println((i + 1) + "." + tasks.get(i));
		}
	}
	
	public static void main(String[] args) {
		TodoList todolist = new TodoList();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("할 일 추가:add, 할 일 수정:change, 삭제:remove, 할 일 끝내기:clear, 리스트 보기:list, 종료:exit 입력하세요.");
			String choice = sc.nextLine();
			
			if(choice.equalsIgnoreCase("add")) {
				System.out.println("할 일을 입력하세요.");
				String task = sc.nextLine();
				todolist.addTask(task);
			} else if(choice.equalsIgnoreCase("change")) {
				System.out.println("수정 할 일의 번호를 입력하세요.");
				int index = Integer.parseInt(sc.nextLine()) -1;
				System.out.println("할 일을 입력하세요.");
				String task = sc.nextLine();
				todolist.changeTask(index, task);
			} else if(choice.equalsIgnoreCase("remove")) {
				System.out.println("삭제 할 일 번호 입력하기");
				try {
					int index = Integer.parseInt(sc.nextLine()) -1;
					todolist.removeTask(index);
				} catch (Exception e) {
					System.out.println("유효하지 않은 입력입니다.");
				}
			} else if(choice.equalsIgnoreCase("clear")) {
				todolist.clearTask();
			} else if(choice.equalsIgnoreCase("list")) {
				todolist.diplayTasks();
			} else if(choice.equalsIgnoreCase("exit")) {
				break;
			} else {
				System.out.println("잘못된 명령입니다.");
			}
		}
		System.out.println("어플리케이션 종료");
		sc.close();
	}

}
