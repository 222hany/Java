package com.kh.pattern.mvc.Controller;

import com.kh.pattern.mvc.Model.StudentModel;
import com.kh.pattern.mvc.View.StudentView;

public class StudentController {
	private StudentModel studentmodel;
	private StudentView studentview;
	
	public StudentController(StudentModel studentmodel, StudentView studentview) {
		this.studentmodel = studentmodel;
		this.studentview = studentview;
	}
	
	//setter
	public void setStudentName(String name) {
		studentmodel.setName(name);
	}
	
	public void setStudentAge(int age) {
		studentmodel.setAge(age);
	}
	
	//getter
	public String getStudentName() {
		return studentmodel.getName();
	}
	public int getStudentAge() {
		return studentmodel.getAge();
	}
	
	//method
	public void updateView() {
		studentview.displayInfo(studentmodel.getName(), studentmodel.getAge());
	}

}
