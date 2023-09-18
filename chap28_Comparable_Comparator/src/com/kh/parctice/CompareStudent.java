package com.kh.parctice;

import java.util.ArrayList;
import java.util.List;

public class CompareStudent {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("이하니", 20));
		students.add(new Student("신재평", 22));
		students.add(new Student("이장원", 22));
		
		for(Student std : students) {
			System.out.println(std);
		}
	}
}
