package com.kh.pattern.mvc.Controller;

import com.kh.pattern.mvc.Model.userModel;
import com.kh.pattern.mvc.View.userView;

// 모델과 뷰를 연결하는 곳
// 사용자 입력을 처리하는 곳

public class userController {
	private userModel usermodel; // 임포트 시키기
	private userView userview;
	
	public void setUsermodel(userModel usermodel) {
		this.usermodel = usermodel;
	}
	public void setUserview(userView userview) {
		this.userview = userview;
	}
	
	
	public userModel getUsermodel() {
		return usermodel;
	}
	public userView getUserview() {
		return userview;
	}
	
	public userController(userModel model, userView view) {
		this.usermodel = model;
		this.userview = view;
	}
	
	public void updateView() {
		userview.displayInfo(usermodel.getName(), usermodel.getAge());
	}
	
	public static void main(String[] args) {
	}

}
