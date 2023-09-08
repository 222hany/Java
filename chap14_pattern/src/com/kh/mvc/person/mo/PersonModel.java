package com.kh.mvc.person.mo;

public class PersonModel {
	private String name;
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	//¸¸¾à¿¡ ÀÌ¸§ÀÌ ºóÄ­ÀÌ¸é "ºóÄ­ÀÔ´Ï´Ù." Ãâ·Â
	public void VaildName() {
		if (this.name == "") {
			this.name = "ºóÄ­ÀÔ´Ï´Ù.";
		}
	}
	
	//getter
	public String getName() {
		return name;
	}
	
}
