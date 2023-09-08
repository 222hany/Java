package com.kh.pattern.mvc;

import com.kh.pattern.mvc.Controller.StudentController;
import com.kh.pattern.mvc.Model.StudentModel;
import com.kh.pattern.mvc.View.StudentView;

public class StudentClient {
	
	public static void main(String[] args) {
		// 1. 모델객체 생성 Model
		StudentModel model = new StudentModel("박학생", 17);
		// 2. 뷰 객체 생성 View
		StudentView view = new StudentView();
		// 3. 컨트롤러 객체 생성 Controller(모델, 뷰 설정)
		StudentController controller = new StudentController(model, view);
		// 4. 학생 정보 업데이트 & 출력
		controller.updateView();
		// 5. 학생 정보 업데이트
		controller.setStudentName("업데이트");
		controller.setStudentAge(18);
		// 6. 업데이트 된 학생정보 출력
		controller.updateView();
	}

}
