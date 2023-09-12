package com.kh.hw.person.model.vo;

public class Employee extends Person{
	private int salary;
	private String dept;
	
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(name, age, height, weight);
		this.salary = salary;
		this.dept = dept;
	}
	
	//setter
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	//getter
	public int getSalary() {
		return salary;
	}
	public String getDept() {
		return dept;
	}
}
