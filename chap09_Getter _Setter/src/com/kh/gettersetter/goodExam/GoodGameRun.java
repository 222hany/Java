package com.kh.gettersetter.goodExam;

public class GoodGameRun {

	public static void main(String[] args) {
		// 플레이 생성자 만들기
		GoodPlayer player1 = new GoodPlayer();
		player1.setName("KH");
		player1.ValidName();
		player1.setHealth(-10); // -10 체력을 저장
		player1.ValidHealth();  // -10 (내가 만든 코드)이 무결성인지 (결점이 없는지) 검증
		player1.setAttackPower(-20);
		player1.ValidAttackPower();
		player1.displayInfo();
		
		// 플레이어2에 valid 적용		
		GoodPlayer player2 = new GoodPlayer();
		player2.setName("");
		player2.ValidName();
		player2.setHealth(80);
		player2.ValidHealth();
		player2.setAttackPower(20);
		player2.ValidAttackPower();		
		player2.displayInfo();
				
		/*System.out.println("attack!!!! 후");
				
		player1.attack(player2);
		player2.attack(player1);*/

	}

}
