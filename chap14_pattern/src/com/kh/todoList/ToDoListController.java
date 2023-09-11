package com.kh.todoList;

public class ToDoListController {
	ToDoListModel model;
	ToDoListView view;
	
	public ToDoListController(ToDoListModel model, ToDoListView view) {
		this.model = model;
		this.view = view;
	}
}
