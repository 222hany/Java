package com.kh.goodExam.game;
// 랜덤 숫자맞추기 게임 모델
public class GameModel {
	private int secretNumber; // 숨겨진 번호
	private int attempts;     // 몇 번 시도했는가
	
	public GameModel() {
		secretNumber = (int)(Math.random() *100) + 1; // 1에서 100 사이의 무작위 숫자 생성
		attempts = 0; // 최초시도는 0번
	}
	public int getSecretNumber() {  // 컴퓨터가 랜덤으로 추측한 숫자 1개
		return secretNumber;
	}
	
	public int getAttempts() {
		return attempts;
	}
	
	public void incrementAttempts() {
		attempts++;
	}
	
	public boolean isCorrectGuess(int guess) {
		incrementAttempts();  // guess가 값을 입력했기 때문에 증가 매소드를 추가
		return guess == secretNumber;
	}
}
