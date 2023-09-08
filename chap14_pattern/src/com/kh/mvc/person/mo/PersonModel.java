package com.kh.mvc.person.mo;

public class PersonModel {
	private String name;
	
	public PersonModel(String name) {
		this.name = name;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	//getter
	public String getName() {
		return name;
	}
	
}
