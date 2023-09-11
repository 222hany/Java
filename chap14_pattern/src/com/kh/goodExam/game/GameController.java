package com.kh.goodExam.game;

import java.util.Scanner;

public class GameController {
	private GameModel model;
	private GameView view;
	
	public GameController(GameModel model, GameView view) {
		this.model = model;
		this.view = view;
	}
	
	public void runGame() {
		// 1. 웰컴 메세지
		view.displayMessage();
		
		// 2. 스캐너로 입력 값 호출
		Scanner sc = new Scanner(System.in);
		
		// 3. 컴퓨터가 생각한 숫자를 맞췄을 때
		while(true) { // false가 될 때 까지 반복
			view.diplayGuessPrompt();
			int guess = sc.nextInt();
			
			if(model.isCorrectGuess(guess)) {
			view.displayCorrectGuess();	
			view.displayAttmepts(model.getAttempts());
				break;
			} else {
		
		// 4. 컴퓨터가 생각한 숫자를 틀렸을 때
			view.displayIncorrectGuess();
			view.displayAttmepts(model.getAttempts());
			}
		}
		
		// 5. 게임종료
		view.displayGameOver();
	}
	public static void main(String[] args) {
		GameModel m = new GameModel();
		GameView v = new GameView();
		GameController c = new GameController(m, v);
		
		c.runGame();
	}
}
