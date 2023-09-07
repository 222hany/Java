package com.kh.ArrayListSample;

import java.util.ArrayList;

//ToDoSample.java
//ArrayList 이용해서 할 일 3개, 수정 2개, 1개 지우기, 전부 다 삭제.
public class ToDoSample {

	public static void main(String[] args) {
		ArrayList<String> toDoList = new ArrayList<>();
		
		// 할 일 3개 추가
		toDoList.add("강아지 산책하기");
		toDoList.add("강아지 간식 주기");
		toDoList.add("강아지 배 쓰다듬기");
		System.out.println("나의 할 일 : " + toDoList);
		
		// 할 일 2개 수정하기
		toDoList.set(0, "집에서 강아지랑 넷플릭스 보기");
		System.out.println("비와서 산책하기를 수정 : " + toDoList);
		toDoList.set(2, "강아지 배방구 와랄라 갈기기");
		System.out.println("배 쓰다듬다가 너무 귀여워서 계획 바꾸기 : " + toDoList);
		
		// 할 일 1개 지우기
		toDoList.remove(1);
		System.out.println("강아지 간식 줬으니까 지우기 : " + toDoList);
		
		// ArrayList 순회해서 요소 출력
		System.out.println("**************************");
		System.out.println("이하니의 To Do List");
		for (String list : toDoList) {
			System.out.println(list);
		}
		System.out.println("**************************");
		
		// 전부 다 삭제하기
		toDoList.clear();
		System.out.println("모든 할 일 끝냈다! : " + toDoList);
		
	}

}
