package com.kh.mvc.person.co;

import com.kh.mvc.person.mo.PersonModel;
import com.kh.mvc.person.vo.PersonView;

public class PersonController {
	private PersonModel model;
	private PersonView view;
	
	public PersonController(PersonModel model, PersonView view) {
		this.model = model;
		this.view = view;
	}
	
	//setter
	public void setModel(PersonModel model) {
		this.model = model;
	}
	public void setView(PersonView view) {
		this.view = view;
	}
	//getter
	public PersonModel getModel() {
		return model;
	}
	public PersonView getView() {
		return view;
	}
	//출력매소드
	public void updateView() {
		view.displayInfo(model.getName());
	}
}
