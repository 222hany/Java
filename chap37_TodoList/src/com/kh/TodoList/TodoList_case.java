package com.kh.TodoList;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class TodoList_case {
	public static void main(String[] args) {
		Map<Integer, String> todoMap = new HashMap<>();
		int taskNum = 1;
		
		Scanner sc = new Scanner(System.in);
		// 할 일 목록적기
		
		while(true) {
			System.out.println("할 일을 선택하세요.");
			System.out.println("할 일 추가는 숫자 1을 넣어주세요.");
			System.out.println("할 일 변경은 숫자 2를 넣어주세요.");
			System.out.println("할 일 삭제는 숫자 3을 넣어주세요.");
			System.out.println("할 일 목록을 보려면 숫자 4를 넣어주세요.");
			System.out.println("종료하시려면 숫자 5를 넣어주세요.");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
				case 1:
					System.out.println("추가할 일을 작성해주세요.");
					String todoItem = sc.nextLine();
					todoMap.put(taskNum++, todoItem);
					System.out.println("할 일이 추가되었습니다.");
					break;
				case 2:
					System.out.println("변경할 일의 번호를 입력해주세요.");
					int changeNum = sc.nextInt();
					if(todoMap.containsKey(changeNum)) {
						System.out.println("변경 내용을 작성해주세요.");
						String changeItem = sc.nextLine();
						if(todoMap.containsKey(changeItem)) {
							todoMap.put(changeNum, changeItem);;
							System.out.println("할 일이 변경되었습니다.");
						}
					} else {
						System.out.println("잘못 선택하셨습니다.");
						}
					break;
				case 3:
					System.out.println("제거할 일의 번호를 입력해주세요.");
					int removeNum = sc.nextInt();
					if(todoMap.containsKey(removeNum)) {
						todoMap.remove(removeNum);
						System.out.println("할 일이 제거되었습니다.");
					}else {
						System.out.println("잘못 선택하셨습니다.");
						}
					break;
				case 4:
					System.out.println("할 일 목록 : ");
					for(Entry<Integer, String> entry : todoMap.entrySet()) {
						System.out.println(entry.getKey() + " : " + entry.getValue());
					}
					break;
				case 5:
					System.out.println("프로그램을 종료합니다.");
					System.out.println("반가웠어요. 다음에 만나요^^");
					sc.close();
					System.exit(0);
				default :
					System.out.println("올바른 선택이 아닙니다. 다시 선택해주세요.");
			}
		}
	}
}
