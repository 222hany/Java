package com.kh.todoList;

public class ToDoListModel {
	// 할 일 목록
	private String items;
	// 목록의 아이템
	private String item;
	// 아이템 더하고 빼기
	public ToDoListModel(String text) {
		this.item = text;
	}
	
	public String getItem() {
		return item;
	}
}
