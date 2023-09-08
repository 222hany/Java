package com.kh.mvc.circle;

import com.kh.mvc.circle.co.CircleController;
import com.kh.mvc.circle.mo.CircleModel;
import com.kh.mvc.circle.vo.CircleView;

public class CircleMain {

	public static void main(String[] args) {
		CircleModel model = new CircleModel(0.5);
		CircleView view = new CircleView();
		CircleController controller = new CircleController(model, view);
		
		controller.run();
	}

}
