package com.kh.goodExam.game;

public class GameView {
	private String startMsg = "숫자 맞추기 게임을 시작합니다~";
	private String guessMsg = "1에서 100 사이의 숫자를 맞춰보세요!";
	
	public void displayMessage() {
		System.out.println(startMsg);
		System.out.println(guessMsg);
	}
	// 1. 숫자 추측하는 값 입력하기
	private String insertNumMsg = "추측한 숫자를 입력하세요.";
	
	public void diplayGuessPrompt() {
		System.out.println(insertNumMsg);
	}
	
	// 2. 맞췄는지 틀렸는지
	private String correctMsg = "숫자를 맞췄습니다!";
	private String incorrectMsg = "숫자를 틀렸습니다! 다시 시도하세요~";
	
	public void displayCorrectGuess() {
		System.out.println(correctMsg);
	}
	
	public void displayIncorrectGuess() {
		System.out.println(incorrectMsg);
	}
	
	// 3. 시도횟수
	public void displayAttmepts(int attempts) {
		System.out.println("시도횟수 : " + attempts);
	}
	
	// 4. 게임종료
	private String ggMsg = "게임 종료";
	
	public void displayGameOver() {
		System.out.println(ggMsg);
	}
}
