package com.kh.calculatorMVC;

public class Main {

	public static void main(String[] args) {
		// Model View Controller 가져오기
		CalculatorModel model = new CalculatorModel();
		CalculatorView view = new CalculatorView();
		CalculatorController controller = new CalculatorController(model, view);
		
		// 컨트롤러 실행
		controller.run();
	}

}
