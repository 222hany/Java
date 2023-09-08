package com.kh.mvc.circle.co;

import com.kh.mvc.circle.mo.CircleModel;
import com.kh.mvc.circle.vo.CircleView;

public class CircleController {
	private CircleModel model;
	private CircleView view;
	
	public CircleController(CircleModel model, CircleView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setModel(CircleModel model) {
		this.model = model;
	}
	public void setView(CircleView view) {
		this.view = view;
	}

	public CircleModel getModel() {
		return model;
	}
	public CircleView getView() {
		return view;
	}
	
	public void run() {
		
	}
}
