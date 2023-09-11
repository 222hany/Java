package com.kh.todoList;

public class ToDoListMain {

	public static void main(String[] args) {
		ToDoListModel model = new ToDoListModel("¾ÆÄ§¸Ô±â");
		ToDoListView view = new ToDoListView();
		
		view.diplayToDoList(model.getItem());
		System.out.println(model.getItem());
	}

}
