package com.kh.threadPractice;

import java.util.Random;

public class GameLoop implements Runnable{
	static boolean isGameOver = false;
	
	@Override
	public void run() {
		while(!isGameOver) {
			int randomValue = new Random().nextInt(10);
			System.out.println("임의의 숫자 : " + randomValue);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}System.out.println("게임을 종료하려면 enter를 눌러주세요.");
		}
	}
}
