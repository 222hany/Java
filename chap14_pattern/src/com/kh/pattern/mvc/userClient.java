package com.kh.pattern.mvc;
import com.kh.pattern.mvc.Controller.userController;
//MVC 패턴을 사용해서 학생정보를 다루는 곳
import com.kh.pattern.mvc.Model.userModel;
import com.kh.pattern.mvc.View.userView;

public class userClient {

	public static void main(String[] args) {
		// 모델 객체를 생성
		userModel user = new userModel("홍길동", 20);
		
		// 뷰 객체를 생성
		userView view = new userView();
		
		// 컨트롤러 객체 생성 및 모델 뷰 설정
		userController controller = new userController(user, view);
		
		// 유저 정보를 출력
		controller.updateView();
		
		//유저 정보 업데이트
		//controller.setuserName("이순신");
		//controller.setuserAge(30);
				
		//업데이트 된 유저 정보 출력
		controller.updateView();
		
	}

}
