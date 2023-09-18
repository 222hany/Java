package com.kh.threadPractice;

import java.io.IOException;

public class GameMain extends GameLoop{
	
	public static void main(String[] args) {	
		Thread gameThread = new Thread(new GameLoop());
		gameThread.start();
		
		try {
			System.in.read();
			isGameOver = true;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
